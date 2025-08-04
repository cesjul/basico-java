package lambdas;

import java.util.function.BiFunction;
import java.util.function.BinaryOperator;
import java.util.function.Predicate;

public class OperadoBinario {
    public static void main(String[] args) {
        BinaryOperator<Double> average = (n1, n2) -> (n1 + n2) / 2;
        BiFunction<Double, Double, String> gradeAverage =
                    (n1, n2) -> ((n1 + n2) / 2) >= 5.0 ? "Approved" : "Disapproved";
        
        Predicate<Double> isEqualOrHigherThanFive = n -> n >= 5.0;

        System.out.println(average.apply(10.0, 6.0));
        System.out.println(gradeAverage.apply(10.0, 6.8));
        System.out.println(isEqualOrHigherThanFive.test(7.0));
       
    }
}
