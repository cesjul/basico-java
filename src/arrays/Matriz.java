package arrays;

import java.util.Scanner;

public class Matriz {
    public static void main(String[] args) {
        Scanner consoleIn = new Scanner(System.in);

        System.out.println("How many students? ");
        int numberOfStudents = consoleIn.nextInt();

        System.out.println("How many grades per student? ");
        int numberOfGrades = consoleIn.nextInt();

        double[][] classGrades = new double[numberOfStudents][numberOfGrades];

       
        for (int i = 0; i < numberOfStudents; i++) {
            
            for(int j = 0; j < numberOfGrades; j++){
                System.out.printf("Insert %d grade for %d student: ", 
                                                 j+1,          i+1);

                double sentGrade = consoleIn.nextDouble();
                classGrades[i][j] = sentGrade;

            }
            
            if ((i + 1) < numberOfStudents){
                System.out.println("Next student...");
            }
        }

        // System.out.println(Arrays.toString(classGrades));
       
        for (int h = 0; h < numberOfStudents; h++) {
            double total = 0;
            for (int g = 0; g < numberOfGrades; g++){
                total += classGrades[h][g];
            }
            System.out.printf("%d student avarage: %.2f\n",
                                          h + 1,      total/numberOfGrades
                                          );
        }
        consoleIn.close();
    }
}
