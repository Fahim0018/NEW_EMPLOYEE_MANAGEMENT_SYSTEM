package Employee;

import Utils.Leaves;

public class Employee {
    public String employeeName;
    public int employeeID;
    public String employeeEmailID;
    public String employeeGender;
    public int employeeAge;
    public String employeePhoneNo;
    public String employeeDepartment;
    public String employeeRole;
    public String employeeTeamName;
    public String employeeDirectReportingPersonName;
    public int employeeDirectReportingPersonsID;
    public String employeeMaritalStatus;
    public String employeeJoiningDate;
    public String employeeDOB;


    public int employeeCasualLeave;
    public int employeeAnnualLeave;
    public int employeeMedicalLeave;
    public int employeeMaternityLeave;
    public int employeePaternityLeave;
    public int employeeTotalLeaves;

    public  int cLeave ;
    public int aLeave ;
    public  int mLeave ;
    public static final int matLeave=180;
    public static final int patLeave=24;



    public String getEmployeeName() {
        return employeeName;
    }

    public void setEmployeeName(String employeeName) {
        this.employeeName = employeeName;
    }

    public int getEmployeeID() {
        return employeeID;
    }

    public void setEmployeeID(int employeeID) {
        this.employeeID = employeeID;
    }

    public String getEmployeeEmailID() {
        return employeeEmailID;
    }

    public void setEmployeeEmailID(String employeeEmailID) {
        this.employeeEmailID = employeeEmailID;
    }

    public String getEmployeeGender() {
        return employeeGender;
    }

    public void setEmployeeGender(String employeeGender) {
        this.employeeGender = employeeGender;
    }

    public int getEmployeeAge() {
        return employeeAge;
    }

    public void setEmployeeAge(int employeeAge) {
        this.employeeAge = employeeAge;
    }

    public String getEmployeePhoneNo() {
        return employeePhoneNo;
    }

    public void setEmployeePhoneNo(String employeePhoneNo) {
        this.employeePhoneNo = employeePhoneNo;
    }

    public String getEmployeeDepartment() {
        return employeeDepartment;
    }

    public void setEmployeeDepartment(String employeeDepartment) {
        this.employeeDepartment = employeeDepartment;
    }

    public String getEmployeeTeamName() {
        return employeeTeamName;
    }

    public void setEmployeeTeamName(String employeeTeamName) {
        this.employeeTeamName = employeeTeamName;
    }

    public String getEmployeeJoiningDate() {
        return employeeJoiningDate;
    }

    public void setEmployeeJoiningDate(String employeeJoiningDate) {
        this.employeeJoiningDate = employeeJoiningDate;
    }

    public String getEmployeeMaritalStatus() {
        return employeeMaritalStatus;
    }

    public void setEmployeeMaritalStatus(String employeeMaritalStatus) {
        this.employeeMaritalStatus = employeeMaritalStatus;
    }

    public int getEmployeeCasualLeave() {
        return employeeCasualLeave;
    }

    public void setEmployeeCasualLeave(int employeeCasualLeave) {
        this.employeeCasualLeave = employeeCasualLeave;
    }

    public int getEmployeeAnnualLeave() {
        return employeeAnnualLeave;
    }

    public void setEmployeeAnnualLeave(int employeeAnnualLeave) {
        this.employeeAnnualLeave = employeeAnnualLeave;
    }

    public int getEmployeeMedicalLeave() {
        return employeeMedicalLeave;
    }

    public void setEmployeeMedicalLeave(int employeeMedicalLeave) {
        this.employeeMedicalLeave = employeeMedicalLeave;
    }

    public int getEmployeeMaternityLeave() {
        return employeeMaternityLeave;
    }

    public void setEmployeeMaternityLeave(int employeeMaternityLeave) {
        this.employeeMaternityLeave = employeeMaternityLeave;
    }

    public int getEmployeePaternityLeave() {
        return employeePaternityLeave;
    }

    public void setEmployeePaternityLeave(int employeePaternityLeave) {
        this.employeePaternityLeave = employeePaternityLeave;
    }

    public String getEmployeeRole() {
        return employeeRole;
    }

    public void setEmployeeRole(String employeeRole) {
        this.employeeRole = employeeRole;
    }
    public static void AddEmployee(){}

    public String getEmployeeDirectReportingPersonName() {
        return employeeDirectReportingPersonName;
    }

    public void setEmployeeDirectReportingPersonName(String employeeDirectReportingPersonName) {
        this.employeeDirectReportingPersonName = employeeDirectReportingPersonName;
    }

    public int getEmployeeDirectReportingPersonsID() {
        return employeeDirectReportingPersonsID;
    }

    public void setEmployeeDirectReportingPersonsID(int employeeDirectReportingPersonsID) {
        this.employeeDirectReportingPersonsID = employeeDirectReportingPersonsID;
    }

    public int getcLeave() {
        return cLeave;
    }

    public void setcLeave(int cLeave) {
        this.cLeave = cLeave;
    }

    public int getaLeave() {
        return aLeave;
    }

    public void setaLeave(int aLeave) {
        this.aLeave = aLeave;
    }

    public int getmLeave() {
        return mLeave;
    }

    public void setmLeave(int mLeave) {
        this.mLeave = mLeave;
    }

    public int getEmployeeTotalLeaves() {
        return employeeTotalLeaves;
    }

    public void setEmployeeTotalLeaves(int employeeTotalLeaves) {
        this.employeeTotalLeaves = employeeTotalLeaves;
    }

    public String getEmployeeDOB() {
        return employeeDOB;
    }

    public void setEmployeeDOB(String employeeDOB) {
        this.employeeDOB = employeeDOB;
    }
}
