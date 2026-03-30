import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class L07Q04 {
    public static void main(String[] args) {
        try {
            FileReader file = new FileReader("data/coursename.dat");
            Scanner fileScanner = new Scanner(file);

            int lines = 0;
            int words = 0;
            int characters = 0;

            while (fileScanner.hasNextLine()) {
                String line = fileScanner.nextLine();
                lines++;
                characters += line.length();

                if (!line.trim().isEmpty()) {
                    words += line.trim().split(" ").length;
                }
            }

            fileScanner.close();

            System.out.println("Number of lines : " + lines);
            System.out.println("Number of words : " + words);
            System.out.println("Number of characters: " + characters);

        } catch (IOException e) {
            System.out.println("IO Error: " + e.getMessage());
        }
    }
}