import java.util.* ;
public class Main {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int[] bankNotes = {100 , 50 , 20 , 10 , 5 , 2 , 1};
        int num = s.nextInt() ;
        System.out.println(num);
        for(int i = 0 ; i < 7 ; i++){
            System.out.println(num / bankNotes[i] + " nota(s) de R$ " + bankNotes[i] + ",00");
            num%=bankNotes[i];
        }

    }
}