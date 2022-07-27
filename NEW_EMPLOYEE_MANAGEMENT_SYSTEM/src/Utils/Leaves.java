package Utils;

import Employee.*;

import java.time.Month;
import java.util.ArrayList;
import java.util.Date;
import java.util.Map;

public class Leaves {

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
                Month joinMonth = Month.of(month);
                if(joinMonth ==Month.JANUARY){
                    empL.setEmployeeCasualLeave(6);
                    empL.cLeave=6;
                    empL.setEmployeeAnnualLeave(6);
                    empL.aLeave=6;
                    empL.setEmployeeMedicalLeave(12);
                    empL.mLeave=12;
                    empL.setEmployeePaternityLeave(Employee.patLeave);
                    empL.setEmployeeMaternityLeave(Employee.matLeave);
                }
                if(joinMonth ==Month.FEBRUARY){
                    empL.setEmployeeCasualLeave(6);
                    empL.cLeave=6;
                    empL.setEmployeeAnnualLeave(6);
                    empL.aLeave=6;
                    empL.setEmployeeMedicalLeave(11);
                    empL.mLeave=11;
                    empL.setEmployeePaternityLeave(Employee.patLeave);
                    empL.setEmployeeMaternityLeave(Employee.matLeave);
                }
                if(joinMonth ==Month.MARCH){
                    empL.setEmployeeCasualLeave(5);
                    empL.cLeave=5;
                    empL.setEmployeeAnnualLeave(5);
                    empL.aLeave=5;
                    empL.setEmployeeMedicalLeave(10);
                    empL.mLeave=10;
                    empL.setEmployeePaternityLeave(Employee.patLeave);
                    empL.setEmployeeMaternityLeave(Employee.matLeave);
                }
                if(joinMonth ==Month.APRIL){
                    empL.setEmployeeCasualLeave(5);
                    empL.cLeave=5;
                    empL.setEmployeeAnnualLeave(5);
                    empL.aLeave=5;
                    empL.setEmployeeMedicalLeave(9);
                    empL.mLeave=9;
                    empL.setEmployeePaternityLeave(Employee.patLeave);
                    empL.setEmployeeMaternityLeave(Employee.matLeave);
                }
                if(joinMonth ==Month.MAY){
                    empL.setEmployeeCasualLeave(4);
                    empL.cLeave=4;
                    empL.setEmployeeAnnualLeave(4);
                    empL.aLeave=4;
                    empL.setEmployeeMedicalLeave(8);
                    empL.mLeave=8;
                    empL.setEmployeePaternityLeave(Employee.patLeave);
                    empL.setEmployeeMaternityLeave(Employee.matLeave);
                }
                if(joinMonth ==Month.JUNE){
                    empL.setEmployeeCasualLeave(4);
                    empL.cLeave=4;
                    empL.setEmployeeAnnualLeave(4);
                    empL.aLeave=4;
                    empL.setEmployeeMedicalLeave(7);
                    empL. mLeave=7;
                    empL.setEmployeePaternityLeave(Employee.patLeave);
                    empL.setEmployeeMaternityLeave(Employee.matLeave);
                }
                if(joinMonth ==Month.JULY){
                    empL.setEmployeeCasualLeave(3);
                    empL.cLeave=3;
                    empL.setEmployeeAnnualLeave(3);
                    empL.aLeave=3;
                    empL.setEmployeeMedicalLeave(6);
                    empL.mLeave=6;
                    empL.setEmployeePaternityLeave(Employee.patLeave);
                    empL.setEmployeeMaternityLeave(Employee.matLeave);
                }
                if(joinMonth ==Month.AUGUST){
                    empL.setEmployeeCasualLeave(3);
                    empL.cLeave=3;
                    empL.setEmployeeAnnualLeave(3);
                    empL.aLeave=3;
                    empL.setEmployeeMedicalLeave(5);
                    empL.mLeave=5;
                    empL.setEmployeePaternityLeave(Employee.patLeave);
                    empL.setEmployeeMaternityLeave(Employee.matLeave);
                }
                if(joinMonth ==Month.SEPTEMBER){
                    empL.setEmployeeCasualLeave(2);
                    empL.cLeave=2;
                    empL.setEmployeeAnnualLeave(2);
                    empL.aLeave=2;
                    empL.setEmployeeMedicalLeave(4);
                    empL.mLeave=4;
                    empL.setEmployeePaternityLeave(Employee.patLeave);
                    empL.setEmployeeMaternityLeave(Employee.matLeave);
                }
                if(joinMonth ==Month.OCTOBER){
                    empL.setEmployeeCasualLeave(2);
                    empL.cLeave=2;
                    empL.setEmployeeAnnualLeave(2);
                    empL.aLeave=2;
                    empL.setEmployeeMedicalLeave(3);
                    empL.mLeave=3;
                    empL.setEmployeePaternityLeave(Employee.patLeave);
                    empL.setEmployeeMaternityLeave(Employee.matLeave);
                }
                if(joinMonth ==Month.NOVEMBER){
                    empL.setEmployeeCasualLeave(1);
                    empL.cLeave=1;
                    empL.setEmployeeAnnualLeave(1);
                    empL.aLeave=1;
                    empL.setEmployeeMedicalLeave(2);
                    empL.mLeave=2;
                    empL.setEmployeePaternityLeave(Employee.patLeave);
                    empL.setEmployeeMaternityLeave(Employee.matLeave);
                }
                if(joinMonth ==Month.DECEMBER){
                    empL.setEmployeeCasualLeave(1);
                    empL. cLeave=1;
                    empL.setEmployeeAnnualLeave(1);
                    empL. aLeave=1;
                    empL.setEmployeeMedicalLeave(1);
                    empL.mLeave=1;
                    empL.setEmployeePaternityLeave(Employee.patLeave);
                    empL.setEmployeeMaternityLeave(Employee.matLeave);
                }

            }
        }
    }

    
}
