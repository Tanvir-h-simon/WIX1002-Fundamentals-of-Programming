import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStream;
import java.net.URI;
import java.net.URL;
import java.net.URLConnection;
import java.util.Scanner;

public class L07Q02 {
    public static void main(String[] args) {
        try {
            URL u = URI.create("https://fsktm.um.edu.my/").toURL();
            URLConnection cnn = u.openConnection();
            InputStream stream = cnn.getInputStream();

            Scanner in = new Scanner(stream);

            FileWriter writer = new FileWriter("data/index.htm");

            // Read from the web and write to file
            while (in.hasNextLine()) {
                String line = in.nextLine();
                writer.write(line + "\n");
            }

            in.close();
            writer.close();

            System.out.println("Data has been written to index.htm");
        } catch (IOException e) {
            System.out.println("IO Error:" + e.getMessage());
        }
    }
}