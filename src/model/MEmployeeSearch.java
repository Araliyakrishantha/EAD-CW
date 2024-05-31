
package model;

import java.sql.*;

public class MEmployeeSearch {
    ResultSet rs;
    public <A>ResultSet msearchByEmpNo(A empno){
        try{
            Statement st = MDBConnection.getConnection().createStatement();
            rs = st.executeQuery("select * from employee where emp_no = '"+empno+"'"); //sql query
            
        }catch(SQLException e){
            System.err.println(e.getMessage());
        }
        return rs;
    }
}
