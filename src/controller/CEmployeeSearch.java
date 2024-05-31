
package controller;

import java.sql.ResultSet;
import model.*;

public class CEmployeeSearch {
    public <A>ResultSet csearchByEmpNo(A empno){ //parameter passing using generics
        MEmployeeSearch mes = new MEmployeeSearch();
        return mes.<A>msearchByEmpNo(empno);
    }
}
