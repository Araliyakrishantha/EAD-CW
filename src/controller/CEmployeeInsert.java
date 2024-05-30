
package controller;
import model.MEmployeeInsert;

public class CEmployeeInsert {
    public <A,B,C> void cregisterEmployee(A empno,A name,A address,B tel,A gender,C basic_sal,A depno,A title, C etf, C epf,C net_sal){
        MEmployeeInsert mei = new MEmployeeInsert();
        mei.mregisterEmployee(empno,name,address,tel,gender,basic_sal,depno,title,etf, epf, net_sal);
    }
}
