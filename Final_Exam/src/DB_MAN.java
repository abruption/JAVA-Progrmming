import java.sql.*;
import java.io.*;
import java.util.*;

public class DB_MAN {
   String strDriver = "com.mysql.cj.jdbc.Driver";           // MS-SQL JDBC Driver
   String strURL = "jdbc:mysql://localhost:3306/mydb?useSSL=false&serverTimezone=UTC"; // MS-SQL JDBC Url
   String strUser = "root";                                                       // User ID
   String strPWD = "1234";                                                  // Password
    
    Connection conn = null;      // DB Connection
    Statement stat = null;      // To store statement for DB Connection
    ResultSet rs = null;        // To sotre result of SQL Excution
    
    public void dbOpen() throws IOException{
        try{
            Class.forName(strDriver);                       // Load JDBC-ODBC bridge driver
            conn = DriverManager.getConnection(strURL, strUser, strPWD);   // Setting DSN Prooerties in driver            
            stat = conn.createStatement();
        } catch (Exception e){
            System.out.println("SQLException : " + e.getMessage());
        }
    }
    
    public void dbClose() throws IOException{
        try{
            stat.close();        // Exit Statement Connection
            conn.close();         // Exit DB Connection
        } catch (Exception e){
            System.out.println("SQLException : " + e.getMessage());
        }
    }
}
