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
        LeaveApplication leave = new LeaveApplication();

        leave.setEmployeeLeaveStatus("Pending");

        int flag = 0;
        for(Map.Entry<Integer,ArrayList> entry : leaveRequests.entrySet()){
            if(entry.getKey()==empID){
                flag=1;
            }
        }

        if(flag!=1){
            userLeaveApplications.add(leave);
            leaveRequests.put(empID,userLeaveApplications);
        }
        else{
            ArrayList l = leaveRequests.get(empID);
            l.add(leave);
        }

    }
    public void removeRequest(int empID,int reqNumber){
        ArrayList l = leaveRequests.get(empID);
        l.remove(reqNumber-1);
    }
}
