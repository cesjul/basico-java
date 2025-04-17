package arrays.desafios;

import java.util.Scanner;

public class LendoNotas {
    public static void main(String[] args) {
        Scanner consoleIn = new Scanner(System.in);

        System.out.print("How many grades do you want to insert? ");
        int amountGrades = consoleIn.nextInt();
        double[] grades = new double[amountGrades];

        for (int i = 0; i < amountGrades;i++){
            System.out.printf("%d grade: ", i+1);
            double grade = consoleIn.nextDouble();
            grades[i] = grade;
        }

        double sumGrades = 0;
        for (double grade: grades){
            sumGrades += grade;
        }

        double average = sumGrades / amountGrades;

        System.out.printf("Student avarage is: %.2f", average);
        consoleIn.close();
    }
}
