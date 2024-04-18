package Lab;

import Lab.Employee;

public class Developer extends Employee {
    private String programmingLanguage = "";

    public Developer(){
        programmingLanguage = "Java";
    }   // sets the programing language to default Java

    public String getProgrammingLanguage(){ return programmingLanguage; }  // returns the programming language

    // prints the details of the developer, calls getDetails in the Lab.Employee class to print name/ID
    public void printProgrammingLanguage(){
        System.out.println("Lab.Developer Details: ");
        System.out.print(getDetails());
        System.out.println("Programming Language: " + getProgrammingLanguage());
        System.out.println();
    }
}
