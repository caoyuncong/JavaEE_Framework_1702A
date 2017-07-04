package demo;

import com.mysql.jdbc.Driver;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

/**
 * Created by mingfei.net@gmail.com
 * 7/4/17 16:48
 * https://github.com/thu/JavaEE_Framework_1702A/
 */
public class JdbcTest {
    public static void main(String[] args) throws SQLException {
        new Driver();
        Connection connection = DriverManager.getConnection("jdbc:mysql:///?user=root&password=system");

        String username = "Tom";
        String password = "123";

        String sql = "INSERT INTO db_test.user VALUE(NULL, ?, ?)";

        PreparedStatement preparedStatement = connection.prepareStatement(sql);
    }
}
