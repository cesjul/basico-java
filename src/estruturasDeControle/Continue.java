package estruturasDeControle;

public class Continue {
    public static void main(String[] args) {
        
        for (int i = 0; i < 10; i++) {
            
            if (i == 5){
                System.out.println("skiping...");
                continue;
            }

            System.out.println(i);
        }
    }
}
