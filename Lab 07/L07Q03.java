import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class L07Q03 {
    public static void main(String[] args) {
        try {
            FileReader file = new FileReader("data/coursename.dat");
            Scanner fileScanner = new Scanner(file);

            FileWriter writer = new FileWriter("data/reverse.txt");

            while (fileScanner.hasNextLine()) {
                String line = fileScanner.nextLine();
                String reversed = new StringBuilder(line).reverse().toString();
                writer.write(reversed + "\n");
            }

            fileScanner.close();
            writer.close();

            System.out.println("Reversed lines written to reverse.txt");

        } catch (IOException e) {
            System.out.println("IO Error: " + e.getMessage());
        }
    }
}