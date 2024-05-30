
package controller;

import java.sql.ResultSet;
import model.*;

public class CEmployeeTitle {
    public <A>ResultSet csearchByTitle(A title){
        MEmployeeTitle met = new MEmployeeTitle();
        return met.<A>msearchByTitle(title);
    }
}
