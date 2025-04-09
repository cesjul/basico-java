package classes;

public class Area {
    double ray;
    private static final double PI = 3.14159265;

    Area(double ray){
        this.ray = ray;
    }

    double circunArea(){
        double area = PI * Math.pow(ray, 2);

        return area;
    }
}
