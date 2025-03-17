package fundamentos.operadores;

public class OperadoresAtribuicao {
    public static void main(String[] args) {
        int a = 1;
        int b = a;
        int c = a + b;

        c += b;
        c -= b;
        c *= b;
        c /= b;
        c %= b;

        System.out.println(c);
    }
}
