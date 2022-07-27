package LeaveManager;

import java.util.ArrayList;

public class RemoveLeaveRequest {
    public void removeRequest(int empID,int reqNumber){
        ArrayList l = LeaveRequest.leaveRequests.get(empID);
        l.remove(reqNumber-1);
    }
}
