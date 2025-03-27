package estruturasDeControle;

import java.util.Scanner;

public class DoWhile {
    public static void main(String[] args) {
        Scanner consoleIn = new Scanner(System.in);

        String answer = "";

        do{
            System.out.print("Type something: ");
            answer = consoleIn.nextLine();
            System.out.println(answer);


            System.out.print("Do you wanna quit? [Yes][No]");
            answer = consoleIn.nextLine();

        }while(!answer.equalsIgnoreCase("yes"));

        consoleIn.close();
    }
}
