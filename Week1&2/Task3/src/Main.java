
import java.util.* ;
public class Main {
    public static double getAverage(double a , double b , double c){
        return ((a/10 * 2) + (b/10 * 3) + c/10 * 5) ;
    }
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        Formatter f = new Formatter();
        double a = s.nextDouble();
        double b = s.nextDouble();
        double c = s.nextDouble();
        System.out.println("MEDIA = " + f.format("%.1f" , getAverage(a , b , c))) ;
    }
}