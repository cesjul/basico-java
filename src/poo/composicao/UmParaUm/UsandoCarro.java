package poo.composicao.UmParaUm;

public class UsandoCarro {
    public static void main(String[] args) {
        Carro corsa = new Carro();
        
        corsa.engineOn();
        corsa.accelerate();
        corsa.accelerate();
        corsa.accelerate();

        System.out.println(corsa.engine.rotation());

        corsa.slowDown();

        System.out.println(corsa.engine.rotation());
    }
}
