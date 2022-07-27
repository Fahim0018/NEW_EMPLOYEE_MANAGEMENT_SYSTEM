package LeaveManager;

import Employee.*;
import Utils.Leaves;

import java.util.Map;

public class ShowLeaveDetails {

    public ShowLeaveDetails(int empID) {
        for(Map.Entry<Integer, Employee> entry: EmployeeTable.employeeTable.entrySet()) {
            if(entry.getKey().equals(empID)) {
                Employee emp =entry.getValue();
                String currEmpGender = emp.getEmployeeGender();
                if (currEmpGender.equals("Male")) {
                    System.out.println("--Remaining Leaves--" + "\n" + "Casual Leaves: " + emp.getEmployeeCasualLeave() + "/" + Leaves.cLeave + "\n" + "Annual Leaves: " + emp.getEmployeeAnnualLeave() + "/" + Leaves.aLeave + "\n" + "Medical Leaves: " + emp.getEmployeeMedicalLeave() + "/" + Leaves.mLeave + "\n" + "Paternity Leaves: " + emp.getEmployeePaternityLeave() + "/" + Leaves.patLeave + "\n");
                }
                else if(currEmpGender.equals("Female")){
                    System.out.println("--Remaining Leaves--" + "\n" + "Casual Leaves: " + emp.getEmployeeCasualLeave() + "/" + Leaves.cLeave + "\n" + "Annual Leaves: " + emp.getEmployeeAnnualLeave() + "/" + Leaves.aLeave + "\n" + "Medical Leaves: " + emp.getEmployeeMedicalLeave() + "/" + Leaves.mLeave + "\n" + "Maternity Leaves: " + emp.getEmployeeMaternityLeave() + "/" + Leaves.matLeave + "\n");
                }
                else {
                    System.out.println("--Remaining Leaves--" + "\n" + "Casual Leaves: " + emp.getEmployeeCasualLeave() + "/" + Leaves.cLeave + "\n" + "Annual Leaves: " + emp.getEmployeeAnnualLeave() + "/" + Leaves.aLeave + "\n" + "Medical Leaves: " + emp.getEmployeeMedicalLeave() + "/" + Leaves.mLeave + "\n" + "Maternity Leaves: " + emp.getEmployeeMaternityLeave() + "/" + Leaves.matLeave + "\n"+"Paternity Leaves: " + emp.getEmployeePaternityLeave() + "/" + Leaves.patLeave + "\n");

                }
            }
        }
    }
}

