
package model;

import java.sql.*;

public class MDBConnection {
    private static Connection con;
    public static Connection getConnection(){
        try{
           String dbpath = "jdbc:mysql://localhost/salary";
           con = DriverManager.getConnection(dbpath,"root","");
           
       }catch(SQLException exe){
           System.err.println("Exception " + exe.getMessage());
       }
    return con;
    }
}
