package top.younote.tool.database.dao;

import com.alibaba.excel.EasyExcel;
import com.alibaba.excel.EasyExcelFactory;
import com.alibaba.excel.ExcelWriter;
import com.alibaba.excel.write.metadata.WriteSheet;
import com.alibaba.excel.write.metadata.WriteTable;
import com.alibaba.fastjson.JSONObject;
import lombok.extern.slf4j.Slf4j;
import org.assertj.core.util.Lists;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import top.younote.tool.database.pojo.DataBaseTable;
import top.younote.tool.database.pojo.DatabaseTableVO;
import top.younote.tool.database.service.DatabaseService;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.sql.Timestamp;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 * @Description:
 * @Author: duanluyao
 * @CreateTime: 2020/11/26 17:27:53
 */
@SpringBootTest
@Slf4j
class DatabaseMapperTest {
    @Autowired
    DatabaseMapper databaseMapper;
    @Autowired
    DatabaseService databaseService;

    @Test
    void getDatabaseList() {
        DatabaseTableVO vo = new DatabaseTableVO();
        vo.setDatabaseName("learn_database");
        vo.setTableName("bd_info");
        List<DataBaseTable> list = databaseMapper.getDatabaseList(vo);
        list.forEach(System.out::println);
    }

    @Test
    void getDatabaseTableList() {
        DatabaseTableVO vo = new DatabaseTableVO();
        vo.setDatabaseName("learn_database");
        vo.setTableName("bd_info");
        databaseService.getDatabaseTableInfo(vo);
    }

    @Test
    void getDatabaseTableCommentTest() {
        DatabaseTableVO vo = new DatabaseTableVO();
        vo.setDatabaseName("learn_database");
        vo.setTableName("bd_info");
        log.error(databaseMapper.getDatabaseTableComment(vo));
    }

    @Test
    void easyExcelTest(){
        String fileName = "test.xlsx";
        // 这里 需要指定写用哪个class去读，然后写到第一个sheet，名字为模板 然后文件流会自动关闭
        // 如果这里想使用03 则 传入excelType参数即可
        List<DataBaseTable> list = new ArrayList<>();
        DataBaseTable table = new DataBaseTable();
        table.setFieldDefaultValue("1");
        list.add(table);
        EasyExcel.write(fileName, DataBaseTable.class).sheet("模板").doWrite(list);
    }
    @Test
    void test(){
        String str = "123";
        System.out.println(str.contains("1"));
    }

}