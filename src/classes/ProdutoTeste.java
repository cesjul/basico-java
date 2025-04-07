package classes;

public class ProdutoTeste {
    public static void main(String[] args) {
        Produto p1 = new Produto("Computer");
        double a = 0.1;

        p1.discount = a;
        p1.price = 400.59;

        System.out.printf("%s is costing %.2f with %.1f off\n", 
                                p1.name, p1.price, p1.discount * 100);
                            
        System.out.println(p1.priceWithDiscount());
    }
}
