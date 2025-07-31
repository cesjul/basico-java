package lambdas;

import java.util.HashSet;
import java.util.function.Supplier;

public class Fornecedor {
    public static void main(String[] args) {
        Supplier<HashSet<Integer>> noEqualsNumbers = () -> HashSet.newHashSet(7);

        System.out.println(noEqualsNumbers.get());
    }
}
