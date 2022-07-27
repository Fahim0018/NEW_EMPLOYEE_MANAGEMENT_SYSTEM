package Utils;

import Employee.*;

import java.time.Month;
import java.util.ArrayList;
import java.util.Date;
import java.util.Map;

public class Leaves {
    public static  int cLeave ;
    public static int aLeave ;
    public static  int mLeave ;
    public static final int matLeave=180;
    public static final int patLeave=24;
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
                    cLeave=6;
                    empL.setEmployeeAnnualLeave(6);
                    aLeave=6;
                    empL.setEmployeeMedicalLeave(12);
                    mLeave=12;
                    empL.setEmployeePaternityLeave(patLeave);
                    empL.setEmployeeMaternityLeave(matLeave);
                }
                if(joinMonth ==Month.FEBRUARY){
                    empL.setEmployeeCasualLeave(6);
                    cLeave=6;
                    empL.setEmployeeAnnualLeave(6);
                    aLeave=6;
                    empL.setEmployeeMedicalLeave(11);
                    mLeave=11;
                    empL.setEmployeePaternityLeave(patLeave);
                    empL.setEmployeeMaternityLeave(matLeave);
                }
                if(joinMonth ==Month.MARCH){
                    empL.setEmployeeCasualLeave(5);
                    cLeave=5;
                    empL.setEmployeeAnnualLeave(5);
                    aLeave=5;
                    empL.setEmployeeMedicalLeave(10);
                    mLeave=10;
                    empL.setEmployeePaternityLeave(patLeave);
                    empL.setEmployeeMaternityLeave(matLeave);
                }
                if(joinMonth ==Month.APRIL){
                    empL.setEmployeeCasualLeave(5);
                    cLeave=5;
                    empL.setEmployeeAnnualLeave(5);
                    aLeave=5;
                    empL.setEmployeeMedicalLeave(9);
                    mLeave=9;
                    empL.setEmployeePaternityLeave(patLeave);
                    empL.setEmployeeMaternityLeave(matLeave);
                }
                if(joinMonth ==Month.MAY){
                    empL.setEmployeeCasualLeave(4);
                    cLeave=4;
                    empL.setEmployeeAnnualLeave(4);
                    aLeave=4;
                    empL.setEmployeeMedicalLeave(8);
                    mLeave=8;
                    empL.setEmployeePaternityLeave(patLeave);
                    empL.setEmployeeMaternityLeave(matLeave);
                }
                if(joinMonth ==Month.JUNE){
                    empL.setEmployeeCasualLeave(4);
                    cLeave=4;
                    empL.setEmployeeAnnualLeave(4);
                    aLeave=4;
                    empL.setEmployeeMedicalLeave(7);
                    mLeave=7;
                    empL.setEmployeePaternityLeave(patLeave);
                    empL.setEmployeeMaternityLeave(matLeave);
                }
                if(joinMonth ==Month.JULY){
                    empL.setEmployeeCasualLeave(3);
                    cLeave=3;
                    empL.setEmployeeAnnualLeave(3);
                    aLeave=3;
                    empL.setEmployeeMedicalLeave(6);
                    mLeave=6;
                    empL.setEmployeePaternityLeave(patLeave);
                    empL.setEmployeeMaternityLeave(matLeave);
                }
                if(joinMonth ==Month.AUGUST){
                    empL.setEmployeeCasualLeave(3);
                    cLeave=3;
                    empL.setEmployeeAnnualLeave(3);
                    aLeave=3;
                    empL.setEmployeeMedicalLeave(5);
                    mLeave=5;
                    empL.setEmployeePaternityLeave(patLeave);
                    empL.setEmployeeMaternityLeave(matLeave);
                }
                if(joinMonth ==Month.SEPTEMBER){
                    empL.setEmployeeCasualLeave(2);
                    cLeave=2;
                    empL.setEmployeeAnnualLeave(2);
                    aLeave=2;
                    empL.setEmployeeMedicalLeave(4);
                    mLeave=4;
                    empL.setEmployeePaternityLeave(patLeave);
                    empL.setEmployeeMaternityLeave(matLeave);
                }
                if(joinMonth ==Month.OCTOBER){
                    empL.setEmployeeCasualLeave(2);
                    cLeave=2;
                    empL.setEmployeeAnnualLeave(2);
                    aLeave=2;
                    empL.setEmployeeMedicalLeave(3);
                    mLeave=3;
                    empL.setEmployeePaternityLeave(patLeave);
                    empL.setEmployeeMaternityLeave(matLeave);
                }
                if(joinMonth ==Month.NOVEMBER){
                    empL.setEmployeeCasualLeave(1);
                    cLeave=1;
                    empL.setEmployeeAnnualLeave(1);
                    aLeave=1;
                    empL.setEmployeeMedicalLeave(2);
                    mLeave=2;
                    empL.setEmployeePaternityLeave(patLeave);
                    empL.setEmployeeMaternityLeave(matLeave);
                }
                if(joinMonth ==Month.DECEMBER){
                    empL.setEmployeeCasualLeave(1);
                    cLeave=1;
                    empL.setEmployeeAnnualLeave(1);
                    aLeave=1;
                    empL.setEmployeeMedicalLeave(1);
                    mLeave=1;
                    empL.setEmployeePaternityLeave(patLeave);
                    empL.setEmployeeMaternityLeave(matLeave);
                }

            }
        }
    }

    
}
