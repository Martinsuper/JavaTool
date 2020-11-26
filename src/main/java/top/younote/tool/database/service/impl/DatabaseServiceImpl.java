package top.younote.tool.database.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import top.younote.tool.database.dao.DatabaseMapper;
import top.younote.tool.database.pojo.DataBaseTable;
import top.younote.tool.database.pojo.DatabaseTableVO;
import top.younote.tool.database.service.DatabaseService;

import java.util.List;
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
    public List<DataBaseTable> getDatabaseTableInfo(DatabaseTableVO vo) {
        List<DataBaseTable> dataBaseTableList = databaseMapper.getDatabaseList(vo);
        writeToCsv(dataBaseTableList);
        return dataBaseTableList;
    }
    private void writeToCsv(List<DataBaseTable> dataBaseTables){

    }
}
