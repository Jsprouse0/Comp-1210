package Lab;

class Employee{
    private String name = "";
    private Integer employeeId = 0;


    // base constructor for the employee class if no new employee name or ID is given
    public Employee(){
        name = "John Doe";
        this.employeeId += 101;
    }

    // if user wants to set a new employee they can set their id and name
    public void setEmployee(String employeeName, int employeeId){
        name = employeeName;
        this.employeeId = employeeId;
    }

    // will return the employee ID and name when called
    public String getDetails(){
        return "Lab.Employee ID: " + employeeId
                +"\n" + "Name: " + name + "\n";
    }


    public static void main(String[] args){
        Developer dev = new Developer();    // developer class object
        Manager manager = new Manager();    // Lab.Manager class object

        dev.setEmployee("Alice Smith", 202);    // new employee instead of base employee constructor

        manager.printDepartment();  // prints the details of the manager in Lab.Manager.java
        dev.printProgrammingLanguage(); // prints the details of the developer in Lab.Developer.java

    }
}