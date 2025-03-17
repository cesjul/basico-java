package fundamentos.desafios;

import java.util.Scanner;

public class DesafioConversao {
    public static void main(String[] args) {
        Scanner consoleIn = new Scanner(System.in);

        System.out.print("Insira o primeiro salario: ");
        String salary1 = consoleIn.nextLine();

        System.out.print("Insira o segundo salario: ");
        String salary2 = consoleIn.nextLine();

        System.out.print("Insira o terceiro salario: ");
        String salary3 = consoleIn.nextLine();

        salary1 = salary1.replace(",", ".");
        double num1 = Double.parseDouble(salary1);

        salary2 = salary2.replace(",", ".");
        double num2 = Double.parseDouble(salary2);

        salary3 = salary3.replace(",", ".");
        double num3 = Double.parseDouble(salary3);

        double average = (num1 + num2 + num3)/3;

        System.out.printf
        ("Os salarios: %.2f; %.2f; %.2f. Tem uma média de %.2f",
                num1, num2, num3, average);

        consoleIn.close();
    }
}
