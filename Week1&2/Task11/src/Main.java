import java.util.* ;
public class Main {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in) ;
        int[] arr = new int[1000];
        int t = s.nextInt() ;
        for(int i = 0 ; i < 1000 ; i++) {
            arr[i] = i % t ;
        }
        for(int i = 0 ; i < 1000 ; i++) {
            System.out.println("N[" + i + "] = " + arr[i]);
        }
    }
}