package fundamentos;

import javax.swing.JOptionPane;

public class ConversaoStringNumero {
    public static void main(String[] args) {
        String valor1 = JOptionPane.
        showInputDialog("Digite o primeiro numero: ");
        String valor2 = JOptionPane.
        showInputDialog("Digite o segundo numero: ");

        double num1 = Double.parseDouble(valor1);
        double num2 = Double.parseDouble(valor2);

        double sum = num1 + num2;

        System.out.printf("%.2f + %.2f = %.2f", num1, num2, sum);
    }
}
