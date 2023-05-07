import java.util.* ;
public class LineInArray {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in) ;
        Formatter formatter = new Formatter();
        double[][] matrix = new double[12][12];
        double row = scanner.nextDouble() ;
        double sum = 0 ;
        char operation = scanner.next().charAt(0);
        for (int i = 0 ; i < 12 ; i++) {
            for (int j = 0 ; j < 12 ; j++) {
                matrix[i][j] = scanner.nextDouble() ;
                if(i == row) {
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