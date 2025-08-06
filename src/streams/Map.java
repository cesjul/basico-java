package streams;

import java.util.Arrays;
import java.util.List;

public class Map {
    public static void main(String[] args) {
        List<Double> prices = Arrays.asList(230.50, 5678.78, 345.23);
        prices.stream()
                        .map(p -> p * 1.005)
                        .forEach(System.out::println);

        
    }
}
