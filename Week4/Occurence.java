package solution;
import java.util.*;
public class Occurence {
    static Scanner s = new Scanner(System.in);
    // Using string class first method
    static public int getSol1(String str , String target){
        int ans = 0 ;
        for(int i = 0 ; i < str.length() ; i++){
            for(int j = i + target.length() ; j < str.length() ; j++){
                if(str.substring(i , j).equals(target)){
                    ans++ ;
                }
            }
        }
        return ans ;
    }
    // using string class second method
    static public int getSol2(String str , String target){
        int ans = 0 , i = 0;
        while(i < str.length() && str.indexOf(target , i) != -1){
            ans++;
            i = str.indexOf(target , i) + target.length() ;
        }
        return ans ;
    }
    // using string tokenizer
    static public int getSol3(String str , String target){
        int ans = 0 ;
        StringTokenizer s = new StringTokenizer(str , " ");
        while(s.hasMoreElements()){
            if(s.nextToken().equals(target)){
                ans++;
            }
        }
        return ans ;
    }
    public static void main(String[] args) {
        String str = s.nextLine();
        String target = s.next() ;
        System.out.println(getSol3(str , target));
    }
}