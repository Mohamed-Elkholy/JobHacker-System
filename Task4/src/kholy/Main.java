package kholy;


import java.util.* ;
public class Main {
    public static double getDistance(double x1 , double y1 , double x2 , double y2){
        double operand1 = Math.pow(Math.abs(x2 - x1) , 2);
        double operand2 = Math.pow(Math.abs(y2 - y1) , 2);
        return (Math.sqrt(operand1 + operand2));
    }
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        Formatter f = new Formatter();
        double x1 = s.nextDouble() , y1 = s.nextDouble();
        double x2 = s.nextDouble() , y2 = s.nextDouble();
        System.out.println(f.format("%.4f" , getDistance(x1 , y1 , x2 , y2))) ;
    }
}