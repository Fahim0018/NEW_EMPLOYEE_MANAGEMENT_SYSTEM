package LeaveManager;

import Employee.*;
import Utils.Leaves;


import java.util.ArrayList;
import java.util.Map;

public class LeaveResponse {

    public LeaveResponse(int directReportingPersonsID){
        for(Map.Entry<Integer, ArrayList> entry:LeaveRequest.leaveRequests.entrySet()){
            ArrayList reqList =entry.getValue();
            if(reqList.size()>0) {
                for (int i = 0; i < reqList.size(); i++) {
                    LeaveApplication l = (LeaveApplication) reqList.get(i);
                    if (l.receiverID == directReportingPersonsID) {
                        System.out.println("Employee Id : " + l.empKey);
                        System.out.println("Receiver ID : " + l.receiverID);
                        System.out.println("Requested Leave Type: " + l.leaveType);
                        System.out.println("Starting Date: " + l.startDate);
                        System.out.println("Ending Date: " + l.endDate);
                        System.out.println("No. of Days Off: " + l.leaveDays);
                        System.out.println("Reason For Leave: " + l.reason);

                        for (Map.Entry<Integer, Employee> entry1 : EmployeeTable.employeeTable.entrySet()) {
                            if (entry.getKey().equals(l.empKey)) {
                                Employee emp = entry1.getValue();

                                if (emp.getEmployeeGender().equals("Male")) {
                                    System.out.println("--Remaining Leaves--" + "\n" + "Casual Leaves: " + emp.getEmployeeCasualLeave() + "/" + emp.cLeave + "\n" + "Annual Leaves: " + emp.getEmployeeAnnualLeave() + "/" + emp.aLeave + "\n" + "Medical Leaves: " + emp.getEmployeeMedicalLeave() + "/" + emp.mLeave + "\n" + "Paternity Leaves: " + emp.getEmployeePaternityLeave() + "/" + emp.patLeave + "\n");

                                    System.out.print("Enter Y to Approve request And N to Reject Request: ");
                                    String userInput = Input.sc.next();

                                    if (userInput.equals("Y")) {
                                        if (l.leaveType.equals("Casual") && l.leaveDays <= emp.getEmployeeCasualLeave()) {
                                            int leave = emp.getEmployeeCasualLeave() - l.leaveDays;
                                            emp.setEmployeeCasualLeave(leave);
                                        } else if (l.leaveType.equals("Annual") && l.leaveDays <= emp.getEmployeeAnnualLeave()) {
                                            int leave = emp.getEmployeeAnnualLeave() - l.leaveDays;
                                            emp.setEmployeeAnnualLeave(leave);
                                        } else if (l.leaveType.equals("Medical") && l.leaveDays <= emp.getEmployeeMedicalLeave()) {
                                            int leave = emp.getEmployeeMedicalLeave() - l.leaveDays;
                                            emp.setEmployeeMedicalLeave(leave);
                                        } else if (l.leaveType.equals("Paternity") && l.leaveDays <= emp.getEmployeePaternityLeave()) {
                                            int leave = emp.getEmployeePaternityLeave() - l.leaveDays;
                                            emp.setEmployeePaternityLeave(leave);
                                        }
                                        System.out.println("Request Accepted Successfully");
                                        l.setEmployeeLeaveStatus("Accepted");
                                    } else {
                                        l.setEmployeeLeaveStatus("Rejected");
                                        System.out.print("Rejection Reason: ");
                                        l.setEmployeeLeaveRejectionReason(Input.sc.next());
                                        System.out.println("Request Rejected Successfully!!! ");

                                    }
                                } else if (emp.getEmployeeGender().equals("Female")) {
                                    System.out.println("--Remaining Leaves--" + "\n" + "Casual Leaves: " + emp.getEmployeeCasualLeave() + "/" + emp.cLeave + "\n" + "Annual Leaves: " + emp.getEmployeeAnnualLeave() + "/" + emp.aLeave + "\n" + "Medical Leaves: " + emp.getEmployeeMedicalLeave() + "/" + emp.mLeave + "\n" + "Maternity Leaves: " + emp.getEmployeeMaternityLeave() + "/" + emp.matLeave + "\n");
                                    System.out.print("Enter Y to Approve request And N to Reject Request: ");
                                    String userInput = Input.sc.next();
                                    if (userInput.equals("Y")) {
                                        if (l.leaveType.equals("Casual") && l.leaveDays <= emp.getEmployeeCasualLeave()) {
                                            int leave = emp.getEmployeeCasualLeave() - l.leaveDays;
                                            emp.setEmployeeCasualLeave(leave);
                                        } else if (l.leaveType.equals("Annual") && l.leaveDays <= emp.getEmployeeAnnualLeave()) {
                                            int leave = emp.getEmployeeAnnualLeave() - l.leaveDays;
                                            emp.setEmployeeAnnualLeave(leave);
                                        } else if (l.leaveType.equals("Medical") && l.leaveDays <= emp.getEmployeeMedicalLeave()) {
                                            int leave = emp.getEmployeeMedicalLeave() - l.leaveDays;
                                            emp.setEmployeeMedicalLeave(leave);
                                        } else if (l.leaveType.equals("Maternity") && l.leaveDays <= emp.getEmployeeMaternityLeave()) {
                                            int leave = emp.getEmployeeMaternityLeave() - l.leaveDays;
                                            emp.setEmployeeMaternityLeave(leave);
                                        }
                                        System.out.println("Request Accepted Successfully");
                                        l.setEmployeeLeaveStatus("Accepted");
                                    } else {
                                        l.setEmployeeLeaveStatus("Rejected");
                                        System.out.print("Rejection Reason: ");
                                        l.setEmployeeLeaveRejectionReason(Input.sc.next());
                                        System.out.println("Request Rejected Successfully!!! ");

                                    }

                                } else {
                                    System.out.println("--Remaining Leaves--" + "\n" + "Casual Leaves: " + emp.getEmployeeCasualLeave() + "/" + emp.cLeave + "\n" + "Annual Leaves: " + emp.getEmployeeAnnualLeave() + "/" + emp.aLeave + "\n" + "Medical Leaves: " + emp.getEmployeeMedicalLeave() + "/" + emp.mLeave + "\n" + "Maternity Leaves: " + emp.getEmployeeMaternityLeave() + "/" + emp.matLeave + "\n" + "Paternity Leaves: " + emp.getEmployeePaternityLeave() + "/" + emp.patLeave + "\n");

                                    System.out.print("Enter Y to Approve request And N to Reject Request: ");
                                    String userInput = Input.sc.next();
                                    if (userInput.equals("Y")) {
                                        if (l.leaveType.equals("Casual") && l.leaveDays <= emp.getEmployeeCasualLeave()) {
                                            int leave = emp.getEmployeeCasualLeave() - l.leaveDays;
                                            emp.setEmployeeCasualLeave(leave);
                                        } else if (l.leaveType.equals("Annual") && l.leaveDays <= emp.getEmployeeAnnualLeave()) {
                                            int leave = emp.getEmployeeAnnualLeave() - l.leaveDays;
                                            emp.setEmployeeAnnualLeave(leave);
                                        } else if (l.leaveType.equals("Medical") && l.leaveDays <= emp.getEmployeeMedicalLeave()) {
                                            int leave = emp.getEmployeeMedicalLeave() - l.leaveDays;
                                            emp.setEmployeeMedicalLeave(leave);
                                        } else if (l.leaveType.equals("Maternity") && l.leaveDays <= emp.getEmployeeMaternityLeave()) {
                                            int leave = emp.getEmployeeMaternityLeave() - l.leaveDays;
                                            emp.setEmployeeMaternityLeave(leave);
                                        } else if (l.leaveType.equals("Paternity") && l.leaveDays <= emp.getEmployeePaternityLeave()) {
                                            int leave = emp.getEmployeePaternityLeave() - l.leaveDays;
                                            emp.setEmployeePaternityLeave(leave);
                                        }

                                        System.out.println("Request Accepted Successfully");
                                        l.setEmployeeLeaveStatus("Accepted");
                                    } else {
                                        l.setEmployeeLeaveStatus("Rejected");
                                        System.out.print("Rejection Reason: ");
                                        l.setEmployeeLeaveRejectionReason(Input.sc.next());
                                        System.out.println("Request Rejected Successfully!!! ");

                                    }

                                }


                            }
                        }

                    }
                    else {
                        System.out.println("\n");
                        System.out.println("---No request found!!!---");
                        System.out.println("\n");
                    }
                }
            }
            else {
                System.out.println("\n");
                System.out.println("---No request found!!!---");
                System.out.println("\n");
            }


        }

    }
}
