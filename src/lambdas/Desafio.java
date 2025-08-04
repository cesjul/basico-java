package lambdas;

import java.util.function.BinaryOperator;
import java.util.function.Function;
import java.util.function.UnaryOperator;

public class Desafio {
    public static void main(String[] args) {
        Produto laptop = new Produto("MacBook", 2500);
                                                           // Final price will have 12.5 off
        BinaryOperator<Double> percentDesc = (n, p) -> (n *(1 - p));
        UnaryOperator<Double> taxesCalc = n -> n >= 2500.0 ? n * 1.085 : n;
        UnaryOperator<Double> shippingFee = n -> n >= 3000.0 ? (n += 100.0) : (n += 50.0);
        UnaryOperator<Double> round = n -> Double.parseDouble(String.format("%.2f", n).replace(",", "."));
        Function<Double, String> formating = n -> ("R$" + n).replace(".", ",");

        String finalFormat = percentDesc.andThen(taxesCalc).andThen(shippingFee).andThen(round).andThen(formating).apply(laptop.value, 0.125);

        System.out.println(finalFormat);
    }
}
