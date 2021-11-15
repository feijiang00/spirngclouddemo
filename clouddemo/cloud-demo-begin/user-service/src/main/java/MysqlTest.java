import org.junit.Test;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 * @author 15847
 * @title: mysqlTest
 * @projectName cloudnote
 * @description: TODO
 * @date 2021/11/1513:00
 */
public class MysqlTest {

    @Test
    public void test() throws SQLException, ClassNotFoundException {

        //注册驱动
        Class.forName("com.mysql.cj.jdbc.Driver");

        Connection connection = DriverManager.getConnection("jdbc:mysql://47.96.11.4:3306/test_cloud_order","root",
                "fff60dadece0369e");

        System.out.println(connection);
    }
}
