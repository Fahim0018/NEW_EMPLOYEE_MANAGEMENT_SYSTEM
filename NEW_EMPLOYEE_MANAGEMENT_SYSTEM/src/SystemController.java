import Employee.Employee;
import Employee.EmployeeTable;
import Employee.Input;
import Employee.ShowEmployeeDetails;
import LeaveManager.*;
import HR.*;
import CEO.*;
import LeaveManager.RemoveLeaveRequest;
import Utils.Leaves;

import java.util.ArrayList;
import java.util.Map;

public class SystemController {
    SystemController(){
      if(Main.userInput==1){
          System.out.println("\n");
          System.out.println("""                  
                  1.)Login
                  2.)Exit""");
          System.out.println("\n");
          switch (Input.sc.nextInt()) {
              case 1: {
                  int Login=0;
                  System.out.println("Enter UserName: ");
                  String userName = Input.sc.next();
                  System.out.println("Enter Password: ");
                  String userPass = Input.sc.next();
                  if(userName.equals(CEO.ceoName) && userPass.equals(CEO.ceoPass)) {
                      System.out.println("\n---You are Logged In!!!!---\n");
                      Login = 1;

                  }
                  else {
                      System.out.println("Enter Valid Username or Password!!");
                  }
                  while(Login==1){
                      System.out.println("""
                              1.)Managing Leave Requests
                              2.)Show All Employee
                              3.)Logout""");
                      int userOption = Input.sc.nextInt();
                      switch (userOption){
                          case 1:{
                              new LeaveResponse(CEO.ceoID);
                              break;
                          }
                          case 2:{
                              new ShowEmployeeDetails().ShowAllEmployeeDetails();
                              break;
                          }
                          case 3:{
                              Login=0;
                              break;
                          }
                          default:{
                              System.out.println("---Enter Valid Option---"+"\n");
                          }
                      }
                  }
                  break;
              }
              case 2:{
                  Main.secondExitCode=0;
                  break;
              }
              default: {
                  System.out.println("---Enter Valid Option---");
              }
          }
      }







      else if (Main.userInput==2) {
          System.out.println("\n");
          System.out.println("""                  
                  1.)Login
                  2.)Exit""");
          System.out.println("\n");
          switch (Input.sc.nextInt()){
              case 1:{
                      int Login=0;
                      System.out.println("Enter UserName: ");
                      String userName = Input.sc.next();
                      System.out.println("Enter Password: ");
                      String userPass = Input.sc.next();
                      if(userName.equals(HR.hrName) && userPass.equals(HR.hrPass)) {
                          System.out.println("\n---You are Logged In!!!!---\n");
                          Login = 1;

                      }
                      else {
                          System.out.println("Enter Valid Username or Password!!");
                      }
                      while (Login==1){
                          HR hr =  new HR();
                          System.out.println("""
                          1.)Add New Employee
                          2.)Remove Employee
                          3.)Update Employee
                          4.)Add New Department                          
                          5.)Logout
                          """);
                          int hrOption = Input.sc.nextInt();
                          switch (hrOption){
                              case 1:{
                                  hr.AddEmployee();
                                  System.out.println("\n---Employee Added SuccessFully---\n");
                                  break;
                              }
                              case 2:{
                                  System.out.print("Enter the Employee Id to be Removed: ");
                                  int empID = Input.sc.nextInt();
                                  hr.removeEmployee(empID);
                                  System.out.println("\n");
                                  System.out.println("---Employee  SuccessFully Removed---");
                                  System.out.println("\n");
                                  break;
                              }
                              case 3:{
                                  System.out.print("Enter the Employee Id to Update: ");
                                  int empID = Input.sc.nextInt();
                                  hr.updateEmployee(empID);
                                  System.out.println("\n");
                                  System.out.println("---Employee Details SuccessFully Updated---");
                                  System.out.println("\n");
                                  break;
                              }
                              case 4:{
                                  System.out.println("Enter The  Number of Departments to be Added ");
                                  int n = Input.sc.nextInt();
                                  for(int i=0;i<n;i++) {
                                      System.out.println("Enter Department Name: ");
                                      String dep = Input.sc.next();
                                      System.out.println("\n");
                                      hr.addNewDepartment(dep);
                                      System.out.println("\n");
                                      System.out.println("---New Department and Teams Added SuccessFully---");
                                      System.out.println("\n");
                                  }
                                  break;
                              }

                              case 5:{
                                  Login=0;
                                  break;


                              }
                              default:{
                                  System.out.println("---Enter Valid Option---"+"\n"+"\n");

                              }
                          }

                      }

                  break;
              }
              case 2:{
                  Main.secondExitCode=0;
                  break;
              }
              default: {
                  System.out.println("---Enter Valid Option---");
              }
          }





      }






      else if (Main.userInput==3) {
          System.out.println("\n");
          System.out.println("""
                  1.)Login
                  2.)Exit""");
          System.out.println("\n");
          switch (Input.sc.nextInt()) {
              case 1: {
                  int Login = 0;
                  System.out.println("Enter Your Employee ID: ");
                  int empID = Input.sc.nextInt();
                  if (EmployeeTable.employeeID.contains(empID)) {
                      Login = 1;
                      System.out.println("You are logged in!!!!");
                  } else {
                      System.out.println("Id not Exist\t\t try Again!!!!\n");
                  }
                  while (Login == 1) {
                      for (Map.Entry<Integer, Employee> entry2 : EmployeeTable.employeeTable.entrySet()) {
                          if (entry2.getKey().equals(empID)) {
                              Employee empL = entry2.getValue();
                              if(empL.getEmployeeRole().equals("Team Member")) {
                                  System.out.println("""
                                          1.)Apply For Leave
                                          2.)Delete Leave Application
                                          3.)Show My Details
                                          4.)Show Remaining Leaves 
                                          5.)Show Applied Leave Status
                                          6.)Logout
                                          """);
                                  int userOption = Input.sc.nextInt();
                                  switch (userOption) {
                                      case 1: {
                                          new LeaveRequest(empID);
                                          break;

                                      }
                                      case 2: {
                                          System.out.println("Enter Leave Request Number: ");
                                          int reqNO = Input.sc.nextInt();
                                          new RemoveLeaveRequest().removeRequest(empID, reqNO);
                                          break;
                                      }
                                      case 3: {
                                          new ShowEmployeeDetails().ShowEmployeeDetails(empID);
                                          break;

                                      }
                                      case 4: {
                                          new ShowLeaveDetails(empID);
                                          break;
                                      }
                                      case 5: {
                                          new ShowLeaveStatus(empID);
                                          break;
                                      }
                                      case 6: {
                                          Login = 0;
                                          break;
                                      }
                                      default: {
                                          System.out.println("---Enter Valid Option---");
                                      }
                                  }
                              }
                              else {
                                  System.out.println("""
                                          1.)Apply For Leave
                                          2.)Delete Leave Application
                                          3.)Show My Details
                                          4.)Show Remaining Leave 
                                          5.)Show Applied Leave Status
                                          6.)Leave Requests
                                          7.)Show Employees Under Me
                                          8.)Logout
                                          """);
                                  int userOption = Input.sc.nextInt();
                                  switch (userOption) {
                                      case 1: {
                                          new LeaveRequest(empID);
                                          break;

                                      }
                                      case 2: {
                                          System.out.println("Enter Leave Request Number: ");
                                          int reqNO = Input.sc.nextInt();
                                          new RemoveLeaveRequest().removeRequest(empID, reqNO);
                                          break;
                                      }
                                      case 3: {
                                          new ShowEmployeeDetails().ShowEmployeeDetails(empID);
                                          break;


                                      }
                                      case 4: {
                                             new ShowLeaveDetails(empID);
                                             break;
                                      }
                                      case 5: {
                                          new ShowLeaveStatus(empID);
                                          break;

                                      }
                                      case 6:{
//
                                          new LeaveResponse(empID);
                                          break;
//

                                      }
                                      case 7:{
                                          new HR().showEmployeeUnder(empID);
                                          break;
                                      }
                                      case 8: {
                                          Login = 0;
                                          break;
                                      }
                                      default: {
                                          System.out.println("---Enter Valid Option---");
                                      }
                                  }

                              }


                          }
                      }
                  }
                  break;
              }
              case 2:{
                  Main.secondExitCode=0;
                  break;
              }
              default: {
                  System.out.println("---Enter Valid Option---");
              }
          }




      }

      else {
          System.out.println("\n");
          System.out.println("---Enter Valid Option---");
          System.out.println("\n");
          Main.secondExitCode=0;
      }
    }

}
