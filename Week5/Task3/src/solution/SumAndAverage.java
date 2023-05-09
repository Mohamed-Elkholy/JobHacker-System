package solution;

import java.io.*;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLConnection;
import java.util.Scanner;
// this task i did it with the help of chatGPT in some parts
public class SumAndAverage {
    public static File readFromWebToFile(String urlStr) throws IOException {
        URL url = new URL(urlStr);
        URLConnection connection = url.openConnection();
        File file = new File("Scores.txt");
        BufferedReader reader = new BufferedReader(new InputStreamReader(connection.getInputStream()));
        BufferedWriter writer = new BufferedWriter(new FileWriter(file));
        String line;
        while ((line = reader.readLine()) != null) {
            writer.write(line);
            writer.newLine();
        }
        reader.close();
        writer.close();
        return file ;
    }

    public static int getSum(File file) throws FileNotFoundException {
        Scanner scanner = new Scanner(file);
        int sum = 0 ;
        while(scanner.hasNextInt()){
            sum += scanner.nextInt();
        }
        scanner.close();
        return sum ;
    }

    public static double getAverage(File file) throws FileNotFoundException {
        Scanner scanner = new Scanner(file);
        int sum = getSum(file);
        int count = 0 ;
        while(scanner.hasNextInt()){
            scanner.nextInt();
            count++;
        }
        scanner.close();
        return sum/count ;
    }
    public static void main(String[] args) throws IOException {

        try {
            File file = readFromWebToFile("http://liveexample.pearsoncmg.com/data/Scores.txt");
            int sum = getSum(file);
            double average = getAverage(file);
            System.out.println("Sum = " + sum);
            System.out.println("Average = " + average);
        } catch (IOException e){
            System.out.println("Error !" + e);
        }


    }
}