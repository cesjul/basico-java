package classes;

public class Produto {
    String name;
    double price;
    double discount;

    Produto(String initialName){
        this.name = initialName;
    }

    //default constructor
    Produto(){ 
    }

    double priceWithDiscount(){
        double discount = this.discount;
        double price = this.price;

        return (price - (price*discount));
    }

}
