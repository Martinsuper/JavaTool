package top.younote.tool.database.pojo;

import lombok.Data;

/**
 * @Description: 数据库表字段信息实体类
 * @Author: duanluyao
 * @CreateTime: 2020/11/26 17:05:32
 */
@Data
public class DataBaseTable {
    /**
     * 字段名称
     */
    private String fieldName;
    /**
     * 字段描述
     */
    private String fieldDesc;
    /**
     * 字段类型
     */
    private String fieldType;
    /**
     * 是否是主键
     */
    private String isPrimaryKey;
    /**
     * 是否非空
     */
    private String isNotNull;
}
