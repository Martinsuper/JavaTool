package top.younote.tool.database.pojo;

import com.alibaba.excel.annotation.ExcelProperty;
import com.alibaba.excel.annotation.write.style.ColumnWidth;
import com.alibaba.excel.annotation.write.style.HeadRowHeight;
import lombok.Data;

/**
 * @Description: 数据库表字段信息实体类
 * @Author: duanluyao
 * @CreateTime: 2020/11/26 17:05:32
 */
@Data
@HeadRowHeight(20)
@ColumnWidth(25)
public class DataBaseTable {
    /**
     * 字段名称
     */
    @ExcelProperty("字段名称")
    private String fieldName;
    /**
     * 字段描述
     */
    @ExcelProperty("字段描述")
    private String fieldDesc;
    /**
     * 字段类型
     */
    @ExcelProperty("字段类型")
    private String fieldType;
    /**
     * 字段默认值
     */
    @ExcelProperty("字段默认值")
    private String fieldDefaultValue;
    /**
     * 是否是主键
     */
    @ExcelProperty("是否是主键")
    private String isPrimaryKey;
    /**
     * 是否非空
     */
    @ExcelProperty("是否非空")
    private String isNotNull;
}
