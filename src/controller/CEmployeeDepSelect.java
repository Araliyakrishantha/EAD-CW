
package controller;

import java.sql.ResultSet;
import model.MEmployeeDepSelect;

public class CEmployeeDepSelect {
    public <A>ResultSet csearchByDepNo(A depno){
        MEmployeeDepSelect meds = new MEmployeeDepSelect();
        return meds.<A>msearchByDepNo(depno);
    }
}
