package classes.desafio;

public class Jantar {
    public static void main(String[] args) {
        Pessoa p1 = new Pessoa("Chris", 50.8);
        Comida c1 = new Comida("Triple Smash Burguer", 1.09);

        System.out.println(p1.weight);

        p1.eat(c1);

        System.out.println(p1.weight);
    }
}
