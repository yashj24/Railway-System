
package connect;
import java.sql.*;
public class myConnection
{
    static Connection con=null;
    static
    {
        try
        {    
         Class.forName("com.mysql.jdbc.Driver");

        }
        catch(Exception e)
        {
            System.out.println(e);
        }    
    }
   public static Connection getConnection() throws SQLException
   {
        con=DriverManager.getConnection("jdbc:mysql://localhost:3306/railway", "root","root");
        return(con);     
   }
}
