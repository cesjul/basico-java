package classes;

public class ProdutoTeste {
    public static void main(String[] args) {
        Produto p1 = new Produto("Computer");
        p1.price = 400.59;
        System.out.println(p1.priceWithDiscount());

        Produto p2 = new Produto("Cellphone");
        p2.price = 800.68;
        System.out.println(p2.priceWithDiscount());
    }
}
