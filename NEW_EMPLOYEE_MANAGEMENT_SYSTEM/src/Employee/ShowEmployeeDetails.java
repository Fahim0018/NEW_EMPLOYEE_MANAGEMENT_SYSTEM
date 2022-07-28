package Employee;

import javax.swing.*;
import java.util.Formatter;
import java.util.Map;

public class ShowEmployeeDetails {

     public void ShowEmployeeDetails(int empID){
             Formatter fmt = new Formatter();
             System.out.println("--------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------\n");
             fmt.format("%5s %15s %15s %15s %15s %15s %20s %15s %15s %15s  %15s %25s %15s \n","Name","Employee ID","E-Mail","Gender","Age","Phone NO.","Department","Team Name","Role","Marital Status","Reporting to Person","Reporting to PersonID","Joining Date");
             System.out.println(fmt);
             System.out.println("--------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------\n");
             Formatter fm = new Formatter();
             for(Map.Entry<Integer,Employee> entry:EmployeeTable.employeeTable.entrySet()) {
                 if(entry.getKey().equals(empID)) {
                     Employee empL = entry.getValue();
                     fm.format("%5s %15s %18s %15s %15s %15s %18s %15s %25s %15s %15s %15s %15s \n", empL.employeeName, empL.employeeID, empL.employeeEmailID, empL.employeeGender, empL.employeeAge, empL.employeePhoneNo, empL.employeeDepartment, empL.employeeTeamName, empL.employeeRole, empL.employeeMaritalStatus,empL.employeeDirectReportingPersonName,empL.employeeDirectReportingPersonsID, empL.employeeJoiningDate);
                 }
             }
             System.out.println(fm);
             System.out.println("--------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------\n");

     }
    public void ShowAllEmployeeDetails() {
        if (!EmployeeTable.employeeTable.isEmpty()){
            Formatter fmt = new Formatter();
            System.out.println("----------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------\n");
            fmt.format("%5s %15s %15s %15s %15s %15s %20s %15s %15s %15s  %15s %25s %15s \n","Name","Employee ID","E-Mail","Gender","Age","Phone NO.","Department","Team Name","Role","Marital Status","Reporting to Person","Reporting to PersonID","Joining Date");
            System.out.println(fmt);
            System.out.println("----------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------\n");
            Formatter fm = new Formatter();
            for (Map.Entry<Integer, Employee> entry : EmployeeTable.employeeTable.entrySet()) {
                Employee empL = entry.getValue();
                fm.format("%5s %15s %18s %15s %15s %15s %18s %15s %25s %15s %15s %15s %15s \n", empL.employeeName, empL.employeeID, empL.employeeEmailID, empL.employeeGender, empL.employeeAge, empL.employeePhoneNo, empL.employeeDepartment, empL.employeeTeamName, empL.employeeRole, empL.employeeMaritalStatus,empL.employeeDirectReportingPersonName,empL.employeeDirectReportingPersonsID, empL.employeeJoiningDate);
            }
            System.out.println(fm);
            System.out.println("----------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------\n");
        }

        else {
            System.out.println("\n---No Employee Added---\n");
        }
     }

}
