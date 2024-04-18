package Lab;

import Lab.Employee;

public class Manager extends Employee {
    private String department = "";

    public Manager(){
        department = "Sales";
    }   // sets the department of managers to Sales

    public String getDepartment(){
        return department;
    }   // gets the department of the manager

    // prints the details of the manager class, calls getDetails to print name/ID of the employee
    public void printDepartment(){
      System.out.println("Lab.Manager Details: ");
      System.out.print(getDetails());
      System.out.println("Department: " + getDepartment());
      System.out.println();
    }
}
