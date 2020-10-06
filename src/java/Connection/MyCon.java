package Connection;

import java.sql.Connection; 
import java.sql.DriverManager; 
import java.sql.SQLException;

public class MyCon{
        static Connection con = null; 
        static{
          try
              { 
                      Class.forName("com.mysql.jdbc.Driver");
                      System.out.println("Driver load...........");
                
               }catch (ClassNotFoundException e) {
                      System.out.println(e);
               }  
        }
    
    public static Connection getConnection(){
        try {
               con = DriverManager.getConnection("jdbc:mysql://localhost:3306/resultm", "resultm", "root");
               System.out.println("Data base Conneted.........");
               
        }catch (SQLException e) {
            System.out.println(e);
        } 
       return con;
    }
}

