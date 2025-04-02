package estruturasDeControle;

public class Break {
    public static void main(String[] args) {

        for (int i = 0; i < 10; i++) {
            
            if (i > 5){
                System.out.println("breaking...");
                break;
            }
            
            System.out.println(i);
        }
    }
}
