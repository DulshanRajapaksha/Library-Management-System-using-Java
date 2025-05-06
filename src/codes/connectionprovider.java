
package codes;
import java.sql.*;


public class connectionprovider {
    public static Connection getcon(){
      try
      {
          Class.forName("com.mysql.jdbc.Driver");
          Connection conn=DriverManager.getConnection("jdbc:mysql://localhost:3306/lms","root","");
          return conn;
      }
      catch(Exception e){
          System.out.println(e);
          return null;
      }
    }

    public static Connection connect() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
    
}
