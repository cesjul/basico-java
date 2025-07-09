package poo.polimorfismo;

public class Comida {
    private double weight;

    public Comida(double initialWeight){
        setWeight(initialWeight);
    }

    public void setWeight(double weight){
        if(weight > 0){
            this.weight = weight;
        }
    }

    public double getWeight(){
        return this.weight;
    }
}
