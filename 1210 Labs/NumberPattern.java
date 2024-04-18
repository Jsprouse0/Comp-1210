import java.util.Scanner;

public class NumberPattern {

    public static void printNumberPattern(int num1, int num2){
        if(num1 < 0){
            return;
        }
        else{
            for(int i = num1; i >= -num2; i-=num2){
                System.out.print(i + " ");
                printNumberPattern(num1+num2, num2);
            }

        }
    }

    public static void main(String[] args){
        Scanner scnr = new Scanner(System.in);
        int num1;
        int num2;

        num1 = scnr.nextInt();
        num2 = scnr.nextInt();

        printNumberPattern(num1, num2);

    }
}
