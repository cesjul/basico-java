package lambdas;

import java.util.List;
import java.util.function.BinaryOperator;
import java.util.ArrayList;

public class Calculando {
    public static void main(String[] args) {
        
        Soma sum = new Soma();
        List<Double> list = new ArrayList<>();

        list.add(10.1);
        list.add(7.89);

        double result = sum.sumAll(list);
        System.out.println(result);

//---------------Using lambda functions----------------
        
        Calculo calculating = (x,y) -> {
            return x + y;
        };

        calculating.execute(1, result);

        calculating = (x,y) -> x * y;

        BinaryOperator<Double> calc = (x, y) -> x * y;

        calc.apply(2.3, 6.9);
    }

    
}
