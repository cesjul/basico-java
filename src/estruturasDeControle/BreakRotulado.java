package estruturasDeControle;

public class BreakRotulado {
    public static void main(String[] args) {
        outter: for (int i = 0; i < 3; i++) {
            
            System.out.printf("%d", i);
            if (i == 4){

                break outter;
            }
            
        }
    }
}
