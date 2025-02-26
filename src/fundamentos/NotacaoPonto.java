package fundamentos;

public class NotacaoPonto {
    public static void main(String[] args) {
        String a = "Olá";
        a = a.toUpperCase();
        a = a.replace("Á", "ou");
        a = a.concat("!!!");
        System.out.println(a);

        String b = "Seja bem vindo".toUpperCase()
                                   .replace("O", "A")
                                   .concat("!!!");
        
        System.out.println(b);
    }
}
