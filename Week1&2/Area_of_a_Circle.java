
import java.util.*;

public class Area_of_a_Circle {
    public static final double PI = 3.14159;
    public static double getArea(double r){
        return PI * Math.pow(r , 2);
    }
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        Formatter formatter = new Formatter();
        double r = s.nextDouble();
        formatter.format("%.4f" , getArea(r));
        System.out.println("A=" + formatter);
    }
}