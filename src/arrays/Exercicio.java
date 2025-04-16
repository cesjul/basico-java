package arrays;

import java.util.Arrays;

public class Exercicio {
    public static void main(String[] args) {
        double[] gradesStudent1 = new double[3];
        gradesStudent1[0] = 8.9;
        gradesStudent1[1] = 7.9;
        gradesStudent1[2] = 5;

        System.out.println(Arrays.toString(gradesStudent1));

        double[] gradesStudent2 = {3.4, 4.5, 6, 9.8};

        System.out.println(Arrays.toString(gradesStudent2));
    }
}
