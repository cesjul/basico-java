package poo.composicao.desafio;

public class Produto {
    private String name;
    private double price;

    Produto(String name, double price){
        this.name = name;
        this.price = price;
    }

    public void setPrice(double price){
        this.price = price;
    }

    public double getPrice(){
        return this.price;
    }

    public void setName(String name){
        this.name = name;
    }

    public String getString(){
        return this.name;
    }
}
