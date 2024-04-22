import java.util.* ;
public class ArrayFillII {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in) ;
        int[] arr = new int[1000];
        int mod = scanner.nextInt() ;
        for(int i = 0 ; i < 1000 ; i++) {
            arr[i] = i % mod ;
        }
        for(int i = 0 ; i < 1000 ; i++) {
            System.out.println("N[" + i + "] = " + arr[i]);
        }
    }
}