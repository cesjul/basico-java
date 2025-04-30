package colecoes;

import java.util.Set;
import java.util.HashSet;

public class ConjuntoHomogenio {
    public static void main(String[] args) {
        Set<String> set = new HashSet<String>();

        set.add("Value");
        set.add("Another Value");
        set.add("Again");

        System.out.println(set);

        for (String element : set) {
            System.out.println(element);
        }
    }
}
