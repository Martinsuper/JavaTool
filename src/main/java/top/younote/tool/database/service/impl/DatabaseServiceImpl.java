package top.younote.tool.database.service.impl;

import com.alibaba.excel.EasyExcel;
import com.alibaba.excel.ExcelWriter;
import com.alibaba.excel.write.metadata.WriteSheet;
import com.alibaba.excel.write.metadata.WriteTable;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import top.younote.tool.database.dao.DatabaseMapper;
import top.younote.tool.database.pojo.DataBaseTable;
import top.younote.tool.database.pojo.DatabaseTableVO;
import top.younote.tool.database.service.DatabaseService;

import java.util.Collections;
import java.util.List;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.stream.Collectors;

/**
 * @Description:
 * @Author: duanluyao
 * @CreateTime: 2020/11/26 18:02:20
 */
@Service
public class DatabaseServiceImpl implements DatabaseService {
    @Autowired
    DatabaseMapper databaseMapper;

    /**
     * 查询数据库中所有表名称
     *
     * @param databaseName
     * @return
     */
    @Override
    public List<String> getDatabaseTableList(String databaseName) {
        DatabaseTableVO vo = new DatabaseTableVO();
        vo.setDatabaseName(databaseName);
        List<DatabaseTableVO>  databaseTableList = databaseMapper.getDatabaseTableList(vo);
        return databaseTableList.stream().map(DatabaseTableVO::getTableName).collect(Collectors.toList());
    }

    /**
     * 查询数据库表信息
     *
     * @param vo
     * @return
     */
    @Override
    public void getDatabaseTableInfo(DatabaseTableVO vo) {
        String fileName = "数据库字段信息.xlsx";
        ExcelWriter excelWriter = null;
        try {
            excelWriter = EasyExcel.write(fileName, DataBaseTable.class).build();
            // 把sheet设置为不需要头 不然会输出sheet的头 这样看起来第一个table 就有2个头了
            WriteSheet writeSheet = EasyExcel.writerSheet(vo.getDatabaseName()).needHead(Boolean.FALSE).build();
            List<String> dataBaseTableList = getDatabaseTableList(vo.getDatabaseName());
            AtomicInteger cnt = new AtomicInteger();
            ExcelWriter finalExcelWriter = excelWriter;
            dataBaseTableList.forEach(res -> {
                vo.setTableName(res);
                List<DataBaseTable> curDatabaseTableList = databaseMapper.getDatabaseList(vo);
                WriteTable writeTable = EasyExcel.writerTable(cnt.getAndIncrement()).needHead(Boolean.TRUE).build();
                finalExcelWriter.write(curDatabaseTableList,writeSheet,writeTable);
                EasyExcel.write(fileName).sheet(fileName).doWrite(Collections.singletonList(res));
            });
        } finally {
            // 千万别忘记finish 会帮忙关闭流
            if (excelWriter != null) {
                excelWriter.finish();
            }
        }
    }
}
