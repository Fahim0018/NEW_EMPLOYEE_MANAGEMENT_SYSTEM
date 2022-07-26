package LeaveManager;

import Employee.Employee;
import Employee.EmployeeTable;
import Employee.Input;
import Utils.*;

import java.time.LocalDate;
import java.time.Month;

public class LeaveApplication {

    public  int empKey;
    public  String leaveType;
    public int leaveDays;
    public  String startDate;
    public  int startDay;
    public  int startMonth;
    public  int startYear;
    public int receiverID;
    public String receiverName;
    public  String endDate;
    public int endDay;
    public  int endMonth;
    public int endYear;
    public String reason;
    public String employeeLeaveStatus;
    public String employeeLeaveRejectionReason;
    public int userChoice;
    public int flag =0;
    public String getEmployeeLeaveStatus() {
        return employeeLeaveStatus;
    }

    public void setEmployeeLeaveStatus(String employeeLeaveStatus) {
        this.employeeLeaveStatus = employeeLeaveStatus;
    }

    public String getEmployeeLeaveRejectionReason() {
        return employeeLeaveRejectionReason;
    }

    public void setEmployeeLeaveRejectionReason(String employeeLeaveRejectionReason) {
        this.employeeLeaveRejectionReason = employeeLeaveRejectionReason;
    }
    public LeaveApplication(int empID){
        //ID
        while(true) {
            System.out.print("Enter Employee ID: ");
            empKey = Input.sc.nextInt();
            if(EmployeeTable.employeeID.contains(empKey)){
                break;
            }
            else{
                System.out.println("---Id not Exist---");
            }
        }
        //Leave Type
        System.out.println("-*-*-Select Leave Type-*-*-");
        for (int i = 0; i < 5; i++) {
            System.out.println(i + 1 + "." + Leaves.leaves.get(i));
        }
        while(true) {
            int M = Input.sc.nextInt();
            userChoice=M;
            if(M<Leaves.leaves.size()) {
                leaveType = Leaves.leaves.get(M - 1);
                break;
            }else {
                System.out.println("---Enter Valid Option!!!--- ");
            }
        }


        try {
            while (true) {
                System.out.print("Enter Starting Date(yyyy-MM-dd): ");
                startDate = Input.sc.next();
                if (!Utility.isDatePast(startDate, "yyyy-MM-dd")) {
                    startDay = Utility.getDay(startDate);
                    startMonth = Utility.getMonth(startDate);
                    startYear = Utility.getYear(startDate);
                    break;
                } else {
                    System.out.println("Given Date is Already Passed!!!\n Enter Valid date!!!");
                }
            }
        }catch (Exception e){
            e.printStackTrace();
        }


        try {
            while (true) {
                System.out.print("Enter Ending Date(yyyy-MM-dd): ");
                endDate = Input.sc.next();
                if (!Utility.isDatePast(endDate, "yyyy-MM-dd")) {
                    endDay = Utility.getDay(endDate);
                    endMonth = Utility.getMonth(endDate);
                    endYear = Utility.getYear(endDate);
                    break;
                } else {
                    System.out.println("Given Date is Already Passed or It's Before Starting Date!!!\n Enter Valid date!!!");
                }
            }
        }catch (Exception e){
            e.printStackTrace();
        }


        CustomHolidays ch = new CustomHolidays();
        leaveDays = ch.numberOfWorkdaysBetween(LocalDate.of(startYear,startMonth,startDay),LocalDate.of(endYear,endMonth,endDay));
        System.out.println("Total Leave Days(Excluding Holidays): "+leaveDays);


        Employee e = EmployeeTable.employeeTable.get(empID);
        if(userChoice==1){
            if(leaveDays>e.getEmployeeCasualLeave()){
                System.out.println("---Requested Days Exceeded Allowed Days---");
                flag=1;
            }
            else {
                System.out.print("Enter Reason For Leave: ");
                Input.sc.nextLine();
                reason=Input.sc.nextLine();
            }
        }
        else if (userChoice==2){
            if(leaveDays>e.getEmployeeAnnualLeave()){
                System.out.println("---Requested Days Exceeded Allowed Days---");
                flag=1;
            }
            else {
                System.out.print("Enter Reason For Leave: ");
                Input.sc.nextLine();
                reason=Input.sc.nextLine();
            }
        }
        else if (userChoice==3){
            if(leaveDays>e.getEmployeeMedicalLeave()){
                System.out.println("---Requested Days Exceeded Allowed Days---");
                flag=1;

            }
            else {
                System.out.print("Enter Reason For Leave: ");
                Input.sc.nextLine();
                reason=Input.sc.nextLine();
            }

        }
        else if (userChoice==4){
            if(leaveDays>e.getEmployeePaternityLeave()){
                System.out.println("---Requested Days Exceeded Allowed Days---");
                flag=1;

            }
            else {
                System.out.print("Enter Reason For Leave: ");
                Input.sc.nextLine();
                reason=Input.sc.nextLine();
            }

        }
        else if (userChoice==5){
            if(leaveDays>e.getEmployeeMaternityLeave()){
                System.out.println("---Requested Days Exceeded Allowed Days---");
                flag=1;

            }
            else {
                System.out.print("Enter Reason For Leave: ");
                Input.sc.nextLine();
                reason=Input.sc.nextLine();
            }

        }
    }
}
