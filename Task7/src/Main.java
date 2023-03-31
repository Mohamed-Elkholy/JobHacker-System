import java.util.* ;
public class Main {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int[] arr = new int[5];
        int cntPositive = 0 , cntNegative = 0 ;
        int cntEven = 0 , cntOdd = 0 ;
        for(int i = 0 ; i < 5 ; i++){
            arr[i] = s.nextInt();
            if (arr[i] > 0) {
                cntPositive++;
            }else if (arr[i] < 0) {
                cntNegative++;
            }
            if (arr[i] % 2 == 0) {
                cntEven++;
            }else {
                cntOdd++;
            }
        }
        System.out.println(cntEven + " valor(es) par(es)") ;
        System.out.println(cntOdd + " valor(es) impar(es)") ;
        System.out.println(cntPositive + " valor(es) positivo(s)") ;
        System.out.println(cntNegative + " valor(es) negativo(s)") ;

    }
}