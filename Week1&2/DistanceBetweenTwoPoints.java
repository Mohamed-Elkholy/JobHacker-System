package kholy;


import java.util.* ;
public class DistanceBetweenTwoPoints {
    public static double getDistance(double x1 , double y1 , double x2 , double y2){
        double operand1 = Math.pow(Math.abs(x2 - x1) , 2);
        double operand2 = Math.pow(Math.abs(y2 - y1) , 2);
        return (Math.sqrt(operand1 + operand2));
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Formatter formatter = new Formatter();
        double x1 = scanner.nextDouble() , y1 = scanner.nextDouble();
        double x2 = scanner.nextDouble() , y2 = scanner.nextDouble();
        System.out.println(formatter.format("%.4f" , getDistance(x1 , y1 , x2 , y2))) ;
    }
}