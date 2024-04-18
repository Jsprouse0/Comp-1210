package Lab;

import java.util.Scanner;
import java.util.ArrayList;

/**
 * Student Lab.Manager class takes an array list and will update and display the students in the list.
 * @author Jacob Sprouse
 * @version 1.0
 */
public class StudentManager{

    // Boolean function to check if the name is valid by matching the characters to the pattern variable
    public boolean Valid_Name(String student_name){
        String pattern = "^[a-zA-Z\\s'-]+$";

        return student_name.matches(pattern);
    }

    public String Valid_Choice(int user_choice){
        if((user_choice != 1) && (user_choice != 2) && (user_choice != 3)){
            return "Invalid Choice...Try again.";
        }
        return "";
    }

    // Add_student will take an array list and user input to add the student to the array list
    public void Add_Student(ArrayList<String> student_list, String student_name){
        if(Valid_Name(student_name)) {
            student_list.add(student_name);

            System.out.println(student_name + " has been added to the student list.");
            System.out.println();
        }
        else{
            System.out.println("Invalid Name...Please input a valid name");
            System.out.println();
        }
    }


    // Display_Students will take the array list and use an enhanced for loop to display all names in the list
    public void Display_Students(ArrayList<String> student_list){
        System.out.println("Student List:");
        for(String name : student_list){
            System.out.println(name);
        }
        System.out.println();
    }


    // Student_Manager_Menu is a static function that is called in main until the user decides to exit the program
    public static void Student_Manager_Menu (){
        System.out.println("Student Lab.Manager Menu: ");
        System.out.println(1 + ". " + "Add Student");
        System.out.println(2 + ". " + "Display Student List");
        System.out.println(3 + ". " + "Exit");
        System.out.print("Enter your choice: ");

    }


    public static void main(String[] args){
        Scanner scnr = new Scanner(System.in);
        ArrayList<String> student_list = new ArrayList<String> ();
        StudentManager Menu = new StudentManager(); // menu object to add and display students
        int menu_choice;    // user choice for the manager
        String student_name;    // name of the student to pass through the menu object into the Add_Student function

        // first choice for the user before the loop begins
        Student_Manager_Menu();
        menu_choice = scnr.nextInt();

        if(menu_choice == 3){
            System.out.println("Exiting Student Lab.Manager. Goodbye!");
        }

        Menu.Valid_Choice(menu_choice);
        while(menu_choice != 3){
            if(menu_choice == 1){   // choice 1 will ask the user to input the student's name and then add that student
                System.out.print("Enter the student's name: ");
                student_name = scnr.next();

                Menu.Add_Student(student_list, student_name);
            }

            else if (menu_choice == 2){   // if user chooses choice 2 it will execute the Display_Students function
                Menu.Display_Students(student_list);
            }


            Student_Manager_Menu(); // gives menu for choices and user picks again to continue or exit loop
            menu_choice = scnr.nextInt();

            if(menu_choice == 3){ // if user chooses choice 3 the program will say GoodBye! and exit program
                System.out.println("Exiting Student Lab.Manager. Goodbye!");
            }
            Menu.Valid_Choice(menu_choice);
        }
    }
}