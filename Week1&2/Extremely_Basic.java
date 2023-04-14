
import java.util.*;
public class Extremely_Basic {

    public static int sum(int num1 , int num2){
        return num1 + num2 ;
    }
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int num1 = s.nextInt() , num2 = s.nextInt();
        System.out.println("X = " + sum(num1 , num2));
    }
}