package estruturasDeControle;

public class BreakRotulado {
    public static void main(String[] args) {
        outter: for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.printf("%d %d", i, j);
                break outter;
            }
        }
    }
}
