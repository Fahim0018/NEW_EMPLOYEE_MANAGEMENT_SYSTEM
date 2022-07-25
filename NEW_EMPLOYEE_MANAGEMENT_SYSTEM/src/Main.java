
import Employee.*;
import LeaveManager.LeaveApplication;
import Utils.CustomHolidays;
import Utils.Teams;
import Utils.Utility;

import java.time.LocalDate;


public class Main {

    public static void main(String[] args) {



        Teams team = new Teams();
        team.addDepartment(Input.sc.next());
//        team.addDepartment(Input.sc.next());
//        team.addDepartment(Input.sc.next());
        team.addTeamsToDepartment();
        AddEmployee addEmployee = new AddEmployee();
//        System.out.println("enter employee Id");
//        int empId = Input.sc.nextInt();
//        ShowEmployeeDetails showEmp = new ShowEmployeeDetails(empId);
        LeaveApplication leaveApplication=new LeaveApplication();

    }
}
