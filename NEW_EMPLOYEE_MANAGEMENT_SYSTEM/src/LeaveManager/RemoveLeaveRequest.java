package LeaveManager;

import java.util.ArrayList;

public class RemoveLeaveRequest {
    public void removeRequest(int empID,int reqNumber){
        ArrayList l = LeaveRequest.leaveRequests.get(empID);
        if(l.size()>0) {
            l.remove(reqNumber - 1);
        }
        else {
            System.out.println("\n---No requests to remove---\n");
        }
    }
}
