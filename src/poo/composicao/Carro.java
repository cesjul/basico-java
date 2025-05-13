package poo.composicao;

public class Carro {
    Motor engine = new Motor();

    public void accelerate(){
        engine.acelaration += 0.4;
    }

    public void slowDown(){
        engine.acelaration -= 0.4;
    }

    public void engineOn(){
        engine.state = true;
    }
}
