package streams;

import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.stream.Stream;

public class imprimindoObjetos {
    public static void main(String[] args) {
        List<String> approvedList = Arrays.asList("Steve", "Guido", "Linus");

        for (int i = 0; i < approvedList.size(); i++){
            System.out.println(approvedList.get(i));
        }

        Iterator<String> iterator = approvedList.iterator();

        System.out.println("\nUsing Iterator:\n");

        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }

         System.out.println("\nUsing Stream:\n");

        Stream<String> stream = approvedList.stream();
        stream.forEach(System.out::println);

    }
}
