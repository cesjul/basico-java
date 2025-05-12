package colecoes;

import java.util.ArrayDeque;
import java.util.Deque;

public class Pilha {
    public static void main(String[] args) {
        
        Deque<String> stack = new ArrayDeque<>();

        stack.add("Book1");
        stack.add("Book2");
        stack.add("Book3");
        stack.add("Book4");
        stack.add("Book5");
        stack.add("Book6");
        stack.push("Book7");
        stack.push("Book8");

        // System.out.println(stack.peek());
        System.out.println(stack.poll());
        System.out.println(stack.poll());
        System.out.println(stack.remove());

    }
}
