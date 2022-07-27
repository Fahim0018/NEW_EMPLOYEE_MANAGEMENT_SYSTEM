package LeaveManager;

import java.util.ArrayList;
import java.util.Formatter;

public class ShowLeaveStatus {
    public  ShowLeaveStatus(int empID) {
        Formatter fmt = new Formatter();
        System.out.println("--------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------\n");
        fmt.format(" %14s %16s %16s %16s %20s %16s \n", "Employee ID", "Receiver ID", "Leave Type", "Leave Days", "Leave reason", "Leave Status");
        System.out.println(fmt);
        System.out.println("------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------\n");
        ArrayList l = LeaveRequest.leaveRequests.get(empID);
        Formatter fm = null;
        if (l.size() > 0) {
            fm = new Formatter();
            for (int i = 0; i < l.size(); i++) {
                LeaveApplication L = (LeaveApplication) l.get(i);
                fm.format(" %14s %16s %16s %16s %20s %16s \n", L.empKey, L.receiverID, L.leaveType, L.leaveDays, L.getEmployeeLeaveRejectionReason(), L.getEmployeeLeaveStatus());
            }
        }
        else {
            System.out.println("\n---No Request Found---\n");
        }
        System.out.println(fm);
        System.out.println("-----------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------\n");

    }
}
