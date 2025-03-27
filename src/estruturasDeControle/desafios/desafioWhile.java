package estruturasDeControle.desafios;

import java.util.Scanner;

public class desafioWhile {
    public static void main(String[] args) {
        Scanner consoleIn = new Scanner(System.in);

        boolean state = true;
        double grade = 0;
        int gradeNumbers = 0;

        while (state) {
            System.out.print("Type the student grade: ");
            double sentGrade = consoleIn.nextDouble();
            consoleIn.nextLine();

            if (sentGrade >= 0 && sentGrade <= 10) {
                grade += sentGrade;
                gradeNumbers++;
                System.out.println(sentGrade);
            }

            if (sentGrade == -1){
                state = false;
                System.out.println("All grades were sent...");
            }
        }

        double avarage = grade / gradeNumbers;

        System.out.printf("Students avarage is: %.2f", avarage);
        consoleIn.close();
    }
}
