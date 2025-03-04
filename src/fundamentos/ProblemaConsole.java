package fundamentos;
import java.util.Scanner;

public class ProblemaConsole {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Digite seu nome: ");
        String name = input.nextLine();

        System.out.print("Digite sua idade: ");
        int age = input.nextInt();
        input.nextLine();

        System.out.print("Digite seu sexo: ");
        String gender = input.nextLine();

        System.err.printf("Nome: %s, Idade: %d, Sexo: %s", 
                           name, age, gender);

        input.close();

    }
}
