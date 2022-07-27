package CEO;

import Employee.EmployeeTable;

public class CEO {
    public static final String ceoName="fahim";
    public static final String ceoPass = "zoho123";
    public static final int ceoID = 100;
    public CEO(){
        EmployeeTable.employeeID.add(ceoID);
    }
}
