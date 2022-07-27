package HR;

import Employee.*;
import Employee.Input;
import Utils.Leaves;
import Utils.Utility;

import java.util.ArrayList;
import java.util.Formatter;
import java.util.HashMap;
import java.util.Map;

public class HR {
    public static final String hrName = "ashish";
    public static final String hrPass="1";

    public static HashMap<String, ArrayList> departmentTeam = new HashMap<>();

    public static ArrayList<String> department = new ArrayList<>();
    public void addDepartment(String dep){
        department.add(dep);
    }

    public void addTeamsToDepartment(){
        for(String dept:department){
            ArrayList<String> teamList = new ArrayList<>();
            System.out.println("enter the no. of teams to be added in "+ dept);
            int n = Input.sc.nextInt();
            for (int i = 0; i < n; i++) {
                System.out.println("Enter Team "+i+" Name:");
                teamList.add(Input.sc.next());
            }
            teamList.add("None");
            departmentTeam.put(dept,teamList);
        }
    }

    public void addNewDepartment(String newDep){
        department.add(newDep);
        ArrayList<String> teamList = new ArrayList<>();
        System.out.println("enter the no. of teams to be added:");
        int n = Input.sc.nextInt();
        for (int i = 0; i < n; i++) {
            System.out.println("Enter Team Name:");
            teamList.add(Input.sc.next());

        }
        teamList.add("None");
        departmentTeam.put(newDep,teamList);

    }
    public void AddEmployee(){
        Employee empL = new Employee();
        //name
        System.out.print("Name of Employee: ");
        empL.setEmployeeName(Input.sc.next());

        //ID
        while(true) {

            System.out.print("Employee ID number: ");
            int currID = Input.sc.nextInt();
            if(!EmployeeTable.employeeID.contains(currID)) {
                empL.setEmployeeID(currID);
                EmployeeTable.employeeID.add(currID);
                break;
            }
            else {
                System.out.println("ID Already Exist!!! \n Enter valid Id\n");
            }

        }

        //Email Id
        while(true) {
            System.out.print("Employee Mail id: ");
            String userEmail = Input.sc.next();
            if (Utility.CheckMail(userEmail)) {
                empL.setEmployeeEmailID(userEmail);
                break;
            } else {
                System.out.println("Enter Valid Email Id!!!!");
            }
        }

        //Gender
        System.out.println("Select Employee Gender-\n 1.Male\n 2.Female\n 3.Others");
        int userOption=Input.sc.nextInt();
        switch (userOption){
            case 1:{
                empL.setEmployeeGender("Male");
                break;
            }
            case 2:{
                empL.setEmployeeGender("Female");
                break;
            }
            case 3:{
                empL.setEmployeeGender("Others");
                break;
            }
        }

        //Age
        System.out.print("Employee Age: ");
        empL.setEmployeeAge(Input.sc.nextInt());


        //Contact Number
        while(true) {
            System.out.print("Employee Phone Number: ");
            String userPhone = Input.sc.next();
            if(Utility.isValidMobileNo(userPhone)){
                empL.setEmployeePhoneNo(userPhone);
                break;
            }
            else {
                System.out.println("Enter Valid 10 digit Phone NUmber!!");
            }
        }

        //Department
        System.out.println("-*-*-Select Department-*-*-");

        for(int i = 0;i<HR.department.size();i++ ){
            System.out.println(i+1+"."+ HR.department.get(i));
        }

        int N = Input.sc.nextInt();
        while(true) {
            if (N<HR.department.size()+1) {
                empL.setEmployeeDepartment(HR.department.get(N - 1));

                System.out.println("-*-*-Select Team Name-*-*-");
                for (Map.Entry<String, ArrayList> entry : HR.departmentTeam.entrySet()) {
                    if (entry.getKey().equals(HR.department.get(N - 1))) {
                        ArrayList team = entry.getValue();
                        int j = 0;
                        while (team.size() > j) {
                            System.out.println(j + 1 + "." + team.get(j));
                            j++;
                        }
                        int M = Input.sc.nextInt();
                        while (true) {
                            if (M<6) {
                                empL.setEmployeeTeamName((String) team.get(M - 1));
                                break;
                            } else {
                                System.out.println("\n---Enter valid option---\n");
                            }
                        }
                    }
                }
                break;
            }
            else {
                System.out.println("\n---Enter valid option---\n");

            }
        }


        //Role
        System.out.println("-*-*-Select Role-*-*-");
        System.out.println("A.Department Head");
        System.out.println("B.Team Head");
        System.out.println("C.Team Member");
        String inp = Input.sc.next();
        switch (inp){
            case "A": {
                empL.setEmployeeRole("Department Head");
                break;
            }
            case "B":{
                empL.setEmployeeRole("Team Head");
                break;
            }
            case "C": {
                empL.setEmployeeRole("Team Member");
                break;
            }
        }

        //direct reporting person
        System.out.print("Direct Reporting Person: ");
        empL.setEmployeeDirectReportingPersonName(Input.sc.next());


        System.out.print("Direct Reporting Person's ID: ");
        empL.setEmployeeDirectReportingPersonsID(Input.sc.nextInt());




        //Marital Status
        System.out.println("Employee Marital Status");
        System.out.println("A.Married");
        System.out.println("B.Single");
        System.out.println("C.Widowed");
        System.out.println("D.Divorced");
        switch (Input.sc.next()){
            case "A":{
                empL.setEmployeeMaritalStatus("Married");
                break;
            }
            case "B":{
                empL.setEmployeeMaritalStatus("Single");
                break;
            }
            case "C":{
                empL.setEmployeeMaritalStatus("Widowed");
                break;
            }
            case "D":{
                empL.setEmployeeMaritalStatus("Divorced");
                break;
            }
        }

        //joining date

        System.out.print("Employee Joining Date (yyyy-MM-dd): ");
        String currDate = Input.sc.next();
        empL.setEmployeeJoiningDate(currDate);



        //Adding to Details to Hashmap
        EmployeeTable.employeeTable.put(empL.getEmployeeID(),empL);

        int currEmpID = empL.getEmployeeID();
        new Leaves().allowedLeaves(currEmpID);
    }



    public void removeEmployee(int empID){
        EmployeeTable.employeeTable.remove(empID);
        EmployeeTable.employeeID.remove(empID);
    }

    public void updateEmployee(int empID){
        for(Map.Entry<Integer,Employee> entry:EmployeeTable.employeeTable.entrySet()) {
            int currEmpKey = entry.getKey();
            Employee empL = entry.getValue();
            if (empL.employeeID == empID) {
                AddEmployee();
            }
        }

    }

    public void showEmployeeUnder(int empID) {
        Employee e =EmployeeTable.employeeTable.get(empID);
        System.out.println("\nName: "+e.getEmployeeName()+"\t"+"Department: "+e.getEmployeeDepartment()+"\t"+"Role: "+e.getEmployeeRole()+"\n");
        Formatter fmt = new Formatter();
        System.out.println("--------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------\n");
        fmt.format("%5s %15s %15s %15s %15s %15s %20s %15s %15s %25s %15s \n", "Name", "Employee ID", "E-Mail", "Gender", "Age", "Phone NO.", "Department", "Team Name", "Role", "Marital Status", "Joining Date");
        System.out.println(fmt);
        System.out.println("------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------\n");
        Formatter fm = null;
        for (Map.Entry<Integer, Employee> entry : EmployeeTable.employeeTable.entrySet()) {
            Employee empL = entry.getValue();
            fm = new Formatter();
            if (empL.getEmployeeDirectReportingPersonsID() == empID) {

                fm.format("%5s %15s %18s %15s %15s %15s %18s %15s %25s %15s %15s \n", empL.employeeName, empL.employeeID, empL.employeeEmailID, empL.employeeGender, empL.employeeAge, empL.employeePhoneNo, empL.employeeDepartment, empL.employeeTeamName, empL.employeeRole, empL.employeeMaritalStatus, empL.employeeJoiningDate);


            }

        }
        System.out.println(fm);
        System.out.println("--------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------\n");

    }


}
