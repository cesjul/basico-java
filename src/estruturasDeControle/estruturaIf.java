package estruturasDeControle;

import java.util.Scanner;

public class estruturaIf {
    public static void main(String[] args) {
        Scanner consoleIn = new Scanner(System.in);

        System.out.print("Insert student`s grade: ");
        double grade = consoleIn.nextDouble();

        if (grade <= 10 && grade >= 7.0){
            System.out.println("Student Graduated!");
            System.out.println("Congrats!");
        }

        if (grade < 7 && grade >= 5){
            System.out.println("Student on Recovey");
        }
        
        if (grade < 5){
            System.out.println("Student Reproved");
        }

        consoleIn.close();
    }
}
