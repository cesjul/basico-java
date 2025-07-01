package poo.heranca.desafio;

public class Porsche extends Carro {
    static private final int MAX_SPEED = 300;

    Porsche(){
        super(MAX_SPEED);
    }

    void accelerate(){
        super.accelerate();
        super.accelerate();
        super.accelerate();
    }

    void Break(){
        super.Break();
        super.Break();
    }
}
