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
    public static String startDate;
    public static int startDay;
    public static int startMonth;
    public static int startYear;


    public static String endDate;
    public static int endDay;
    public static int endMonth;
    public static int endYear;
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
        Leaves leave= new Leaves();
        System.out.println("-*-*-Select Leave Type-*-*-");
        for (int i = 0; i < leave.leaves.size(); i++) {
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


        try {
            while (true) {
                System.out.print("Enter Starting Date(yyyy-MM-dd): ");
                startDate = Input.sc.next();
                if (!Utility.isDatePast(startDate, "yyyy-MM-dd")) {
                    startDay = Utility.getDay(startDate)/1;
                    startMonth = Utility.getMonth(startDate)/1;
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
                    endDay = Utility.getDay(endDate)/1;
                    endMonth =Utility.getMonth(endDate)/1;
                    endYear = Utility.getYear(endDate);
                    break;
                } else {
                    System.out.println("Given Date is Already Passed!!!\n Enter Valid date!!!");
                }
            }
        }catch (Exception e){
            e.printStackTrace();
        }


        CustomHolidays ch = new CustomHolidays();
        leaveDays = ch.numberOfWorkdaysBetween(LocalDate.of(startYear,startMonth,startDay),LocalDate.of(endYear,endMonth,endDay));
        System.out.println("Total Leave Days(Excluding Holidays): "+leaveDays);

        System.out.print("Enter Reason For Leave: ");
        reason=Input.sc.next();
    }
}
