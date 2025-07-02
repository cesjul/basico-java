package poo.encapsulamento;

public class Pessoa {
    private int age;

    Pessoa(int age){
        if (age > 0){
            this.age = age;
        }else{
            this.age = 0;
        }
    }

    public int getAge(){
        return this.age;
    }

    public void updateAge(int newAge){
        if (newAge <= 0){
            this.age = this.getAge();
        } else{
            this.age = newAge;
        }
    }
}
