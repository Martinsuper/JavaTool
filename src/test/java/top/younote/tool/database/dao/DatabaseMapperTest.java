package top.younote.tool.database.dao;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import top.younote.tool.database.pojo.DataBaseTable;
import top.younote.tool.database.pojo.DatabaseTableVO;

import java.util.List;

/**
 * @Description:
 * @Author: duanluyao
 * @CreateTime: 2020/11/26 17:27:53
 */
@SpringBootTest
class DatabaseMapperTest {
    @Autowired
    DatabaseMapper databaseMapper;
    @Test
    void getDatabaseList() {
        DatabaseTableVO vo = new DatabaseTableVO();
        vo.setDatabaseName("learn_database");
        vo.setTableName("bd_info");
        List<DataBaseTable> list =  databaseMapper.getDatabaseList(vo);
        list.forEach(System.out::println);
    }
    @Test
    void getDatabaseTableList(){
        DatabaseTableVO vo = new DatabaseTableVO();
        vo.setDatabaseName("learn_database");
        vo.setTableName("bd_info");
        List<DatabaseTableVO> list = databaseMapper.getDatabaseTableList(vo);
        list.forEach(System.out::println);
    }
}