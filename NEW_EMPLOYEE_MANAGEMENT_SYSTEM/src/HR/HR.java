package HR;

import CEO.CEO;
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
    public int count=0;
    public String currRole;


    public static HashMap<String, ArrayList> departmentTeam = new HashMap<>();

    public static ArrayList<String> department = new ArrayList<>();
    public void addDepartment(String dep){
        department.add(dep);
    }

    public void addTeamsToDepartment(){
        if(!department.isEmpty()) {
            for (String dep : department) {
                System.out.println("->" + dep);
            }
            Input.sc.nextLine();
            System.out.println("Enter department name in which teams to be added");
            String depName = Input.sc.nextLine();
            for (String dept : department) {
                if (dept.equals(depName)) {
                    ArrayList teamList = departmentTeam.get(depName);
                    System.out.println("enter the no. of teams to be added in " + dept);
                    int n = Input.sc.nextInt();
                    for (int i = 0; i < n; i++) {
                        Input.sc.nextLine();
                        System.out.println("Enter Team Name:");
                        teamList.add(Input.sc.nextLine());

                    }

                    departmentTeam.put(dept, teamList);
                }
            }
        }
        else {
            System.out.println("\n----Add Department First----\n");
        }
    }

    public void addNewDepartment(String newDep){
        department.add(newDep);
        ArrayList<String> teamList = new ArrayList<>();
        System.out.println("enter the no. of teams to be added:");
        int n = Input.sc.nextInt();
        for (int i = 0; i < n; i++) {
            Input.sc.nextLine();
            System.out.println("Enter Team Name:");
            teamList.add(Input.sc.nextLine());

        }
        teamList.add("None");
        departmentTeam.put(newDep,teamList);
        System.out.println("\n");
        System.out.println("---New Department and Teams Added SuccessFully---");
        System.out.println("\n");

    }
    public void AddEmployee(){
        if(!department.isEmpty()) {
            int testID;
            Employee empL = new Employee();
            //name
            System.out.print("Name of Employee: ");
            Input.sc.nextLine();
            empL.setEmployeeName(Input.sc.nextLine());

            //ID


            while (true) {
                System.out.print("Employee ID number: ");
                int currID = Input.sc.nextInt();
                testID = currID;
                if (!EmployeeTable.employeeID.contains(currID)) {
                    empL.setEmployeeID(currID);
                    EmployeeTable.employeeID.add(currID);
                    break;
                } else {
                    System.out.println("ID Already Exist!!! \t Enter valid Id\n");
                }

            }




            //Email Id
            while (true) {
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
            int userOption = Input.sc.nextInt();
            switch (userOption) {
                case 1: {
                    empL.setEmployeeGender("Male");
                    break;
                }
                case 2: {
                    empL.setEmployeeGender("Female");
                    break;
                }
                case 3: {
                    empL.setEmployeeGender("Others");
                    break;
                }
            }

            //Age
            System.out.print("Employee D.O.B.(yyyy-MM-dd): ");
            String DOB = Input.sc.next();
            int age =Utility.parseDate(DOB);
            System.out.println("\nEmployee Age: "+age);
            empL.setEmployeeAge(age);


            //Contact Number
            while (true) {
                System.out.print("Employee Phone Number: ");
                String userPhone = Input.sc.next();
                if (Utility.isValidMobileNo(userPhone)) {
                    empL.setEmployeePhoneNo(userPhone);
                    break;
                } else {
                    System.out.println("Enter Valid 10 digit Phone NUmber!!");
                }
            }



            //Role
            System.out.println("\n-*-*-Select Role-*-*-");
            System.out.println("1.Department Head");
            System.out.println("2.Team Head");
            System.out.println("3.Team Member");
            String inp = Input.sc.next();
            switch (inp) {
                case "1": {
                    empL.setEmployeeRole("Department Head");
                    currRole="Department Head";
                    break;
                }
                case "2": {
                    empL.setEmployeeRole("Team Head");
                    currRole="Team Head";
                    break;
                }
                case "3": {
                    empL.setEmployeeRole("Team Member");
                    currRole="Team Member";
                    break;
                }
            }

            //Department
            System.out.println("\n-*-*-Select Department-*-*-");

            for (int i = 0; i < HR.department.size(); i++) {
                System.out.println(i + 1 + "." + HR.department.get(i));
            }

            int N = Input.sc.nextInt();
            while (true) {
                if (N < HR.department.size() + 1) {
                    empL.setEmployeeDepartment(HR.department.get(N - 1));

                    System.out.println("\n-*-*-Select Team Name-*-*-");
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
                                if (M < 6) {
                                    empL.setEmployeeTeamName((String) team.get(M - 1));
                                    break;
                                } else {
                                    System.out.println("\n---Enter valid option---\n");
                                }
                            }
                        }
                    }
                    break;
                } else {
                    System.out.println("\n---Enter valid option---\n");

                }
            }




            if(EmployeeTable.employeeTable.isEmpty()){
                System.out.println("\nAvailable reporting to Person");
                System.out.println(CEO.ceoName + ":" + "ID-" + CEO.ceoID+"  Role-CEO");
            }
            else{
                if(currRole.equals("Departmen Head")) {
                    System.out.println("\nAvailable reporting to Person");
                    System.out.println(CEO.ceoName + ":" + "ID-" + CEO.ceoID+"  Role-CEO");
                }
                else {
                    System.out.println("\nAvailable reporting to Person");
                    System.out.println(CEO.ceoName + ":" + "ID-" + CEO.ceoID+"  Role-CEO");
                    for (Map.Entry<Integer, Employee> entry : EmployeeTable.employeeTable.entrySet()) {
                        Employee emp = entry.getValue();
                        if (currRole.equals("Team Head")){
                            if(emp.employeeRole.equals("Department Head")){
                                System.out.println(emp.employeeName +":"+ "ID-"+emp.employeeID +"  Role-DepartmentHead");
                            }
                        } else if (currRole.equals("Team Member")) {
                            if(emp.employeeRole.equals("Department Head")||emp.employeeRole.equals("Team Head")){
                                System.out.println(emp.employeeName +":"+ "ID-"+emp.employeeID +"  Role-"+emp.employeeRole);
                            }

                        }
                    }
                }

            }

            //direct reporting person
            System.out.print("\nDirect Reporting Person: ");
            Input.sc.nextLine();
            empL.setEmployeeDirectReportingPersonName(Input.sc.nextLine());

            while (true) {
                System.out.print("\nDirect Reporting Person's ID: ");
                int currID = Input.sc.nextInt();
                if (EmployeeTable.employeeID.contains(currID) && currID != testID) {
                    empL.setEmployeeDirectReportingPersonsID(currID);
                    break;
                } else {
                    System.out.println("\n---Enter Valid Id---\n");

                }
            }


            //Marital Status
            int exiCod=0;
            while(exiCod==0) {
                System.out.println("\nEmployee Marital Status");
                System.out.println("1.Married");
                System.out.println("2.Single");
                System.out.println("3.Widowed");
                System.out.println("4.Divorced");
                switch (Input.sc.next()) {
                    case "1": {
                        empL.setEmployeeMaritalStatus("Married");
                        exiCod=1;
                        break;
                    }
                    case "2": {
                        empL.setEmployeeMaritalStatus("Single");
                        exiCod=1;
                        break;
                    }
                    case "3": {
                        empL.setEmployeeMaritalStatus("Widowed");
                        exiCod=1;
                        break;
                    }
                    case "4": {
                        empL.setEmployeeMaritalStatus("Divorced");
                        exiCod=1;
                        break;
                    }
                    default:{
                        System.out.println("\n---Enter Valid Otion---\n");
                    }
                }
            }

            //joining date

            System.out.print("\nEmployee Joining Date (yyyy-MM-dd): ");
            String currDate = Input.sc.next();
            empL.setEmployeeJoiningDate(currDate);


            //Adding to Details to Hashmap
            EmployeeTable.employeeTable.put(empL.getEmployeeID(), empL);

            int currEmpID = empL.getEmployeeID();
            new Leaves().allowedLeaves(currEmpID);

            System.out.println("\n---Employee Added SuccessFully---\n");
            System.out.println("\n");
        }
        else {
            System.out.println("\n\t\t\t---Add Department First---\t\t\t\n");
        }

    }




    public void removeEmployee(){
        if(!EmployeeTable.employeeTable.isEmpty()) {
            System.out.println("\n--Employee Id's--");
            for(int i=1;i<EmployeeTable.employeeID.size();i++){
                System.out.println(i+".)"+EmployeeTable.employeeID.get(i));
            }
            System.out.print("Enter the Employee Id to be Removed: ");
            int empID = Input.sc.nextInt();
            if (EmployeeTable.employeeID.contains(empID)) {
                EmployeeTable.employeeTable.remove(empID);
                int ind =EmployeeTable.employeeID.indexOf(empID);
                EmployeeTable.employeeID.remove(ind);
                System.out.println("\n");
                System.out.println("---Employee  SuccessFully Removed---");
                System.out.println("\n");
            } else {
                System.out.println("\n\t\t\t---Enter Valid Id---\t\t\t\n");
            }
        }
        else {
            System.out.println("\n\t\t\t---No Employee To be Removed---\t\t\t\n");
        }

    }

    public void updateEmployee(){
        if(!EmployeeTable.employeeTable.isEmpty()) {
            int exitCode=0;
            System.out.println("\n--Employee Id's--");
            for(int i=1;i<EmployeeTable.employeeID.size();i++){
                System.out.println(i+".)"+EmployeeTable.employeeID.get(i));
            }
            System.out.print("Enter the Employee Id to Update: ");
            int empID = Input.sc.nextInt();
            if(EmployeeTable.employeeID.contains(empID)) {
                Employee emp = EmployeeTable.employeeTable.get(empID);
                while(exitCode==0) {
                    System.out.println("\n");
                    System.out.println("""
                            1.)Update Department
                            2.)Update Role
                            3.)Update Team
                            4.)Update Reporting To person
                            5.)Exit""");
                    int userInput = Input.sc.nextInt();
                    switch (userInput) {
                        case 1: {
                            System.out.println("Choose Department From The List");
                            for (String dep : department) {
                                System.out.println("->" + dep);
                            }
                            Input.sc.nextLine();
                            System.out.println("Enter new Department: ");
                            String newDep = Input.sc.nextLine();
                            if (department.contains(newDep)) {
                                emp.setEmployeeDepartment(newDep);
                            } else {
                                System.out.println("\n---Department Not Exixts---\n");
                            }
                            System.out.println("\n");
                            break;
                        }
                        case 2: {
                            System.out.println("\n--Choose New Role---");
                            System.out.println("->Department Head");
                            System.out.println("->Team Head");
                            System.out.println("->Team Member");
                            Input.sc.nextLine();
                            System.out.println("Enter New Role");
                            String inp = Input.sc.nextLine();
                            emp.employeeRole = inp;
                            if (inp.equals("Department Head")) {
                                emp.setEmployeeTeamName("None");
                            }
                            break;


                        }
                        case 3: {
                            ArrayList l = departmentTeam.get(emp.employeeDepartment);
                            for (int i = 0; i < l.size(); i++) {
                                System.out.println("->" + l.get(i));
                            }
                            Input.sc.nextLine();
                            System.out.println("Enter New Team: ");
                            String newTeam = Input.sc.nextLine();
                            if(l.contains(newTeam)) {
                                emp.employeeTeamName = newTeam;
                            }
                            else {
                                System.out.println("\n---Enter Valid Team Name---");
                            }
                            System.out.println("\n");
                            break;

                        }
                        case 4: {
                            Input.sc.nextLine();
                            System.out.println("Enter New Reporting to Person Name: ");
                            String newRepName = Input.sc.nextLine();
                            emp.setEmployeeDirectReportingPersonName(newRepName);
                            System.out.println("Enter new Reporting Person Id");
                            int newRepID = Input.sc.nextInt();
                            if (EmployeeTable.employeeID.contains(newRepID)) {
                                emp.setEmployeeDirectReportingPersonsID(newRepID);
                            } else {
                                System.out.println("\n---Enter Valid Id----\n");
                            }
                            break;

                        }
                        case 5:{
                            exitCode=1;
                            System.out.println("\n");
                            break;
                        }
                        default: {
                            System.out.println("\n---Enter Valid Option---\n");
                            break;
                        }


                    }
                }
            }
            else {
                System.out.println("\n");
                System.out.println("---Enter Valid Employee Id and Try Again---");
                System.out.println("\n");
            }

        }
        else{
            System.out.println("\n\t\t\t---No Employee Added---\t\t\t\n");
        }

    }

    public void updateByEmployee(int empID){
        int exitCode=0;
        Employee emp = EmployeeTable.employeeTable.get(empID);
        while(exitCode==0) {
            System.out.println("\n");
            System.out.println("""
                            1.)Update Mail
                            2.)Update Marital Status
                            3.)Update Phone Number
                            4.)Exit""");
            int userInput = Input.sc.nextInt();
            switch (userInput) {
                case 1: {
                    while (true) {
                        System.out.print("Enter New Mail id: ");
                        String userEmail = Input.sc.next();
                        if (Utility.CheckMail(userEmail)) {
                            emp.setEmployeeEmailID(userEmail);
                            break;
                        } else {
                            System.out.println("Enter Valid Email Id!!!!");
                        }
                    }
                    break;
                }
                case 2: {
                    int exCo = 0;
                    while(exCo==0) {
                        System.out.println("\nChoose New Marital Status");
                        System.out.println("1.Married");
                        System.out.println("2.Single");
                        System.out.println("3.Widowed");
                        System.out.println("4.Divorced");

                        switch (Input.sc.next()) {
                            case "1": {
                                emp.setEmployeeMaritalStatus("Married");
                                exCo=1;
                                break;
                            }
                            case "2": {
                                emp.setEmployeeMaritalStatus("Single");
                                exCo=1;
                                break;
                            }
                            case "3": {
                                emp.setEmployeeMaritalStatus("Widowed");
                                exCo=1;
                                break;
                            }
                            case "4": {
                                emp.setEmployeeMaritalStatus("Divorced");
                                exCo=1;
                                break;
                            }
                            default: {
                                System.out.println("\n---Enter Valid Option---\n");
                                break;
                            }
                        }
                    }
                    break;


                }
                case 3: {
                    while (true) {
                        System.out.print("Employee Phone Number: ");
                        String userPhone = Input.sc.next();
                        if (Utility.isValidMobileNo(userPhone)) {
                            emp.setEmployeePhoneNo(userPhone);
                            break;
                        } else {
                            System.out.println("Enter Valid 10 digit Phone NUmber!!");
                        }
                    }
                    break;

                }
                case 4:{
                    exitCode=1;
                    System.out.println("\n");
                    break;
                }
                default: {
                    System.out.println("\n---Enter Valid Option---\n");
                    break;
                }


            }
        }






    }




    public void showEmployeeUnder(int empID) {
        Employee e =EmployeeTable.employeeTable.get(empID);
        System.out.println("\nName: "+e.getEmployeeName()+"\t"+"Department: "+e.getEmployeeDepartment()+"\t\t"+"Role: "+e.getEmployeeRole()+"\n");
        Formatter fmt = new Formatter();
        System.out.println("------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------\n");
        fmt.format("%5s %15s %15s %15s %15s %15s %20s %15s %15s %15s  %15s %25s %15s \n","Name","Employee ID","E-Mail","Gender","Age","Phone NO.","Department","Team Name","Role","Marital Status","Reporting to Person","Reporting to PersonID","Joining Date");
        System.out.println(fmt);
        System.out.println("----------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------\n");
        Formatter fm = null;
        for (Map.Entry<Integer, Employee> entry : EmployeeTable.employeeTable.entrySet()) {
            Employee empL = entry.getValue();
            fm = new Formatter();
            if (empL.getEmployeeDirectReportingPersonsID() == empID) {
                count+=1;

                fm.format("%5s %15s %18s %15s %15s %15s %18s %15s %25s %15s %15s %15s %15s \n", empL.employeeName, empL.employeeID, empL.employeeEmailID, empL.employeeGender, empL.employeeAge, empL.employeePhoneNo, empL.employeeDepartment, empL.employeeTeamName, empL.employeeRole, empL.employeeMaritalStatus,empL.employeeDirectReportingPersonName,empL.employeeDirectReportingPersonsID, empL.employeeJoiningDate);


            }

        }
        if(count==0){
            System.out.println("\n\t\t\t\t-----No Employee Under You-----\t\t\t\t\n");
        }
        System.out.println(fm);
        System.out.println("-------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------\n");

    }


}
