package estruturasDeControle;

public class SwitchComBreak {
    public static void main(String[] args) {
        String grade = "";
        int intGrade = 6;

        switch(intGrade){
            case 10:
                grade = "A+";
                break;
            case 9:
                grade = "A";
                break;
            case 8:
                grade = "A-";
                break;
            case 7: case 6:
                grade = "B";
                break;
            default:
                grade = "Invalid grade";
                break;
       }

       System.out.println(grade);
    }
}
