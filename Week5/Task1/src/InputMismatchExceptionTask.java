import java.util.InputMismatchException;
import java.util.Scanner;

public class InputMismatchExceptionTask  {
    static public Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
        int num1 , num2 , sum;
        boolean valid = false ;
        while(!valid){
            try {
                System.out.println("Enter the first number");
                num1 = scanner.nextInt();
                System.out.println("Enter the second number");
                num2 = scanner.nextInt();
                sum = num1 + num2 ;
                System.out.println("Sum = " + sum);
                valid = true ;
            } catch (InputMismatchException e) {
                System.out.println("Error! : Input is invalid");
                scanner.nextLine() ;
            }
        }
    }
}