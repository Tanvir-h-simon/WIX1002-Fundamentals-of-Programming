import java.io.*;
import java.util.Random;

public class T07Q01a {
    public static void main(String[] args) {
        Random rand = new Random();
        try {
            /* FileWriter => Write one character at a time */
            // File file = new File("data/integer.txt");
            // FileWriter writer = new FileWriter(file);
            // FileWriter writer = new FileWriter(new File ("data/integer.txt"));
            // FileWriter writer = new FileWriter("data/integer.txt", true);

            /* PrintWriter => Write one line at a time */
            // PrintWriter writer = new PrintWriter("data/integer.txt");
            // PrintWriter writer = new PrintWriter(new FileWriter("data/integer.txt", true));

            /* BufferedWriter => Write one line at a time. Uses a buffer to improve performance */
            BufferedWriter writer = new BufferedWriter(new FileWriter("data/integer.txt"));
            // BufferedWriter writer = new BufferedWriter(new FileWriter("data/integer.txt", true));
            for (int i = 0; i < 10; i++) {
                // int number = (int) (Math.random() * 1001);
                int number = rand.nextInt(1001);
                writer.write(number + " ");
            }
            writer.write("\n");
            writer.close();
            System.out.print("Successfully write to the file.");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}