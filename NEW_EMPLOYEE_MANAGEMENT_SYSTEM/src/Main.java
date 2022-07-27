
import CEO.CEO;
import Employee.*;
import HR.HR;
import LeaveManager.LeaveApplication;

import Utils.CustomHolidays;

import Utils.Utility;

import java.time.LocalDate;


public class Main {
    public static int firstExitCode=1;
    public static int secondExitCode=1;
    public static int userInput;

    public static void main(String[] args) {
        new CEO();
        while(firstExitCode==1) {
            System.out.println("""
                    1.) CEO
                    2.) HR
                    3.) Employee
                    4.) Exit""");
            userInput = Input.sc.nextInt();
            secondExitCode=1;
            if (userInput == 4) {
                break;
            }
            while(secondExitCode==1){
                SystemController sysCon = new SystemController();
            }
        }
    }
}
