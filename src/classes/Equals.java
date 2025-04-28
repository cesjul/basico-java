package classes;

public class Equals {
    public static void main(String[] args) {
        Usuario u1 = new Usuario();
        u1.name = "James";
        
        Usuario u2 = new Usuario();
        u2.name = "James";

        System.out.println(u2.equals(u1));
    }
}
