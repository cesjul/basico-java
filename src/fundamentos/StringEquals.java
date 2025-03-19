package fundamentos;

import java.util.Scanner;

public class StringEquals {
    public static void main(String[] args) {
        System.out.println("2" == "2");
        
        String a = new String("2");
        System.out.println(a == "a");
        System.out.println(a.equals("2"));

        Scanner consoleIn = new Scanner(System.in);

        String s = consoleIn.next();
        System.out.println("2".equals(s.trim()));

        consoleIn.close();
    }
}
