package poo.heranca.desafio;

public class Carro {
    private int currentSpeed = 0;

    void accelerate(){
        this.currentSpeed += 5;
    }

    void Break(){
        if (this.currentSpeed == 0){
            this.currentSpeed = 0;
        }
        else{
            this.currentSpeed -= 5;
        }
        
    }

    int getSpeed(){
        return this.currentSpeed;
    }
}
