
package model;

import java.sql.*;

public class MDBConnection {
    private static Connection con;
    public static Connection getConnection(){ // return tyoe is Connection. ststic is use for this method because we don't neet to create all the time we access to the database
        try{
           String dbpath = "jdbc:mysql://localhost/salary"; //defining the database path
           con = DriverManager.getConnection(dbpath,"root",""); //in database username is root and password is null
           
       }catch(SQLException exe){
           System.err.println("Exception " + exe.getMessage());
       }
    return con;
    }
}
