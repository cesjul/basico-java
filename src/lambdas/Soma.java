package lambdas;

public class Soma implements Calculo{
    @Override
    public double execute(double a, double b){
        return a + b;
    }
}
