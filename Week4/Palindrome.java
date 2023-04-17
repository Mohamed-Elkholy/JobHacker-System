package solution;

import java.util.Scanner;

public class Palindrome {
    static Scanner s = new Scanner(System.in);
    public static String reverse1(String str){
        String ret = "";
        for(int i = str.length() - 1 ; i >= 0 ; i--){
            ret += str.charAt(i);
        }
        return ret ;
    }
    public static boolean isPalindrome1(String str){
        int l = 0 , r = str.length()-1 ;
        while(l < r){
            if(str.charAt(l)!=str.charAt(r)){
                return false ;
            }
            l++ ;
            r-- ;
        }
        return true ;
    }
    public static boolean isPalindrome2(String str){
        String temp = reverse1(str);
        return str.equals(temp);
    }

    public static void main(String[] args) {
        String str = s.next();
        System.out.println(isPalindrome1(str));
    }
}