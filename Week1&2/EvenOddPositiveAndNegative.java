import java.util.* ;
public class EvenOddPositiveAndNegative {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] arr = new int[5];
        int positiveNumbers = 0 , negativeNumbers = 0 ;
        int evenNumbers = 0 , oddNumbers = 0 ;
        for(int i = 0 ; i < 5 ; i++){
            arr[i] = scanner.nextInt();
            if (arr[i] > 0) {
                positiveNumbers++;
            }else if (arr[i] < 0) {
                negativeNumbers++;
            }
            if (arr[i] % 2 == 0) {
                evenNumbers++;
            }else {
                oddNumbers++;
            }
        }
        System.out.println(evenNumbers + " valor(es) par(es)") ;
        System.out.println(oddNumbers + " valor(es) impar(es)") ;
        System.out.println(positiveNumbers + " valor(es) positivo(s)") ;
        System.out.println(negativeNumbers + " valor(es) negativo(s)") ;

    }
}