
package model;

import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JOptionPane;

public class MEmployeeInsert {
    public <A,B,C> void mregisterEmployee(A empno,A name,A address,B tel,A gender,C basic_sal,A depno,A title,C etf, C epf, C net_sal){
        try{
            Statement st = MDBConnection.getConnection().createStatement();
            int row_count = st.executeUpdate("insert into employee values('"+empno+"','"+name+"','"+address+"','"+tel+"','"+gender+"','"+basic_sal+"','"+depno+"','"+title+"','"+etf+"','"+epf+"','"+net_sal+"')");
            if(row_count>0){
                JOptionPane.showMessageDialog(null, "Employee is registered");
            }
        }catch(SQLException e){
            System.out.println(e.getMessage());
        }
    }
}
