package solution;

import java.util.Scanner;

public class Palindrome {
    static Scanner s = new Scanner(System.in);
    

    public static void main(String[] args) {
        String str = s.next();
        System.out.println(isPalindrome2(str));
    }
}