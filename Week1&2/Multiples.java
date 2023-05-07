import java.util.* ;
public class Multiples {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num1 = scanner.nextInt() ;
        int num2 = scanner.nextInt() ;
        if(num1 % num2 == 0 || num2 % num1 == 0){
            System.out.println("Sao Multiplos");
        }else{
            System.out.println("Nao sao Multiplos");
        }

    }
}