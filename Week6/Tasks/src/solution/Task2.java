package solution;

import java.util.*;

public class Task2 {
    static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
        int testCases = scanner.nextInt();
        while(testCases-- > 0){
            int queries = scanner.nextInt();
            Map<Integer , Integer> treeMap = new TreeMap<>();
            while (queries-- > 0){
                char type = scanner.next().charAt(0);
                if(type == 'e'){
                    for(Map.Entry<Integer , Integer> entry : treeMap.entrySet()){
                        System.out.println(entry.getKey());
                    }
                } else if(type == 'c'){
                    System.out.println(treeMap.size());
                } else {
                    int key = scanner.nextInt();
                    if(type == 'a'){
                        int value = scanner.nextInt();
                        treeMap.put(key , value);
                    } else if(type == 'd'){
                        treeMap.remove(key);
                    } else {
                        if(treeMap.containsKey(key)){
                            System.out.println(treeMap.get(key));
                        } else {
                            System.out.println(-1);
                        }
                    }
                }
            }
        }
    }
}
