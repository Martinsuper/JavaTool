package top.younote.tool.database.service;

import top.younote.tool.database.pojo.DataBaseTable;
import top.younote.tool.database.pojo.DatabaseTableVO;

import java.util.List;

/**
 * @Description:
 * @Author: duanluyao
 * @CreateTime: 2020/11/26 18:01:42
 */

public interface DatabaseService {
    /**
     * 查询数据库中所有表名称
     * @param databaseName
     * @return
     */
    List<String> getDatabaseTableList(String databaseName);

    /**
     * 查询数据库表信息
     * @param vo
     * @return
     */
    List<DataBaseTable> getDatabaseTableInfo(DatabaseTableVO vo);
}