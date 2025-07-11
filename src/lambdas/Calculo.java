package lambdas;

import java.util.List;

@FunctionalInterface
public interface Calculo {
    
    double execute(double a, double b);

    default double sumAll(List<Double> list){
        double result = 0;
        for (Double item : list) {
            result += item;
        }

        return result;
    }
}
