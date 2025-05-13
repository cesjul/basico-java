package colecoes;

import java.util.HashSet;

public class Hash {
    public static void main(String[] args) {
        HashSet<Usuario> users = new HashSet<>();

        users.add(new Usuario("James"));
        users.add(new Usuario("Jack"));
        users.add(new Usuario("Will"));

        System.out.println(users.contains(new Usuario("Will")));
    } 
}
