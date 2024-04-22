package solution;

import sun.text.normalizer.UCharacter;

import java.util.*;

public class Task4 {
    static Scanner scanner = new Scanner(System.in);
    public static void add(Map<Character , List<String>> dictionary , String word){
        //dictionary.put(word.charAt(0) , new ArrayList<>());
        dictionary.get(word.charAt(0)).add(word);
    }
    public static void printAll(Map<Character , List<String>> dictionary){
        for(Map.Entry<Character , List<String>> entry : dictionary.entrySet()){
            System.out.print(entry.getKey() + " ");
            for(String temp : entry.getValue()){
                System.out.print(temp + " ");
            }
            System.out.println("");
        }
    }
    public static void printDectionaryOfLetter(Map<Character , List<String>> dictionary , char target){
        for(String word : dictionary.get(target)){
            System.out.print(word + " ");
        }
        System.out.println("");
    }
    public static void main(String[] args) {
            Map<Character , List<String>> dictionary = new TreeMap<>();
            for(char i = 'a' ; i <= 'z' ; i++){
                dictionary.put(i , new ArrayList<>());
             }
            // to continue enter my words
            int testCases = scanner.nextInt();
            while(testCases-- > 0){
                /**
                 * type of operatoin
                 * a = add
                 * b = print all letters and their words
                 * d = print all words of a custom letter
                 */
                char type = scanner.next().charAt(0);
                if(type == 'a'){
                    String word = scanner.next();
                    add(dictionary , word);
                } else if(type == 'b'){
                    printAll(dictionary);
                } else {
                    char target = scanner.next().charAt(0);
                    printDectionaryOfLetter(dictionary , target);
                }
            }
    }
}
