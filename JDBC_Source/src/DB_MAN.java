import java.sql.*;
import java.io.*;
import java.util.*;

public class DB_MAN {
    String strDriver = "sun.jdbc.odbc.JdbcOdbcDriver";
    String strURL = "jdbc:odbc:Automobile64";
    
    Connection DB_con;      // DB Connection
    Statement DB_stmt;      // To store statement for DB Connection
    ResultSet DB_rs;        // To sotre result of SQL Excution
    
    public void dbOpen() throws IOException{
        try{
            Class.forName(strDriver);                       // Load JDBC-ODBC bridge driver
            DB_con = DriverManager.getConnection(strURL);   // Setting DSN Prooerties in driver
            DB_stmt = DB_con.createStatement();             // To create statement for DB Connection
        } catch (Exception e){
            System.out.println("SQLException : " + e.getMessage());
        }
    }
    
    public void dbClose() throws IOException{
        try{
            DB_stmt.close();        // Exit Statement Connection
            DB_con.close();         // Exit DB Connection
        } catch (Exception e){
            System.out.println("SQLexception : " + e.getMessage());
        }
    }
}
