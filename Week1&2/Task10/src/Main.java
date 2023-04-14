
import java.util.* ;
public class Main {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in) ;
        int[] arr = new int[20];
        for (int i = 0 ; i < 20 ; i++){
            arr[i] = s.nextInt() ;
        }
        int l = 0 , r = 19 ;
        while(l < r){
            int temp = arr[l];
            arr[l] = arr[r];
            arr[r] = temp ;
            l++ ;
            r--;
        }
        for (int i = 0 ; i < 20 ; i++) {
            System.out.println("N[" + i + "] = " + arr[i]);
        }
    }
}