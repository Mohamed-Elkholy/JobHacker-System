import java.util.* ;
public class SquaredAndCubic {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in) ;
        int n = scanner.nextInt() ;
        for (int i = 1 ; i <= n ; i++){
            System.out.println(i + " " + (i * i) + " " + (i * i * i)) ;
        }
    }
}