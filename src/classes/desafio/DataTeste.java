package classes.desafio;

public class DataTeste {
    public static void main(String[] args) {
        Data data1 = new Data();

        data1.day = 30;
        data1.month = "September";
        data1.year = 2025;

        System.out.printf("%d of %s of %d", 
                         data1.day, data1.month, data1.year);

        System.out.println(data1.getMonth());
    }
}
