import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the value of N: ");
        int N = scanner.nextInt();

        createFile();

        // ShuffleCipher encoder = new ShuffleCipher("data/input.txt", "data/output.txt", N);
        // encoder.encodeFile();

        ShuffleCipher decoder = new ShuffleCipher("data/output.txt", "data/decoded.txt", N);
        decoder.decodeFile();
    }

    public static void createFile() {
        try {
            File file = new File("data/input.txt");
            FileWriter writer = new FileWriter(file);
            writer.write("Abcde\n");
            writer.write("Hello Everyone!\n");
            writer.write("I am solving question 3 of Polymorphism.\n");
            writer.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}