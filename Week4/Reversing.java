package solution;

import java.util.*;
public class Reversing {
    static Scanner s = new Scanner(System.in);
    public static String reverse1(String str){
        String ret = "";
        for(int i = str.length() - 1 ; i >= 0 ; i--){
            ret += str.charAt(i);
        }
        return ret ;
    }
    public static StringBuilder reverse2(String str){
        StringBuilder temp = new StringBuilder(str);
        return temp.reverse();
    }
    public static void main(String[] args) {
        String str = s.next();
        System.out.println(reverse1(str));
    }
}