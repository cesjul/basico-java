package lambdas;

import java.util.Arrays;
import java.util.List;

public class Foreach {
    public static void main(String[] args) {
        
        List<String> list = Arrays.asList("Name1", "Name2", "Name3");

        System.out.println("Lambda Expression: \n");

        list.forEach((item -> System.out.println(item)));

        System.out.println("\nMethod Reference: \n");

        list.forEach(System.out::println);

        System.out.println("\nLambda Expression: \n");

        list.forEach(item -> recieveItem(item));

         System.out.println("\nMethod Reference: \n");

        list.forEach(Foreach::recieveItem);
    }

    static void recieveItem(String item){
        System.out.println("This is the item: " + item);
    }
}
