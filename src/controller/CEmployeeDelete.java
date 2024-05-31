
package controller;

import model.MEmployeeDelete;
import model.MEmployeeDelete;

public class CEmployeeDelete {
    public <A> void cdeleteEmployee(A empno){ //parameter passing using generics
        MEmployeeDelete med = new MEmployeeDelete();
        med.mdeleteEmployee(empno); //calling mdeleteEmployee method in controller with a parameter
    }
}
