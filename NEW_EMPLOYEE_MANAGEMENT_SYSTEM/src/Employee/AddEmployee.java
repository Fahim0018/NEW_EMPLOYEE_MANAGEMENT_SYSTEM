package Employee;


import Utils.*;

import java.util.ArrayList;
import java.util.Map;

public class AddEmployee extends Employee{
    public  AddEmployee(){
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

        for(int i = 0;i<Teams.department.size();i++ ){
            System.out.println(i+1+"."+Teams.department.get(i));
        }

        int N = Input.sc.nextInt();
        if (N == N) {
            empL.setEmployeeDepartment(Teams.department.get(N - 1));

            System.out.println("-*-*-Select Team Name-*-*-");
            for (Map.Entry<String, ArrayList> entry : Teams.departmentTeam.entrySet()) {
                if (entry.getKey().equals(Teams.department.get(N - 1))) {
                    ArrayList team = entry.getValue();
                    int j=0;
                    while (team.size()>j) {
                        System.out.println(j + 1 + "." + team.get(j));
                        j++;
                    }
                    int M = Input.sc.nextInt();
                    if(M==M){
                        empL.setEmployeeTeamName((String)team.get(M-1) );
                        break;
                    }
                }
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
        System.out.println("Direct Reporting Person's ID: ");
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
        while(true) {
            System.out.println("Employee Joining Date (dd-MM-yyyy)");
            String currDate = Input.sc.next();
            if(Utility.CheckDate(currDate)){
                empL.setEmployeeJoiningDate(currDate);
                break;
            }
            else {
                System.out.println("Enter Valid Date!!!");
            }
        }

        //Adding to Details to Hashmap
        EmployeeTable.employeeTable.put(empL.getEmployeeID(),empL);
        EmployeeTable.employeeID.add(empL.employeeID);

        //Acknowledgement
        System.out.println("Employee Successfully Added\n\n");
    }
}


