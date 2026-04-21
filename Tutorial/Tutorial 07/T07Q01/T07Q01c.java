import java.io.BufferedOutputStream;
import java.io.FileOutputStream;
import java.util.Random;

public class T07Q01c {
    public static void main(String[] args) {
        Random rand = new Random();
        try {
            // FileOutputStream writer = new FileOutputStream("data/integer.dat");
            // for (int i = 0; i < 10; i++) {
            //     int number = rand.nextInt(1001);
            //     writer.write(number);
            // }
            // Faster version of FileOutputStream- Working with large files
            BufferedOutputStream writer = new BufferedOutputStream(new FileOutputStream("data/integer.dat"));
            for (int i = 0; i < 10; i++) {
                int number = rand.nextInt(1001);
                writer.write(number);
            }
            System.out.print("Successfully write to the file.");
            writer.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}