package poo.heranca.desafio;

public class Dirigindo {
    public static void main(String[] args) {
        Carro celta = new Celta();
        Carro porsche = new Porsche();

        celta.accelerate();
        celta.accelerate();

        porsche.Break();
        porsche.accelerate();
        porsche.Break();
        

        System.out.println(celta.getSpeed());
        System.out.println(porsche.getSpeed());
    }
}
