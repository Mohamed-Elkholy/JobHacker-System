package solution;

import java.util.LinkedHashSet;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;

public class Task1 {
    static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
        int testCases = scanner.nextInt();
        while(testCases-- > 0){
            int queries = scanner.nextInt();
            Set<Integer> linkedHashSet = new LinkedHashSet<>();
            while (queries-- > 0){
                char type = scanner.next().charAt(0);
                if(type == 'b'){
                    Set<Integer> treeSet = new TreeSet<>(linkedHashSet);
                    System.out.println(treeSet);
                } else if(type == 'e'){
                    System.out.println(linkedHashSet.size());
                } else if(type == 'f'){
                    System.out.println(linkedHashSet);
                } else {
                    int num = scanner.nextInt();
                    if(type == 'a'){
                        linkedHashSet.add(num);
                    } else if(type == 'c'){
                        linkedHashSet.remove(num);
                    } else {
                        if(linkedHashSet.contains(num)){
                            System.out.println(1);
                        } else {
                            System.out.println(-1);
                        }
                    }
                }
            }
        }
    }
}