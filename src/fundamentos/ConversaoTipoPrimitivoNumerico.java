package fundamentos;

public class ConversaoTipoPrimitivoNumerico {
    public static void main(String[] args) {

        double a = 1; // conversao implicita
        System.out.println(a);

        float f = (float) 1.0; // conversao explicita (cast)
        System.out.println(f);

        int i = 4;
        byte b = (byte) i;
        System.out.println(b);
    }
}
