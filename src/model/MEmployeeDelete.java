
package model;

import java.sql.*;
import javax.swing.JOptionPane;

public class MEmployeeDelete {
     public <A> void mdeleteEmployee(A empno){
        try{
            Statement st = MDBConnection.getConnection().createStatement();
            int row_count = st.executeUpdate("delete from employee where emp_no='"+empno+"'");
            if(row_count>0){
                JOptionPane.showMessageDialog(null, "Employee is deleted");
            }else{
                JOptionPane.showMessageDialog(null, "Can't delete. EmpNo doesn't exist in database, check again!","Error",JOptionPane.ERROR_MESSAGE);
            }
        }catch(SQLException e){
            System.out.println(e.getMessage());
        }
    }
}
