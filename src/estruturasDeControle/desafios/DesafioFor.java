package estruturasDeControle.desafios;

public class DesafioFor {
    public static void main(String[] args) {
        String value = "#";
        for(String counting = "."; counting.length() != "......".length(); counting += '.'){
            value += "#";
            System.out.println(value);
        }
    }
}
