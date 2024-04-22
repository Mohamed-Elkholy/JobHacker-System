package solution;

import java.util.*;

public class Task3 {
    static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
        int testCases = scanner.nextInt();
        while(testCases-- > 0){
            int queries = scanner.nextInt();
            Set<Integer> set = new HashSet<>();
            while (queries-- > 0){
                char type = scanner.next().charAt(0);
                if(type == 'b'){
                    Set<Integer> treeSet = new TreeSet<>(set);
                    System.out.println(treeSet);
                } else if(type == 'e'){
                    System.out.println(set.size());
                } else {
                    int num = scanner.nextInt();
                    if(type == 'a'){
                        set.add(num);
                    } else if(type == 'c'){
                        set.remove(num);
                    } else {
                        if(set.contains(num)){
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
