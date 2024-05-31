
package model;

import java.sql.*;

public class MEmployeeDepSelect {
    ResultSet rs;
    public <A>ResultSet msearchByDepNo(A depno){
        try{
            Statement st = MDBConnection.getConnection().createStatement(); //calling getConnection method in MDBConnection class and getting it as a return
            rs = st.executeQuery("select * from department where dep_no = '"+depno+"'"); //sql query
            
        }catch(SQLException e){
            System.err.println(e.getMessage());
        }
        return rs;
    }
}
