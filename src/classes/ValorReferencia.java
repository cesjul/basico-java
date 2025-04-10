package classes;

public class ValorReferencia {
    public static void main(String[] args) {
        double a = 7.89;
        double b = a;

        a --;

        System.out.println(a);
        System.out.println(b);

        Produto product = new Produto("Cellphone");
        Produto p2 = product;

        p2.name = "Car";
        
        System.out.println(p2.name);
        System.out.println(product.name);

    }
}
