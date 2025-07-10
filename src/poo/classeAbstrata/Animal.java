package poo.classeAbstrata;

public abstract class Animal {
    protected double weight;

    public abstract void eat();
    public abstract void sleep();
    public abstract void walk();

    public String breathe(){
        return "C02";
    }
}
