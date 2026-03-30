import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.BufferedReader;
import java.io.BufferedWriter;

public class ShuffleCipher implements MessageEncoder {
    private String inputFileName;
    private String outputFileName;
    private int N;

    public ShuffleCipher(String inputFileName, String outputFileName, int N) {
        this.inputFileName = inputFileName;
        this.outputFileName = outputFileName;
        this.N = N;
    }

    public String shuffle(String plainText) {
        int mid = plainText.length() / 2;
        String firstHalf = plainText.substring(0, mid);
        String secondHalf = plainText.substring(mid);

        StringBuilder cipherText = new StringBuilder();
        for (int i = 0; i < mid; i++) {
            cipherText.append(firstHalf.charAt(i));
            cipherText.append(secondHalf.charAt(i));
        }
        if (secondHalf.length() > firstHalf.length()) {
            char remainingChar = secondHalf.charAt(secondHalf.length() - 1);
            cipherText.append(remainingChar);
        }
        return cipherText.toString();
    }

    public String unshuffle(String cipherText) {
        StringBuilder firstHalf = new StringBuilder();
        StringBuilder secondHalf = new StringBuilder();
        for (int i = 0; i < cipherText.length(); i++) {
            if (i % 2 == 0) {
                if (cipherText.length() % 2 == 1 && i == cipherText.length() - 1) {
                    secondHalf.append(cipherText.charAt(i));
                } else {
                    firstHalf.append(cipherText.charAt(i));
                }
            } else {
                secondHalf.append(cipherText.charAt(i));
            }
        }
        return firstHalf.toString() + secondHalf.toString();
    }

    public String encode(String plainText) {
        String text = plainText;
        for (int i = 0; i < N; i++) {
            text = shuffle(text);
        }
        return text;
    }

    public String decode(String cipherText) {
        String text = cipherText;
        for (int i = 0; i < N; i++) {
            text = unshuffle(text);
        }
        return text;
    }

    public void encodeFile() {
        try (BufferedReader reader = new BufferedReader(new FileReader(inputFileName));
             BufferedWriter writer = new BufferedWriter(new FileWriter(outputFileName))) {
            String line;
            while ((line = reader.readLine()) != null) {
                writer.write(encode(line));
                writer.newLine();
            }
            System.out.println("File encoded successfully to " + outputFileName);
        } catch (IOException e) {
            System.err.println("Error encoding file: " + e.getMessage());
        }
    }

    public void decodeFile() {
        try (BufferedReader reader = new BufferedReader(new FileReader(inputFileName));
             BufferedWriter writer = new BufferedWriter(new FileWriter(outputFileName))) {
            String line;
            while ((line = reader.readLine()) != null) {
                writer.write(decode(line));
                writer.newLine();
            }
            System.out.println("File decoded successfully to " + outputFileName);
        } catch (IOException e) {
            System.err.println("Error decoding file: " + e.getMessage());
        }
    }
}
