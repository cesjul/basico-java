package fundamentos;
import java.util.Scanner;

public class Console {
    public static void main(String[] args) {
        System.out.print("Ola");
        System.out.println(", Bom dia");
        System.out.printf("Meu nome é %s%n", "Nome");
        System.out.print("!");

        Scanner consoleIn = new Scanner(System.in);

        System.out.print("\nDigite seu nome: ");
        String userName = consoleIn.nextLine();
        int nameLength = userName.length();
        System.out.printf("%s tem %d letras", userName, nameLength);
        
        consoleIn.close();
        
    }
}
