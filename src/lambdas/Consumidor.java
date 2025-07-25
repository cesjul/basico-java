package lambdas;

import java.util.function.Consumer;

public class Consumidor {
    public static void main(String[] args) {
        Consumer<Produto> productName = product -> System.out.println(product.name);

        Produto p1 = new Produto("Notebook", 10.0);

        productName.accept(p1);
    }
}
