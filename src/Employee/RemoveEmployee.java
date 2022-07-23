package Employee;

public class RemoveEmployee {
    RemoveEmployee(int empID){
        EmployeeTable.employeeTable.remove(empID);
    }
}
