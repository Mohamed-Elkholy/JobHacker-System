import java.util.* ;
public class Squared_and_Cubic {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in) ;
        int n = s.nextInt() ;
        for (int i = 1 ; i <= n ; i++){
            System.out.println(i + " " + (i * i) + " " + (i * i * i)) ;
        }
    }
}