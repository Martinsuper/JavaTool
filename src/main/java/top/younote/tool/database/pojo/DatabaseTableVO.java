package top.younote.tool.database.pojo;

import lombok.Data;

/**
 * @Description:
 * @Author: duanluyao
 * @CreateTime: 2020/11/26 17:21:36
 */
@Data
public class DatabaseTableVO {
    /**
     * 数据库名称
     */
    private String databaseName;
    /**
     * 表名称
     */
    private String tableName;
}
