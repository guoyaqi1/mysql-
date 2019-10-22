/**
 * Created by Administrator on 2019/10/22 0022.
 */
import java.sql.Statement;
import java.sql.ResultSet;
public class DBTest {
    public static void main(String[] args) throws Exception{
        Statement statement = MySqlDAO.getStatement();
        String sql1 = "create table student(no int primary key, name char(20))";
        String sql2 = "insert into student values(201604755,'郭雅琦')";
        statement.execute(sql1);
        statement.execute(sql2);
        /*String sql3 = "select * from student where no = 1";
        ResultSet resultSet=statement.executeQuery(sql3);
        while(resultSet.next())
        {
            System.out.println("学号："+resultSet.getInt("sno"));
            System.out.println("姓名："+resultSet.getString(2));
        }*/
        statement.close();
    }
}
