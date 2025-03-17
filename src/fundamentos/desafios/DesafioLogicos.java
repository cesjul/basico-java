package fundamentos.desafios;

public class DesafioLogicos {
    public static void main(String[] args) {
        boolean condition1 = false;
        boolean condition2 = true;

        boolean allTrue = condition1 && condition2;
        boolean oneTrue = condition1 || condition2;

        System.out.println(allTrue);
        System.out.println(oneTrue);
    }
}
