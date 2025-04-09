package classes;

public class Produto {
    String name;
    double price;
    static double discount = 0.25;

    Produto(String initialName){
        this.name = initialName;
    }

    //default constructor
    Produto(){ 
    }

    double priceWithDiscount(){
        double price = this.price;

        return (price - (price*discount));
    }

}
