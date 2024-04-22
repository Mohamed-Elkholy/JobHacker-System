import java.util.* ;
public class HighestAndPosition {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] arr = new int[100];
        int maxHight = 0 , idx = 0;
        for (int i = 0 ; i < 100 ; i++ ) {
            arr[i] = scanner.nextInt() ;
            if(arr[i] >= maxHight){
                maxHight = arr[i];
                idx = i + 1 ;
            }
        }
        System.out.println(maxHight);
        System.out.println(idx);
    }
}