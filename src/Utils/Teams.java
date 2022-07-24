package Utils;

import Employee.Employee;
import Employee.Input;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Teams {

    public static HashMap<String,ArrayList> departmentTeam = new HashMap<>();

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
        departmentTeam.put(newDep,teamList);

    }




}
