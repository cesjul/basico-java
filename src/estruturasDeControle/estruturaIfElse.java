package estruturasDeControle;

import javax.swing.JOptionPane;

public class estruturaIfElse {
    public static void main(String[] args) {
        String value = JOptionPane.showInputDialog("Type a number: ");

        int number = Integer.parseInt(value);

        if ((number % 2) == 0){
            System.out.println("Peer number");
        }
        else{
            System.out.println("Odd number");
        }
    }
}
