
package controller;
import model.MEmployeeUpdate;

public class CEmployeeUpdate {
    public <A,B,C> void cupdateEmployee(A empno, A name, A address, B tel, A gender, C basic, A depno, A title, C etf, C epf, C net_sal){
        MEmployeeUpdate meu = new MEmployeeUpdate();
        meu.mupdateEmployee(empno, name, address, tel, gender, basic, depno, title, etf, epf, net_sal);
    }
}
