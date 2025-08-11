package streams;

import java.util.Arrays;
import java.util.List;

public class Filter {
    public static void main(String[] args) {
        
        Product p1 = new Product("p1", 400);
        Product p2 = new Product("p2", 600);
        Product p3 = new Product("p3", 800);
        Product p4 = new Product("p4", 1000);
    
        List<Product> products = Arrays.asList(p1, p2, p3, p4);
        products.stream()
                .filter(x -> x.price > 567.90)
                .map(x -> x.name + " - Taxes are applicable")
                .forEach(System.out::println);
    }
}

class Product {

    final String name;
    final double price;

    Product(String name, double price){
        this.name = name;
        this.price = price;
    }
    
}