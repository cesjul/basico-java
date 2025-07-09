package poo.polimorfismo;

public class Jantar {
    public static void main(String[] args) {
        Pessoa p1 = new Pessoa(90);

        Comida rice = new Arroz(0.3);
        Comida beans = new Feijao(0.1);
        Comida icecream = new Sorvete(0.2);

        p1.eat(rice);
        p1.eat(beans);
        p1.eat(icecream);

        System.out.println(p1.getWeight());
    }
}
