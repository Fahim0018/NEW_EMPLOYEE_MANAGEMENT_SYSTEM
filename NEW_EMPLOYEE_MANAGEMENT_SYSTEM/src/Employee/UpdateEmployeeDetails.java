package Employee;

import Utils.CheckDate;
import Utils.CheckMail;
import Utils.CheckPhoneNumber;

import java.util.Map;

public class UpdateEmployeeDetails {
    UpdateEmployeeDetails(int empID){
        for(Map.Entry<Integer,Employee> entry:EmployeeTable.employeeTable.entrySet()) {
            int currEmpKey = entry.getKey();
            Employee empL = entry.getValue();
            if(empL.employeeID==empID) {
                System.out.print("Name of Employee: ");
                empL.setEmployeeName(Input.sc.next());

                System.out.print("Employee ID number: ");
                empL.setEmployeeID(Input.sc.nextInt());


                while(true) {
                    System.out.print("Employee Mail id: ");
                    String userEmail = Input.sc.next();
                    if (CheckMail.CheckMail(userEmail)) {
                        empL.setEmployeeEmailID(userEmail);
                        break;
                    } else {
                        System.out.println("Enter Valid Email Id!!!!");
                    }
                }

                System.out.print("Select Employee Gender- 1.Male 2.Female 3.Others");
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

                System.out.print("Employee Age: ");
                empL.setEmployeeAge(Input.sc.nextInt());


                while(true) {
                    System.out.print("Employee Phone Number: ");
                    String userPhone = Input.sc.next();
                    if(CheckPhoneNumber.isValidMobileNo(userPhone)){
                        empL.setEmployeePhoneNo(userPhone);
                        break;
                    }
                    else {
                        System.out.println("Enter Valid 10 digit Phone NUmber!!");
                    }
                }

                System.out.println("---Select Department---");
                System.out.println("1.R&D");
                System.out.println("2.FINANCE");
                System.out.println("3.MARKETING");
                System.out.println("4.MANUFACTURING");
                int userDepartment = Input.sc.nextInt();
                switch (userDepartment){
                    case 1:{
                        empL.setEmployeeDepartment("R&D");
                        System.out.println("---Select Team Name---");
                        System.out.println("A.Testing Team");
                        System.out.println("B.Development Team");
                        System.out.println("C.Design Team");
                        System.out.println("D.None");
                        switch (Input.sc.next()) {
                            case "A": {
                                empL.setEmployeeTeamName("Testing Team");
                                break;
                            }
                            case "B":{
                                empL.setEmployeeTeamName("Development Team");
                                break;
                            }
                            case "C": {
                                empL.setEmployeeTeamName("Design Team");
                                break;
                            }
                            case "D":{
                                empL.setEmployeeTeamName("None");
                                break;
                            }

                        }
                        break;
                    }
                    case 2:{
                        empL.setEmployeeDepartment("FINANCE");
                        System.out.println("---Select Team Name---");
                        System.out.println("A.Accounting");
                        System.out.println("B.Purchasing");
                        System.out.println("C.None");
                        switch (Input.sc.next()) {
                            case "A": {
                                empL.setEmployeeTeamName("Accounting Team");
                                break;
                            }
                            case "B": {
                                empL.setEmployeeTeamName("Purchasing Team");
                                break;
                            }
                            case "C": {
                                empL.setEmployeeTeamName("None");
                                break;
                            }
                        }
                        break;

                    }
                    case 3:{
                        empL.setEmployeeDepartment("MARKETING");
                        System.out.println("---Select Team Name---");
                        System.out.println("A.Sales");
                        System.out.println("B.Customer Service");
                        System.out.println("C.None");
                        switch (Input.sc.next()) {
                            case "A": {
                                empL.setEmployeeTeamName("Sales Team");
                                break;
                            }
                            case "B": {
                                empL.setEmployeeTeamName("Customer Service Team");
                                break;
                            }
                            case "C": {
                                empL.setEmployeeTeamName("None");
                                break;
                            }
                        }
                        break;
                    }
                    case 4:{
                        empL.setEmployeeDepartment("MANUFACTURING");
                        System.out.println("---Select Team Name---");
                        System.out.println("A.Line Manager");
                        System.out.println("B.Production Team");
                        System.out.println("C.Distribution");
                        System.out.println("D.None");
                        switch (Input.sc.next()) {
                            case "A": {
                                empL.setEmployeeTeamName("Line Managing Team");
                                break;
                            }
                            case "B":{
                                empL.setEmployeeTeamName("Line Manager");
                                break;
                            }
                            case "C": {
                                empL.setEmployeeTeamName("Distribution Team");
                                break;
                            }
                            case "D":{
                                empL.setEmployeeTeamName("None");
                                break;
                            }

                        }

                        break;
                    }
                }

                System.out.println("---Select Role---");
                System.out.println("A.Department Head");
                System.out.println("B.Team Head");
                System.out.println("C.Team Member");
                switch (Input.sc.next()){
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
                while(true) {
                    System.out.println("Employee Joining Date (dd-MM-yyyy)");
                    String currDate = Input.sc.next();
                    if(CheckDate.isValidDate(currDate)){
                        empL.setEmployeeJoiningDate(Input.sc.next());
                        break;
                    }
                    else {
                        System.out.println("Enter Valid Date");
                    }
                }





            }

        }

    }
}
