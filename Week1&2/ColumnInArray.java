import java.util.* ;
public class ColumnInArray {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in) ;
        Formatter formatter = new Formatter();
        double[][] matrix = new double[12][12];
        double col = scanner.nextDouble() ;
        double sum = 0 ;
        char operation = scanner.next().charAt(0);
        for (int i = 0 ; i < 12 ; i++) {
            for (int j = 0 ; j < 12 ; j++) {
                matrix[i][j] = scanner.nextDouble() ;
                if(j == col) {
                    sum += matrix[i][j];
                }
            }
        }

        if(operation == 'S') {
            System.out.println(formatter.format("%.1f" , sum));
        }else{
            System.out.println(formatter.format("%.1f" , (sum / 12.0)));
        }

    }
}