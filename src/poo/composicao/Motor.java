package poo.composicao;

public class Motor {
    double acelaration = 1;
    boolean state = false;

    int rotation(){
        if (!state){
            return 0;
        }
        
        return (int) Math.round(acelaration * 2000);
}
}
