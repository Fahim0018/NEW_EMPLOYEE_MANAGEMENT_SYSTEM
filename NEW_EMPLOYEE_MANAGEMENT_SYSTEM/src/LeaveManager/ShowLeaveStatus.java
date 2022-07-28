package LeaveManager;

import java.util.ArrayList;
import java.util.Formatter;

public class ShowLeaveStatus {
    public  ShowLeaveStatus(int empID) {
        Formatter fmt = new Formatter();
        System.out.println("------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------\n");
        fmt.format(" %14s %16s  %16s %16s %16s %20s %16s %18s \n", "Employee ID", "Receiver ID","Receiver Name", "Leave Type", "Leave Days", "Leave reason", "Leave Status","Leave Rejection Reason");
        System.out.println(fmt);
        System.out.println("------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------\n");
        ArrayList l = LeaveRequest.leaveRequests.get(empID);
        Formatter fm = null;
        if (l!=null) {
            fm = new Formatter();
            for (int i = 0; i < l.size(); i++) {
                LeaveApplication L = (LeaveApplication) l.get(i);
                fm.format(" %14s %16s %16s %16s %16s %20s %16s \n", L.empKey, L.receiverID,L.receiverName, L.leaveType, L.leaveDays, L.reason, L.getEmployeeLeaveStatus(),L.getEmployeeLeaveRejectionReason());
            }
            System.out.println(fm);
        }
        else {
            System.out.println("\n---No Request Found---\n");
        }

        System.out.println("---------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------\n");

    }
}
