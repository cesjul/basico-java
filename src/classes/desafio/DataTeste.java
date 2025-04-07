package classes.desafio;

public class DataTeste {
    public static void main(String[] args) {
        Data data1 = new Data();
        Data data2 = new Data();

        data1.day = 30;
        data1.month = "September";
        data1.year = 2025;

        data2.day = 1;
        data2.month = "March";
        data2.year = 1990;

        System.out.printf("%d of %s of %d\n", 
                         data1.day, data1.month, data1.year);

        System.out.println(data1.getMonth());
        System.out.println(data1.formateDate());
        System.out.println(data2.formateDate());
    }
}
