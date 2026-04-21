import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the shift value: ");
        int shift = sc.nextInt();
        sc.nextLine(); // Consume newline character
        // System.out.println("Enter text to encode: ");
        // String text = sc.nextLine();

        // SubstitutionCipher obj = new SubstitutionCipher(shift);
        // obj.encode(text);
        // String encodedText = obj.encode(text);
        // System.out.println("Encoded text: " + encodedText);
        // obj.decode(text);
        // String decodedText = obj.decode(encodedText);
        // System.out.println("Decoded text: " + decodedText);

        // SubstitutionCipher obj = new SubstitutionCipher("data/input.txt", "data/output.txt", shift);
        // obj.createFile();
        // obj.encodeFile();
        // obj.decodeFile();

        // input → [encode] → output → [decode] → decoded
        SubstitutionCipher encoder = new SubstitutionCipher("data/input.txt", "data/output.txt", shift);
        encoder.encodeFile();
        SubstitutionCipher decoder = new SubstitutionCipher("data/output.txt", "data/decoded.txt", shift);
        decoder.decodeFile();
    }
}