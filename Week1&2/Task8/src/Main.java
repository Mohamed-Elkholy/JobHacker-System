import java.util.* ;
public class Main {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int[] arr = new int[100];
        int mxHight = 0 , idx = 0;
        for (int i = 0 ; i < 100 ; i++ ) {
            arr[i] = s.nextInt() ;
            if(arr[i] >= mxHight){
                mxHight = arr[i];
                idx = i + 1 ;
            }
        }
        System.out.println(mxHight);
        System.out.println(idx);
    }
}