import java.io.BufferedReader;
import java.io.FileReader;
import java.util.Scanner;

public class T07Q01b {
    public static void main(String[] args) {
        try {
            // Reads character by character
            // FileReader reader = new FileReader("data/integer.txt");
            // int number;
            // while ((number = reader.read()) != -1) {
            //     System.out.print((char) number);
            // }
            // No PrintReader class
            // Reading file line by line
            // BufferedReader reader = new BufferedReader(new FileReader("data/integer.txt"));
            // String line;
            // while ((line = reader.readLine()) != null) {
            //     System.out.println(line);
            // }
            Scanner reader = new Scanner(new FileReader("data/integer.txt"));
            while (reader.hasNext()) {
                System.out.println(reader.nextInt());
            }
            reader.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}