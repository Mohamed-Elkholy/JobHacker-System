package solution;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class CountWords {
    public static void main(String[] args) {
        try {
            File file = new File("src/solution/Lincoln.txt");
            Scanner scanner = new Scanner(file);
            int count = 0 ;
            while(scanner.hasNext()){
                scanner.next();
                count++;
            }
            System.out.println("Number of words is " + count);
        } catch (FileNotFoundException e){
            System.out.println("There is no files with this name" + e);
        }
    }
}