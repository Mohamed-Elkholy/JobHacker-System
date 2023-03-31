import java.util.* ;
public class Main {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int num1 = s.nextInt() ;
        int num2 = s.nextInt() ;
        if(num1 % num2 == 0 || num2 % num1 == 0){
            System.out.println("Sao Multiplos");
        }else{
            System.out.println("Nao sao Multiplos");
        }

    }
}