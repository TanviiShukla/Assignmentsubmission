
package assignmentsubmission;
import java.sql.*;
public class JDBCCon {
    public Connection getConnection()throws Exception{
        Class.forName("com.mysql.jdbc.Driver");
        Connection con=DriverManager.getConnection(
                "jdbc:mysql://localhost:3306/mydbs","root","root" );
        System.out.println("database connected");
        return con;
    }
                          }