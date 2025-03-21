package estruturasDeControle;

import java.util.Scanner;

public class estruturaIfElseIf {
    public static void main(String[] args) {
        Scanner consoleIn = new Scanner(System.in);

        System.out.print("Type a grade: ");
        double grade = consoleIn.nextDouble();

        if (grade > 10 || grade < 0){
            System.out.println("Invalid grade");
        } else if (grade >= 8.1){
            System.out.println("Grade is A");
        } else if (grade < 8.1 && grade >= 6.0){
            System.out.println("Grade is B");
        } else if (grade < 6 && grade >= 5.0){
            System.out.println("Grade is C");
        } else if (grade < 5){
            System.out.println("Grade is D");
        }
            
        

        consoleIn.close();
    }
}
