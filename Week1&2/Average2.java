
import java.util.* ;
public class Average2 {
    public static double getAverage(double a , double b , double c){
        return ((a/10 * 2) + (b/10 * 3) + c/10 * 5) ;
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Formatter formatter = new Formatter();
        double a = scanner.nextDouble();
        double b = scanner.nextDouble();
        double c = scanner.nextDouble();
        System.out.println("MEDIA = " + formatter.format("%.1f" , getAverage(a , b , c))) ;
    }
}