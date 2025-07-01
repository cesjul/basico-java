package poo.heranca.desafio;

public class Carro {
    private int currentSpeed = 0;
    private final int MAX_SPEED;
    private int speedRate = 5;

    Carro(int maxSpeed){
        this.MAX_SPEED = maxSpeed;
    }

    void accelerate(){
        if ((this.currentSpeed + speedRate) > MAX_SPEED){
            this.currentSpeed = MAX_SPEED;
        }else{
            this.currentSpeed += speedRate;
        }
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
