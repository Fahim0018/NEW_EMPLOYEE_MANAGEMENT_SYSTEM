
import Employee.*;

import java.text.SimpleDateFormat;
import java.time.format.DateTimeFormatter;
import java.util.Calendar;
import java.util.Date;
import java.time.LocalDate;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        AddEmployee addEmployee = new AddEmployee();
        System.out.println("enter employee Id");
        int empId = Input.sc.nextInt();
        ShowEmployeeDetails showEmp = new ShowEmployeeDetails(empId);

    }
}
