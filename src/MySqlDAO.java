/**
 * Created by Administrator on 2019/10/22 0022.
 */
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class MySqlDAO {
    public static Connection getConnection()  throws Exception{
        String driverName = "com.mysql.jdbc.Driver";
        String url = "jdbc:mysql://localhost:3306/teaching";
        String userName = "root";
        String password = "";
        Class.forName(driverName);
        Connection con = DriverManager.getConnection(url, userName, password);
        return con;
    }
    public static Statement getStatement() throws Exception{
        Statement stmt = getConnection().createStatement();
        return stmt;
    }
}
