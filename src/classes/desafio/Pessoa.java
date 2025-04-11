package classes.desafio;

public class Pessoa {
    String name;
    double weight;

    Pessoa(String name, double weight){
        this.name = name;
        this.weight = weight;
    }

    public void eat(Comida food){
        if(food != null){
            this.weight += food.weight;
        }
    }
}
