import java.util.* ;
public class Main {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in) ;
        Formatter f = new Formatter();
        double[][] matrix = new double[12][12];
        double col = s.nextDouble() , sum = 0 ;
        char operation = s.next().charAt(0);
        for (int i = 0 ; i < 12 ; i++) {
            for (int j = 0 ; j < 12 ; j++) {
                matrix[i][j] = s.nextDouble() ;
                if(j == col) {
                    sum += matrix[i][j];
                }
            }
        }

        if(operation == 'S') {
            System.out.println(f.format("%.1f" , sum));
        }else{
            System.out.println(f.format("%.1f" , (sum / 12.0)));
        }

    }
}