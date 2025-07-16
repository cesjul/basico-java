package lambdas;

import java.util.function.Predicate;

public class Predicado {
    public static void main(String[] args) {
        Predicate<Produto> isExpensive = product -> product.value > 300.0;

        Produto p1 = new Produto("Headphone", 150.80);

        System.out.println(isExpensive.test(p1));
    }
}
