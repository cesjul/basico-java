package lambdas;

import java.util.function.Function;

public class Funcao {
    public static void main(String[] args) {
        Function<Integer, String> evenOrOdd = number -> number % 2 == 0 ? "Even": "Odd";

        System.out.println(evenOrOdd.apply(140505));

        Function<String, String> formatResult = string -> "The result is: " + string;

        //                                                        Solved
        //                                                        First
        System.out.println(evenOrOdd.andThen(formatResult).apply(506));


    }
}
