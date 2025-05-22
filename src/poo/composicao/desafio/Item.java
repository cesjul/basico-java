package poo.composicao.desafio;

public class Item {
    Produto product;
    int quantity;

    Item(Produto product, int quantity){
        this.product = product;
        this.quantity = quantity;
    }

    public String getString(){
        
        return this.product.getString();
    }

}
