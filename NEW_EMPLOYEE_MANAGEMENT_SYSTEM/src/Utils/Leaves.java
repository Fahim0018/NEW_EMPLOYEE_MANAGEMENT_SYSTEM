package Utils;

import Employee.*;

import java.time.Month;
import java.util.ArrayList;
import java.util.Date;
import java.util.Map;

public class Leaves {
    public int defaultCasualLeave =6;
    public int defaultAnnualLeave = 6;
    public int defaultMedicalLeave = 12;

    public static ArrayList<String> leaves = new ArrayList<>();

    public Leaves(){
        leaves.add("Casual");
        leaves.add("Annual");
        leaves.add("Medical");
        leaves.add("Paternity");
        leaves.add("Maternity");
    }
    public void allowedLeaves(int empID){
        for(Map.Entry<Integer, Employee> entry:EmployeeTable.employeeTable.entrySet() ){
            if(entry.getKey().equals(empID)){
                Employee empL = entry.getValue();
                String joinDate = empL.getEmployeeJoiningDate();
                int month =Utility.getMonth(joinDate);


                if(month%2!=0) {
                    int casLeave = defaultCasualLeave - (month/2);
                    empL.setEmployeeCasualLeave(casLeave);
                    empL.cLeave=casLeave;
                    int anLeave = defaultAnnualLeave-(month/2);
                    empL.setEmployeeAnnualLeave(anLeave);
                    empL.aLeave=anLeave;
                }
                else{
                    int casLeave = defaultCasualLeave-(month/2)+1;
                    empL.setEmployeeCasualLeave(casLeave);
                    empL.cLeave=casLeave;
                    int anLeave = defaultAnnualLeave-(month/2)+1;
                    empL.setEmployeeAnnualLeave(anLeave);
                    empL.aLeave=anLeave;
                }
                empL.setEmployeeMedicalLeave(defaultMedicalLeave-month+1);
                empL.mLeave=defaultMedicalLeave-month+1;
                empL.setEmployeePaternityLeave(Employee.patLeave);
                empL.setEmployeeMaternityLeave(Employee.matLeave);
            }
        }
    }

    
}
