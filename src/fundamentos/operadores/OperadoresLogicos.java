package fundamentos.operadores;

public class OperadoresLogicos {
    public static void main(String[] args) {
        boolean condition1 = true;
        boolean condition2 = 3 > 4;

        System.out.println(condition1 && condition2);
        System.out.println(condition1 || condition2);
        System.out.println(condition1 ^ condition2);
        System.out.println(!(condition1 && condition2));
    }
}
