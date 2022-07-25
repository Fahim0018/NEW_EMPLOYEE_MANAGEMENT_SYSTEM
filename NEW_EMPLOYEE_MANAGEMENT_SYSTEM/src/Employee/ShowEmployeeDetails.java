package Employee;

import java.util.Formatter;
import java.util.Map;

public class ShowEmployeeDetails {
     public ShowEmployeeDetails(int empID){
        Formatter fmt = new Formatter();
        fmt.format("%5s%15s%15s%15s%15s%15s%15s%15s%15s%15s%15s%15s%15s%15s%15s%15s\n","Name","Employee ID","E-Mail","Gender","Age","Phone NO.","Department","Team Name","Role","Marital Status","Joining Date");
        for(Map.Entry<Integer,Employee> entry:EmployeeTable.employeeTable.entrySet()) {
            int currEmpKey = entry.getKey();
            Employee empL = entry.getValue();
            fmt.format("%5s%15s%15s%15s%15s%15s%15s%15s%15s%15s%15s%15s%15s%15s%15s%15s\n",empL.employeeName,empL.employeeID,empL.employeeEmailID,empL.employeeGender,empL.employeeAge,empL.employeePhoneNo,empL.employeeDepartment,empL.employeeTeamName,empL.employeeRole,empL.employeeMaritalStatus,empL.employeeJoiningDate);
        }
         System.out.println(fmt);

    }
}
