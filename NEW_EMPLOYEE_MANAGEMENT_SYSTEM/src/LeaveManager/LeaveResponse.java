package LeaveManager;

import Employee.*;
import Utils.Leaves;


import java.util.Map;

public class LeaveResponse {

    public LeaveResponse(int directReportingPersonsID){
        for(Map.Entry<Integer,LeaveApplication> entry:LeaveRequest.leaveRequests.entrySet()){
            LeaveApplication l = entry.getValue();
            if(l.receiverID==directReportingPersonsID){
                System.out.println("Employee Id : "+l.empKey);
                System.out.println("Requested Leave Type: "+l.leaveType);
                System.out.println("Starting Date: "+l.startDate);
                System.out.println("Ending Date: "+l.endDate);
                System.out.println("No. of Days Off: "+l.leaveDays);
                System.out.println("Reason For Leave: "+l.reason);

                for(Map.Entry<Integer, Employee> entry1:EmployeeTable.employeeTable.entrySet()){
                    if(entry.getKey().equals(l.empKey)){
                        Employee emp = entry1.getValue();

                        if(emp.getEmployeeGender().equals("Male")) {
                            System.out.println("--Remaining Leaves--"+"\n"+"Casual Leaves: " + emp.getEmployeeCasualLeave()+"/" + Leaves.cLeave+"\n" + "Annual Leaves: "+emp.getEmployeeAnnualLeave()+"/"+Leaves.aLeave+"\n"+"Medical Leaves: " +emp.getEmployeeMedicalLeave()+"/"+Leaves.mLeave+"\n"+"Paternity Leaves: "+emp.getEmployeePaternityLeave()+"/"+Leaves.patLeave+"\n");

                            System.out.print("Enter Y to Approve request And N to Reject Request: ");
                            String userInput = Input.sc.next();

                            if(userInput.equals("Y")){
                                if(l.leaveType.equals("Casual")){
                                    int leave = emp.getEmployeeCasualLeave()-l.leaveDays;
                                    emp.setEmployeeCasualLeave(leave);
                                }
                                else if(l.leaveType.equals("Annual")){
                                    int leave = emp.getEmployeeAnnualLeave()-l.leaveDays;
                                    emp.setEmployeeAnnualLeave(leave);
                                }
                                else if(l.leaveType.equals("Medical")){
                                    int leave = emp.getEmployeeMedicalLeave()-l.leaveDays;
                                    emp.setEmployeeMedicalLeave(leave);
                                }
                                else if(l.leaveType.equals("Paternity")){
                                    int leave = emp.getEmployeePaternityLeave()-l.leaveDays;
                                    emp.setEmployeePaternityLeave(leave);
                                }
                            }
                            else{
                                   
                            }
                        }


                        else{
                            System.out.println("--Remaining Leaves--"+"\n"+"Casual Leaves: " + emp.getEmployeeCasualLeave()+"/" + Leaves.cLeave+"\n" + "Annual Leaves: "+emp.getEmployeeAnnualLeave()+"/"+Leaves.aLeave+"\n"+"Medical Leaves: " +emp.getEmployeeMedicalLeave()+"/"+Leaves.mLeave+"\n"+"Maternity Leaves: "+emp.getEmployeeMaternityLeave()+"/"+Leaves.matLeave+"\n");
                            System.out.print("Enter Y to Approve request And N to Reject Request: ");
                            String userInput = Input.sc.next();
                            if(userInput.equals("Y")){
                                if(l.leaveType.equals("Casual")){
                                    int leave = emp.getEmployeeCasualLeave()-l.leaveDays;
                                    emp.setEmployeeCasualLeave(leave);
                                }
                                else if(l.leaveType.equals("Annual")){
                                    int leave = emp.getEmployeeAnnualLeave()-l.leaveDays;
                                    emp.setEmployeeAnnualLeave(leave);
                                }
                                else if(l.leaveType.equals("Medical")){
                                    int leave = emp.getEmployeeMedicalLeave()-l.leaveDays;
                                    emp.setEmployeeMedicalLeave(leave);
                                }
                                else if(l.leaveType.equals("Maternity")){
                                    int leave = emp.getEmployeeMaternityLeave()-l.leaveDays;
                                    emp.setEmployeeMaternityLeave(leave);
                                }
                            }

                        }




                    }
                }

            }


        }

    }
}
