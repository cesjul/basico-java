package colecoes;

import java.util.HashSet;

public class ConjuntoNaoOrdenado {
    @SuppressWarnings({ "rawtypes", "unchecked" }) // Supressing warnings, generics types will be implemented on other file
    public static void main(String[] args) {
        HashSet set = new HashSet();

        set.add("Value");
        set.add(1);

        System.out.println(set);

        HashSet num = new HashSet();

        num.add(1);
        num.add(2);
        num.add(3);
        num.add(4);

        System.out.println(num);
    }
}
