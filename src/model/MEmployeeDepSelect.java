
package model;

import java.sql.*;

public class MEmployeeDepSelect {
    ResultSet rs;
    public <A>ResultSet msearchByDepNo(A depno){
        try{
            Statement st = MDBConnection.getConnection().createStatement();
            rs = st.executeQuery("select * from department where dep_no = '"+depno+"'");
            
        }catch(SQLException e){
            System.err.println(e.getMessage());
        }
        return rs;
    }
}
