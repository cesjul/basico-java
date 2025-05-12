package colecoes;

import java.util.LinkedList;
import java.util.Queue;

public class Fila {
    public static void main(String[] args) {
        Queue<String> queues = new LinkedList<>();

        queues.add("Name");
        queues.offer("Name1");

        System.out.println(queues.peek());

        System.out.println(queues.poll());

        System.out.println(queues.peek());

    }
}
