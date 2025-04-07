package classes.desafio;

public class Data {
    int day;
    String month;
    int year;

     String getMonth(){
        return this.month;
    }

    String formateDate(){
        String formated = "%d/%s/%d".formatted(this.day, this.month, this.year);

        return formated;
    }
}
