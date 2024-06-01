
package view;
import java.sql.*;
import controller.*;
import java.util.InputMismatchException;
import javax.swing.ButtonGroup;
import javax.swing.JOptionPane;
import java.sql.Connection;
import java.sql.DriverManager;
import java.util.ArrayList;
import net.sf.jasperreports.engine.JasperCompileManager;
import net.sf.jasperreports.engine.JasperFillManager;
import net.sf.jasperreports.engine.JasperPrint;
import net.sf.jasperreports.engine.JasperReport;
import net.sf.jasperreports.engine.design.JRDesignQuery;
import net.sf.jasperreports.engine.design.JasperDesign;
import net.sf.jasperreports.engine.xml.JRXmlLoader;
import net.sf.jasperreports.view.JasperViewer;

public class VEmployee extends javax.swing.JFrame {

    public VEmployee() {
        initComponents();
        ButtonGroup bg = new ButtonGroup(); // creating a button group
        bg.add(rad_Male); // inserting buttons to buttongroup
        bg.add(rad_Female);
        rad_Male.setSelected(true); // default selected radio button
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        txt_EmpNo = new javax.swing.JTextField();
        txt_Name = new javax.swing.JTextField();
        txt_Address = new javax.swing.JTextField();
        txt_Tel = new javax.swing.JTextField();
        rad_Male = new javax.swing.JRadioButton();
        rad_Female = new javax.swing.JRadioButton();
        txt_DepName = new javax.swing.JTextField();
        cmb_DepNo = new javax.swing.JComboBox<>();
        btn_Insert = new javax.swing.JButton();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        txt_BasicSal = new javax.swing.JTextField();
        txt_DepAllow = new javax.swing.JTextField();
        btn_Update = new javax.swing.JButton();
        btn_Delete = new javax.swing.JButton();
        btn_Search = new javax.swing.JButton();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        txt_ETF = new javax.swing.JTextField();
        txt_EPF = new javax.swing.JTextField();
        jLabel12 = new javax.swing.JLabel();
        txt_NetSal = new javax.swing.JTextField();
        btn_CreateReport = new javax.swing.JButton();
        jLabel13 = new javax.swing.JLabel();
        cmb_Title = new javax.swing.JComboBox<>();
        jLabel14 = new javax.swing.JLabel();
        txt_TitleAllow = new javax.swing.JTextField();
        btn_Insert1 = new javax.swing.JButton();
        jLabel15 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(null);

        jLabel1.setText("Emp No");
        getContentPane().add(jLabel1);
        jLabel1.setBounds(40, 50, 70, 16);

        jLabel2.setText("Name");
        getContentPane().add(jLabel2);
        jLabel2.setBounds(40, 90, 70, 16);

        jLabel3.setText("Address");
        getContentPane().add(jLabel3);
        jLabel3.setBounds(40, 120, 70, 16);

        jLabel4.setText("Tel");
        getContentPane().add(jLabel4);
        jLabel4.setBounds(40, 150, 50, 16);

        jLabel5.setText("Gender");
        getContentPane().add(jLabel5);
        jLabel5.setBounds(40, 240, 70, 16);

        jLabel6.setText("Basic Salary");
        getContentPane().add(jLabel6);
        jLabel6.setBounds(40, 270, 90, 16);

        jLabel7.setText("Dep No");
        getContentPane().add(jLabel7);
        jLabel7.setBounds(40, 300, 80, 16);
        getContentPane().add(txt_EmpNo);
        txt_EmpNo.setBounds(140, 50, 140, 22);
        getContentPane().add(txt_Name);
        txt_Name.setBounds(140, 90, 140, 22);
        getContentPane().add(txt_Address);
        txt_Address.setBounds(140, 120, 140, 22);
        getContentPane().add(txt_Tel);
        txt_Tel.setBounds(140, 150, 140, 22);

        rad_Male.setText("Male");
        getContentPane().add(rad_Male);
        rad_Male.setBounds(140, 240, 70, 21);

        rad_Female.setText("Female");
        getContentPane().add(rad_Female);
        rad_Female.setBounds(220, 230, 104, 40);

        txt_DepName.setEnabled(false);
        getContentPane().add(txt_DepName);
        txt_DepName.setBounds(140, 340, 140, 22);

        cmb_DepNo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "001", "002", "003", "004", " " }));
        cmb_DepNo.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                cmb_DepNoItemStateChanged(evt);
            }
        });
        getContentPane().add(cmb_DepNo);
        cmb_DepNo.setBounds(140, 300, 72, 22);

        btn_Insert.setText("Insert");
        btn_Insert.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_InsertActionPerformed(evt);
            }
        });
        getContentPane().add(btn_Insert);
        btn_Insert.setBounds(40, 420, 80, 23);

        jLabel8.setText("Dep Name");
        getContentPane().add(jLabel8);
        jLabel8.setBounds(40, 340, 80, 16);

        jLabel9.setText("Dep Allow");
        getContentPane().add(jLabel9);
        jLabel9.setBounds(40, 380, 80, 16);
        getContentPane().add(txt_BasicSal);
        txt_BasicSal.setBounds(140, 270, 140, 22);

        txt_DepAllow.setEnabled(false);
        getContentPane().add(txt_DepAllow);
        txt_DepAllow.setBounds(140, 380, 140, 22);

        btn_Update.setText("Update");
        btn_Update.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_UpdateActionPerformed(evt);
            }
        });
        getContentPane().add(btn_Update);
        btn_Update.setBounds(130, 420, 80, 23);

        btn_Delete.setText("Delete");
        btn_Delete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_DeleteActionPerformed(evt);
            }
        });
        getContentPane().add(btn_Delete);
        btn_Delete.setBounds(220, 420, 80, 23);

        btn_Search.setText("Search");
        btn_Search.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_SearchActionPerformed(evt);
            }
        });
        getContentPane().add(btn_Search);
        btn_Search.setBounds(310, 420, 80, 23);

        jLabel10.setText("ETF");
        getContentPane().add(jLabel10);
        jLabel10.setBounds(40, 450, 36, 16);

        jLabel11.setText("EPF");
        getContentPane().add(jLabel11);
        jLabel11.setBounds(40, 490, 36, 16);

        txt_ETF.setEnabled(false);
        getContentPane().add(txt_ETF);
        txt_ETF.setBounds(90, 450, 96, 22);

        txt_EPF.setEnabled(false);
        getContentPane().add(txt_EPF);
        txt_EPF.setBounds(90, 490, 96, 22);

        jLabel12.setText("Net Salary");
        getContentPane().add(jLabel12);
        jLabel12.setBounds(230, 490, 70, 16);

        txt_NetSal.setEnabled(false);
        getContentPane().add(txt_NetSal);
        txt_NetSal.setBounds(300, 490, 90, 22);

        btn_CreateReport.setText("Create Report");
        btn_CreateReport.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_CreateReportActionPerformed(evt);
            }
        });
        getContentPane().add(btn_CreateReport);
        btn_CreateReport.setBounds(220, 520, 170, 23);

        jLabel13.setText("Job Title");
        getContentPane().add(jLabel13);
        jLabel13.setBounds(40, 180, 70, 30);

        cmb_Title.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Manager", "Staff", "Cleark" }));
        cmb_Title.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                cmb_TitleItemStateChanged(evt);
            }
        });
        getContentPane().add(cmb_Title);
        cmb_Title.setBounds(140, 180, 94, 22);

        jLabel14.setText("Title Allow");
        getContentPane().add(jLabel14);
        jLabel14.setBounds(40, 210, 80, 16);

        txt_TitleAllow.setEnabled(false);
        getContentPane().add(txt_TitleAllow);
        txt_TitleAllow.setBounds(140, 210, 140, 22);

        btn_Insert1.setText("Clear");
        btn_Insert1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_Insert1ActionPerformed(evt);
            }
        });
        getContentPane().add(btn_Insert1);
        btn_Insert1.setBounds(40, 520, 80, 23);

        jLabel15.setBackground(new java.awt.Color(0, 0, 204));
        jLabel15.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        jLabel15.setText("Salary Processing System");
        getContentPane().add(jLabel15);
        jLabel15.setBounds(70, 0, 290, 40);

        pack();
    }// </editor-fold>//GEN-END:initComponents
    class NullException extends Exception{ // creating custom exception 
        @Override
        public String getMessage(){ // overriding the method getMessage
            return "Empty text fields"; // this is the msg return after calling getMessage method
        }
    }
    private void btn_InsertActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_InsertActionPerformed
        String empno,name,address,gender,depno,title; 
        gender = "";
        int tel;
        double basic,etf,epf,net_sal,dep_allow,title_allow;
        try{
            if(txt_EmpNo.getText().isEmpty() || txt_Name.getText().isEmpty() || txt_Address.getText().isEmpty() || txt_Tel.getText().isEmpty() || txt_BasicSal.getText().isEmpty()){
                NullException e = new NullException(); //if above components was empty NullException will throw an exception object
                throw e;
                
            }
            empno = txt_EmpNo.getText();
            name = txt_Name.getText();
            address = txt_Address.getText();
            tel = Integer.parseInt(txt_Tel.getText()); //casting
            if(rad_Male.isSelected()){
                gender ="M";
            }else if(rad_Female.isSelected()){
                gender ="F";
            }
            basic = Double.parseDouble(txt_BasicSal.getText());
            depno = cmb_DepNo.getSelectedItem().toString();
            title = cmb_Title.getSelectedItem().toString();
            dep_allow = Double.parseDouble(txt_DepAllow.getText());
            title_allow = Double.parseDouble(txt_TitleAllow.getText());
            etf = (basic*3/100); //calculating etf,epf and net salary
            epf = (basic*12/100) + (basic*8/100);
            net_sal = basic + dep_allow + title_allow - (basic*8/100);
        
            CEmployeeInsert cei = new CEmployeeInsert();
            cei.<String,Integer,Double>cregisterEmployee(empno, name, address, tel, gender, basic, depno, title, etf, epf, net_sal); //calling cregisterEmployee method with generics
            txt_EmpNo.setText(""); // after inserting a data all txt fields will be empty
        txt_Name.setText("");
        txt_Address.setText("");
        txt_Tel.setText("");
        txt_TitleAllow.setText("");
        txt_BasicSal.setText("");
        txt_DepName.setText("");
        txt_DepAllow.setText("");
        txt_ETF.setText("");
        txt_EPF.setText("");
        txt_NetSal.setText("");
        
        ArrayList<Double> numbers = new ArrayList<Double>(); // this arraylist with lambda is used to display on output window after inserting a data(because data will be errased on txt fields after clicking the insert button)
        numbers.add(basic);
        numbers.add(etf);
        numbers.add(epf);
        numbers.add(net_sal);
        numbers.forEach( (n) -> { System.out.println(n); } ); // forEach method in ArrayList is used to show stored data in numbers
        
        }catch(NumberFormatException e){
            System.err.println("Format Ecception " + e.getMessage());
        }catch(NullPointerException ex){
            System.err.println("Null Ecception " + ex.getMessage());
        }catch(NullException ex1){
            System.out.println(ex1.getMessage());
            JOptionPane.showMessageDialog(null, "Empty field, check again","Error",JOptionPane.ERROR_MESSAGE);
        }
        
        
    }//GEN-LAST:event_btn_InsertActionPerformed

    private void btn_UpdateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_UpdateActionPerformed
        String empno,name,address,gender,depno,title;
        gender = "";
        int tel;
        double basic,etf,epf,net_sal,dep_allow,title_allow;
        try{
            if(txt_EmpNo.getText().isEmpty() || txt_Name.getText().isEmpty() || txt_Address.getText().isEmpty() || txt_Tel.getText().isEmpty() || txt_BasicSal.getText().isEmpty()){ //check whether any field is empty or not
                NullException e = new NullException();
                throw e;
                
            }
            empno = txt_EmpNo.getText();
            name = txt_Name.getText();
            address = txt_Address.getText();
            tel = Integer.parseInt(txt_Tel.getText());
            if(rad_Male.isSelected()){
                gender ="M";
            }else if(rad_Female.isSelected()){
                gender ="F";
            }
            basic = Double.parseDouble(txt_BasicSal.getText());
            depno = cmb_DepNo.getSelectedItem().toString();
            title = cmb_Title.getSelectedItem().toString();
            dep_allow = Double.parseDouble(txt_DepAllow.getText());
            title_allow = Double.parseDouble(txt_TitleAllow.getText());
            etf = (basic*3/100); // we have to again calculate etf, epf and net salary after updating a date row
            epf = (basic*12/100) + (basic*8/100);
            net_sal = basic + dep_allow + title_allow - (basic*8/100);
        
            CEmployeeUpdate ceu = new CEmployeeUpdate();
            ceu.<String,Integer,Double>cupdateEmployee(empno, name, address, tel, gender, basic, depno, title, etf, epf, net_sal); //clling cupdateEmployee with generics
            txt_EmpNo.setText("");
        txt_Name.setText("");
        txt_Address.setText("");
        txt_Tel.setText("");
        txt_TitleAllow.setText("");
        txt_BasicSal.setText("");
        txt_DepName.setText("");
        txt_DepAllow.setText("");
        txt_ETF.setText("");
        txt_EPF.setText("");
        txt_NetSal.setText("");
        }catch(NumberFormatException e){
            System.err.println("Format Ecception " + e.getMessage());
        }catch(NullPointerException ex){
            System.err.println("Null Ecception " + ex.getMessage());
        }catch(NullException ex1){
            System.out.println(ex1.getMessage());
            JOptionPane.showMessageDialog(null, "Empty field, check again","Error",JOptionPane.ERROR_MESSAGE);
        }
        
        
    }//GEN-LAST:event_btn_UpdateActionPerformed

    private void btn_DeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_DeleteActionPerformed
       String empno;
       empno = txt_EmpNo.getText();
       try{
            if(txt_EmpNo.getText().isEmpty()){ // check whether txt_EmpNo is empty or not
                NullException e = new NullException();
                    throw e;
            }
            CEmployeeDelete ced = new CEmployeeDelete();
            ced.<String>cdeleteEmployee(empno); //calling cdeleteEmployee method with parameter empno
            txt_EmpNo.setText("");
        txt_Name.setText("");
        txt_Address.setText("");
        txt_Tel.setText("");
        txt_TitleAllow.setText("");
        txt_BasicSal.setText("");
        txt_DepName.setText("");
        txt_DepAllow.setText("");
        txt_ETF.setText("");
        txt_EPF.setText("");
        txt_NetSal.setText("");
       }catch(NullException ex1){
            System.out.println(ex1.getMessage());
            JOptionPane.showMessageDialog(null, "Emp no can not be empty","Error",JOptionPane.ERROR_MESSAGE);
        }
       
       
    }//GEN-LAST:event_btn_DeleteActionPerformed

    private void cmb_DepNoItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_cmb_DepNoItemStateChanged
        String depno;
        depno = cmb_DepNo.getSelectedItem().toString();
        try{
            CEmployeeDepSelect ceds = new CEmployeeDepSelect();
            ResultSet rst = ceds.<String>csearchByDepNo(depno); //calling to table department and getting data to the UI
            while(rst.next()){ // when selecting department the department name and allowance will getting from department table and corresponding data will be displayied
                txt_DepName.setText(rst.getString(2));
                txt_DepAllow.setText(rst.getString(3));
            }
        }catch(SQLException e){
            System.err.println(e.getMessage());
        }
        
        
    }//GEN-LAST:event_cmb_DepNoItemStateChanged

    private void btn_SearchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_SearchActionPerformed
        String empno;
        empno = txt_EmpNo.getText();
        try{
            if(txt_EmpNo.getText().isEmpty()){ //check whether txt_EmpNo is empty or not. if empty NullException will throw an exception object
                NullException e = new NullException();
                    throw e;
            }
            CEmployeeSearch ces = new CEmployeeSearch();
            ResultSet rst = ces.<String>csearchByEmpNo(empno);
            
            if(!rst.next()){ //check whether rows in resulth set is available or not. if not below message will display
                JOptionPane.showMessageDialog(null, "Emp no doesn't match, try again!","Error",JOptionPane.ERROR_MESSAGE);
            }else{
                do{ //if resulth is available we must use a do while loop. if not we will miss the 1st row of resulth set. then will not display any value
                    txt_Name.setText(rst.getString(2));
                    txt_Address.setText(rst.getString(3));
                    txt_Tel.setText(rst.getString(4));
                    String gen="",dno="",title="";
                    gen = rst.getString(5);
                    if(gen.equals("M")){ //checking whether rad_Male or rad_Female is slected
                        rad_Male.setSelected(true);
                    }else if(gen.equals("F")){
                        rad_Female.setSelected(true);
                    }
                    txt_BasicSal.setText(rst.getString(6));
                    dno = rst.getString(7); //setting selected item of dno according to database value
                    if(dno.equals("001")){
                        cmb_DepNo.setSelectedItem("001");
                    }else if(dno.equals("002")){
                        cmb_DepNo.setSelectedItem("002");
                    }else if(dno.equals("003")){
                        cmb_DepNo.setSelectedItem("003");
                    }else if(dno.equals("004")){
                        cmb_DepNo.setSelectedItem("004");
                    }
                    title = rst.getString(8); //setting selected index of title according to corresponding related data value
                    if(title.equals("Manager")){
                        cmb_Title.setSelectedIndex(0);
                    }else if(title.equals("Staff")){
                        cmb_Title.setSelectedIndex(1);
                    }else if(title.equals("Cleark")){
                        cmb_Title.setSelectedIndex(2);
                    }
                    txt_ETF.setText(rst.getString(9));
                    txt_EPF.setText(rst.getString(10));
                    txt_NetSal.setText(rst.getString(11));
                }while(rst.next());
            }           
        }catch(SQLException e){
            System.err.println(e.getMessage());
        }catch(NullException ex1){
            System.out.println(ex1.getMessage());
            JOptionPane.showMessageDialog(null, "Emp no can not be empty","Error",JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_btn_SearchActionPerformed

    private void cmb_TitleItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_cmb_TitleItemStateChanged
        String title;
        title = cmb_Title.getSelectedItem().toString();
        try{
            CEmployeeTitle cet = new CEmployeeTitle();
            ResultSet rst = cet.<String>csearchByTitle(title); // when title cahnging corresponding allowance will display
            while(rst.next()){
                txt_TitleAllow.setText(rst.getString(2));
            }
        }catch(SQLException e){
            System.err.println(e.getMessage());
        }
    }//GEN-LAST:event_cmb_TitleItemStateChanged

    private void btn_Insert1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_Insert1ActionPerformed
        txt_EmpNo.setText("");
        txt_Name.setText("");
        txt_Address.setText("");
        txt_Tel.setText("");
        txt_TitleAllow.setText("");
        txt_BasicSal.setText("");
        txt_DepName.setText("");
        txt_DepAllow.setText("");
        txt_ETF.setText("");
        txt_EPF.setText("");
        txt_NetSal.setText("");
        
    }//GEN-LAST:event_btn_Insert1ActionPerformed

    private void btn_CreateReportActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_CreateReportActionPerformed
        try{
            String dbpath = "jdbc:mysql://localhost/salary"; //defing database path
            Connection con = DriverManager.getConnection(dbpath,"root",""); //here username is root and password is empty
            JasperDesign jasperdesign1 = JRXmlLoader.load("C:\\Users\\user\\Documents\\NetBeansProjects\\salary_cw\\src\\view\\report1.jrxml");
            JRDesignQuery designquery1 = new JRDesignQuery();
            String myquery = "select * from employee inner join department on employee.d_no=department.dep_no inner join title on employee.title=title.title_name"; //joining employee, department and title tables together
            designquery1.setText(myquery);
            jasperdesign1.setQuery(designquery1);
            JasperReport report1 = JasperCompileManager.compileReport(jasperdesign1);
            JasperPrint print1 = JasperFillManager.fillReport(report1,null,con);
            JasperViewer.viewReport(print1);
        }catch(Exception e){
            System.out.println(e.getMessage());
        }
    }//GEN-LAST:event_btn_CreateReportActionPerformed

    public static void main(String args[]) {
      
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new VEmployee().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_CreateReport;
    private javax.swing.JButton btn_Delete;
    private javax.swing.JButton btn_Insert;
    private javax.swing.JButton btn_Insert1;
    private javax.swing.JButton btn_Search;
    private javax.swing.JButton btn_Update;
    private javax.swing.JComboBox<String> cmb_DepNo;
    private javax.swing.JComboBox<String> cmb_Title;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JRadioButton rad_Female;
    private javax.swing.JRadioButton rad_Male;
    private javax.swing.JTextField txt_Address;
    private javax.swing.JTextField txt_BasicSal;
    private javax.swing.JTextField txt_DepAllow;
    private javax.swing.JTextField txt_DepName;
    private javax.swing.JTextField txt_EPF;
    private javax.swing.JTextField txt_ETF;
    private javax.swing.JTextField txt_EmpNo;
    private javax.swing.JTextField txt_Name;
    private javax.swing.JTextField txt_NetSal;
    private javax.swing.JTextField txt_Tel;
    private javax.swing.JTextField txt_TitleAllow;
    // End of variables declaration//GEN-END:variables
}
