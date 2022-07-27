package LeaveManager;

import Employee.*;
import Utils.Leaves;

import java.util.ArrayList;
import java.util.Formatter;
import java.util.Map;

public class ShowLeaveDetails {

    public ShowLeaveDetails(int empID) {
        for(Map.Entry<Integer, Employee> entry: EmployeeTable.employeeTable.entrySet()) {
            if(entry.getKey().equals(empID)) {
                Employee emp =entry.getValue();
                String currEmpGender = emp.getEmployeeGender();
                if (currEmpGender.equals("Male")) {
                    System.out.println("--Remaining Leaves--" + "\n" + "Casual Leaves: " + emp.getEmployeeCasualLeave() + "/" + emp.cLeave + "\n" + "Annual Leaves: " + emp.getEmployeeAnnualLeave() + "/" + emp.aLeave + "\n" + "Medical Leaves: " + emp.getEmployeeMedicalLeave() + "/" + emp.mLeave + "\n" + "Paternity Leaves: " + emp.getEmployeePaternityLeave() + "/" + Employee.patLeave + "\n");
                }
                else if(currEmpGender.equals("Female")){
                    System.out.println("--Remaining Leaves--" + "\n" + "Casual Leaves: " + emp.getEmployeeCasualLeave() + "/" + emp.cLeave + "\n" + "Annual Leaves: " + emp.getEmployeeAnnualLeave() + "/" + emp.aLeave + "\n" + "Medical Leaves: " + emp.getEmployeeMedicalLeave() + "/" + emp.mLeave + "\n" + "Maternity Leaves: " + emp.getEmployeeMaternityLeave() + "/" + Employee.matLeave + "\n");
                }
                else {
                    System.out.println("--Remaining Leaves--" + "\n" + "Casual Leaves: " + emp.getEmployeeCasualLeave() + "/" + emp.cLeave + "\n" + "Annual Leaves: " + emp.getEmployeeAnnualLeave() + "/" + emp.aLeave + "\n" + "Medical Leaves: " + emp.getEmployeeMedicalLeave() + "/" + emp.mLeave + "\n" + "Maternity Leaves: " + emp.getEmployeeMaternityLeave() + "/" + Employee.matLeave + "\n"+"Paternity Leaves: " + emp.getEmployeePaternityLeave() + "/" + Employee.patLeave + "\n");

                }
            }
        }
    }




}

