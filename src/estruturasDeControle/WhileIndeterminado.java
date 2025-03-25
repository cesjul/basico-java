package estruturasDeControle;

import java.util.Scanner;

public class WhileIndeterminado {
    public static void main(String[] args) {
        boolean state = true;

        Scanner consoleIn = new Scanner(System.in);
        while (state) {

            System.out.print("Type something (to exit type 'exit'): ");
            String message = consoleIn.nextLine();

            System.out.println(message);

            if (message.equalsIgnoreCase("exit")) {
                state = false;
                System.out.println("Leaving...");
            }

        }
        consoleIn.close();
    }
}
