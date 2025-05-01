package colecoes;

import java.util.ArrayList;

public class Lista {
    public static void main(String[] args) {
        ArrayList<Usuario> list = new ArrayList<>();

        Usuario user1 = new Usuario("James");
        Usuario user2 = new Usuario("Jonas");
        Usuario user3 = new Usuario("Jilmar");

        list.add(user1);
        list.add(user2);
        list.add(user3);

        for (Usuario users : list) {
            System.out.println(users.name);
        }

        System.out.println(list.get(0));

    }
}
