package classes.desafio;

public class DataTeste {
    public static void main(String[] args) {
        Data data1 = new Data(14, "March", 2005);
        Data data2 = new Data();

        System.out.println(data1.formateDate());
        System.out.println(data2.formateDate());
    }
}

