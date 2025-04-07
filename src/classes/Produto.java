package classes;

public class Produto {
    String name;
    double price;
    double discount;

    double priceWithDiscount(){
        double discount = this.discount;
        double price = this.price;

        return (price - (price*discount));
    }

}
