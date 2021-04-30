package top.younote.tool.database.dao;

import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;
import top.younote.tool.database.pojo.DataBaseTable;
import top.younote.tool.database.pojo.DatabaseTableVO;

import java.util.List;

/**
 * @Description: 数据库操作
 * @Author: duanluyao
 * @CreateTime: 2020/11/26 17:10:04
 */
@Mapper
@Repository
public interface DatabaseMapper {
    /**
     * 查询数据表信息
     * @param vo
     * @return
     */
    List<DataBaseTable> getDatabaseList(DatabaseTableVO vo);

    /**
     * 查询数据库所有表列表
     * @param vo
     * @return
     */
    List<DatabaseTableVO> getDatabaseTableList(DatabaseTableVO vo);

    /**
     * 查询数据库表备注信息
     * @param vo
     * @return
     */
    String getDatabaseTableComment(DatabaseTableVO vo);
}
