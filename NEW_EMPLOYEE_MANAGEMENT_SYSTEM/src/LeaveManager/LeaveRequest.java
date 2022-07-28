package LeaveManager;

import Employee.Employee;
import Employee.EmployeeTable;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class LeaveRequest {
    public static HashMap<Integer,ArrayList> leaveRequests = new HashMap<>();
    public static ArrayList<LeaveApplication> userLeaveApplications = new ArrayList<>();

    public LeaveRequest(int empID){
        LeaveApplication leave = new LeaveApplication(empID);
        if(leave.flag==0) {
            leave.setEmployeeLeaveStatus("Pending");


            for (Map.Entry<Integer, Employee> entry1 : EmployeeTable.employeeTable.entrySet()) {
                if (entry1.getKey().equals(empID)) {
                    Employee emp = entry1.getValue();
                    leave.receiverID = emp.getEmployeeDirectReportingPersonsID();
                    leave.receiverName = emp.getEmployeeDirectReportingPersonName();
                }
            }


            int flag = 0;
            for (Map.Entry<Integer, ArrayList> entry : leaveRequests.entrySet()) {
                if (entry.getKey() == empID) {
                    flag = 1;
                }
            }

            if (flag != 1) {
                userLeaveApplications.add(leave);
                leaveRequests.put(empID, userLeaveApplications);
                System.out.println("---Successfully Applied---");
            } else {
                ArrayList l = leaveRequests.get(empID);
                l.add(leave);
                System.out.println("---Successfully Applied---");
            }
        }
        else {
            System.out.println("\n\n----Try again with valid requests---");
        }

    }


}
