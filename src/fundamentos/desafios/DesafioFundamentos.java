package fundamentos.desafios;

import java.util.Scanner;

public class DesafioFundamentos {
    public static void main(String[] args) {
        Scanner consoleIn = new Scanner(System.in);

        System.out.print("Digite um numero: ");
        double num1 = consoleIn.nextDouble();
        consoleIn.nextLine();

        System.out.print("Digite a operação: ");
        String op = consoleIn.next();

        System.out.print("Digite o segundo numero: ");
        double num2 = consoleIn.nextDouble();
        consoleIn.nextLine();


        boolean isSum = op.equals("+");
        boolean isLess = op.equals("-");
        boolean isMulti = op.equals("*");
        boolean isDiv = op.equals("/");
        boolean isModule = op.equals("%");

        
        double result = isSum == true ? num1 + num2 : 0;
        result = isLess == true ? num1 - num2 : result;
        result = isMulti == true ? num1 * num2 : result;
        result = isDiv == true ? num1 / num2 : result;
        result = isModule == true ? num1 % num2 : result;

        System.out.printf("%.2f %s %.2f = %.2f", num1, op, num2, result);

        consoleIn.close();
    }
}
