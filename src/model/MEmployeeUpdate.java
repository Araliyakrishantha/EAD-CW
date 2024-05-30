
package model;

import java.sql.*;
import java.util.*;
import javax.swing.JOptionPane;

public class MEmployeeUpdate {
    public <A,B,C> void mupdateEmployee(A empno,A name,A address,B tel,A gender,C basic_sal,A depno, A title, C etf, C epf, C net_sal){
        try{
            Statement st = MDBConnection.getConnection().createStatement();
            int row_count = st.executeUpdate("update employee set emp_name='"+name+"',emp_address='"+address+"',emp_tel='"+tel+"',emp_gender='"+gender+"',emp_basic='"+basic_sal+"',d_no='"+depno+"',title='"+title+"',etf='"+etf+"',epf='"+epf+"',net_salary='"+net_sal+"' where emp_no='"+empno+"'");
            if(row_count>0){
                JOptionPane.showMessageDialog(null, "Employee is updated");
            }else{
                JOptionPane.showMessageDialog(null, "Can't update. EmpNo doesn't exist in database, check again!","Error",JOptionPane.ERROR_MESSAGE);
            }
        }catch(SQLException e){
            System.out.println(e.getMessage());
        }catch(InputMismatchException ex2){
            System.out.println(ex2.getMessage());
        }
    }
}
