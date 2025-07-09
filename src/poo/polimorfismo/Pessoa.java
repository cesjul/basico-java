package poo.polimorfismo;

public class Pessoa {
    private double weight;

    public Pessoa(double initialWeight){
        setWeight(initialWeight);
    }

    public void setWeight(double weight){
        if (weight > 0) {
            this.weight = weight;
        }
    }

    public double getWeight() {
        return weight;
    }

    public void eat(Comida food){
        this.weight += food.getWeight();
    }
}
