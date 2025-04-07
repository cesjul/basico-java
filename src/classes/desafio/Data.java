package classes.desafio;

public class Data {
    int day;
    String month;
    int year;

    Data(int day, String month, int year){
        this.day = day;
        this.month = month;
        this.year = year;
    }

    Data(){
        this.day = 1;
        this.month = "January";
        this.year = 1970;
    }

    String getMonth(){
        return this.month;
    }

    String formateDate(){
        String formated = "%d/%s/%d".formatted(this.day, this.month, this.year);

        return formated;
    }
}
