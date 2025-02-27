package fundamentos;

public class TipoString {
    public static void main(String[] args) {
        System.out.println("Olá".charAt(0));
        System.out.println("ola".startsWith("o"));

        String s = "Ola, bom dia";
        System.out.println(s.equals("olá"));
        System.out.println(s.equalsIgnoreCase("ola, bom dia"));

        String nome = "Nome";
        System.out.printf("Olá, %s!\n", nome);

        int idade = 20;
        double altura = 1.87;

        System.out.printf("%s tem %d anos e %.2fm de altura\n", 
                         nome, idade, altura);
        
        String frase = String.format("%s tem %d anos e %.2fm de altura", 
                        nome, idade, altura);
        System.out.println(frase);

    }
}
