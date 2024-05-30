
package model;

import java.sql.*;

public class MEmployeeTitle {
    ResultSet rs;
    public <A>ResultSet msearchByTitle(A title){
        try{
            Statement st = MDBConnection.getConnection().createStatement();
            rs = st.executeQuery("select * from title where title_name = '"+title+"'");
            
        }catch(SQLException e){
            System.err.println(e.getMessage());
        }
        return rs;
    }
}
