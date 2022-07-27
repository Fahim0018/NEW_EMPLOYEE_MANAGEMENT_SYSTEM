package LeaveManager;

import Employee.Input;

import java.util.ArrayList;

public class RemoveLeaveRequest {
    public void removeRequest(int empID){
        ArrayList l = LeaveRequest.leaveRequests.get(empID);
        if(l!=null) {
            System.out.println("Enter Leave Request Number: ");
            int reqNO = Input.sc.nextInt();
            l.remove(reqNO - 1);
        }
        else {
            System.out.println("\n---No requests to remove---\n");
        }
    }
}
