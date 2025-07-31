package lambdas;

import java.util.function.UnaryOperator;

public class OperadorUnario {
    public static void main(String[] args) {
        UnaryOperator<Integer> plusTwo = number -> number + 2;
        UnaryOperator<Integer> multTwo = number -> number * 2;
        UnaryOperator<Integer> atSquare = number -> number * number;

        int result = plusTwo.andThen(multTwo).andThen(atSquare).apply(2);

        System.out.println(result);
    }
}
