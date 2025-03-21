package estruturasDeControle.desafios;

import java.util.Scanner;

public class desafioDiaDaSemana {
    public static void main(String[] args) {
        Scanner consoleIn = new Scanner(System.in);

        System.out.print("Type a week day: ");
        String weekDay = consoleIn.nextLine();

        if (weekDay.toLowerCase().equals("sunday")){
            System.out.println(1);
        } else if (weekDay.toLowerCase().equals("monday")){
            System.out.println(2);
        } else if (weekDay.toLowerCase().equals("tuesday")){
            System.out.println(3);
        } else if (weekDay.toLowerCase().equals("wednesday")){
            System.out.println(4);
        } else if (weekDay.toLowerCase().equals("thursday")){
            System.out.println(5);
        } else if (weekDay.toLowerCase().equals("friday")){
            System.out.println(6);
        } else if (weekDay.toLowerCase().equals("saturday")){
            System.out.println(7);
        } else {
            System.out.println("Type a valid day!");
        }

        consoleIn.close();
    }
}
