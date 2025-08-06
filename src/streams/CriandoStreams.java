package streams;

import java.util.Arrays;
import java.util.function.Consumer;
import java.util.stream.Stream;

public class CriandoStreams {
    public static void main(String[] args) {
        Consumer<String> print = System.out::println;

        Stream<String> langs = Stream.of("Java", "Python", "PHP");
        langs.forEach(print);

        String[] moreLangs = {"C", "C++", "COBOL"};

        Stream.of(moreLangs).forEach(print);
        Arrays.stream(moreLangs, 0, 1);
    }
}
