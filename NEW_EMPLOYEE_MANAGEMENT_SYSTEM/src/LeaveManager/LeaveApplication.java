package LeaveManager;

import Employee.EmployeeTable;
import Employee.Input;
import Utils.*;

import java.time.LocalDate;
import java.time.Month;

public class LeaveApplication {

    public int empKey;
    public  String leaveType;
    public int leaveDays;
    public String startDate;
    public int startDay;
    public Month startMonth;
    public int startYear;


    public String endDate;
    public int endDay;
    public Month endMonth;
    public int endYear;
    public String reason;
    public LeaveApplication(){
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
        for (int i = 0; i < Leaves.leaves.size(); i++) {
            System.out.println(i + 1 + "." + Leaves.leaves.get(i));
        }
        while(true) {
            int M = Input.sc.nextInt();
            if(M<Leaves.leaves.size()) {
                leaveType = Leaves.leaves.get(M - 1);
                break;
            }else {
                System.out.println("---Enter Valid Option!!!--- ");
            }
        }



        while(true) {
            System.out.print("Enter Starting Date(yyyy-mm-dd): ");
            startDate = Input.sc.next();
            if (!Utility.isDatePast(startDate, "yyyy-mm-dd")) {
                startDay = Utility.getDay(startDate);
                startMonth = Utility.getMonth(startDate);
                startYear = Utility.getYear(startDate);
                break;
            }
            else {
                System.out.println("Given Date is Already Passed!!!\n Enter Valid date!!!");
            }
        }



        while(true) {
            System.out.print("Enter Ending Date(yyyy-mm-dd): ");
            endDate = Input.sc.next();
            if (!Utility.isDatePast(endDate, "yyyy-mm-dd")) {
                endDay = Utility.getDay(startDate);
                endMonth  = Utility.getMonth(startDate);
                endYear = Utility.getYear(startDate);
                break;
            }
            else {
                System.out.println("Given Date is Already Passed!!!\n Enter Valid date!!!");
            }
        }
        CustomHolidays ch = new CustomHolidays();
        leaveDays = ch.numberOfWorkdaysBetween(LocalDate.of(startYear,startMonth,startDay),LocalDate.of(endYear,endMonth,endDay));

        System.out.print("Enter Reason For Leave: ");
        reason=Input.sc.next();
    }
}
