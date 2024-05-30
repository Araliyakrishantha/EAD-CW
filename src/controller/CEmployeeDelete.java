
package controller;

import model.MEmployeeDelete;
import model.MEmployeeDelete;

public class CEmployeeDelete {
    public <A> void cdeleteEmployee(A empno){
        MEmployeeDelete med = new MEmployeeDelete();
        med.mdeleteEmployee(empno);
    }
}
