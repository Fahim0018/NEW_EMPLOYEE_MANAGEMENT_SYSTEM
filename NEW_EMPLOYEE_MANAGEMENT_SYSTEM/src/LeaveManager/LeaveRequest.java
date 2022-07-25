package LeaveManager;

import java.util.HashMap;

public class LeaveRequest {
    public static HashMap<Integer,LeaveApplication> leaveRequests = new HashMap<>();

    public LeaveRequest(){
        LeaveApplication leave = new LeaveApplication();
        leaveRequests.put(leave.empKey,leave);
    }
}
