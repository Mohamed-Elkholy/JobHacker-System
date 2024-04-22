
import java.util.*;

public class AreaOfCircle {
    public static final double PI = 3.14159;
    public static double getArea(double r){
        return PI * Math.pow(r , 2);
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Formatter formatter = new Formatter();
        double r = scanner.nextDouble();
        formatter.format("%.4f" , getArea(r));
        System.out.println("A=" + formatter);
    }
}