import java.io.BufferedInputStream;
import java.io.FileInputStream;

public class T07Q01d {
    public static void main(String[] args) {
        try {
            // FileInputStream reader = new FileInputStream("data/integer.dat");
            // int number;
            // while ((number = reader.read()) != -1) {
            //     System.out.print(number + " ");
            // }
            // Faster version of FileInputStream- Working with large files
            BufferedInputStream reader = new BufferedInputStream(new FileInputStream("data/integer.dat"));
            int number;
            while ((number = reader.read()) != -1) {
                System.out.print(number + " ");
            }
            reader.close();
            // Scanner reads bytes from a file, so it can open a binary file. But we shouldn't use it for binary files.
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}