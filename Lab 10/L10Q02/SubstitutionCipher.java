import javax.crypto.Cipher;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.BufferedReader;
import java.io.BufferedWriter;

public class SubstitutionCipher implements MessageEncoder {
    String inputFileName;
    String outputFileName;
    int shift;

    // public SubstitutionCipher(int shift) {
    //     this.shift = shift;
    // }

   public SubstitutionCipher(String inputFileName, String outputFileName, int shift) {
       this.inputFileName = inputFileName;
       this.outputFileName = outputFileName;
       this.shift = shift;
   }

    public String encode(String plainText) {
        StringBuilder cipherText = new StringBuilder();
        // String line = plainText;
        // String cipherText = "";
        for (int i = 0; i < plainText.length(); i++) {
            char ch = plainText.charAt(i);
            if (Character.isUpperCase(ch)) {
                char shiftedChar = (char) ((ch - 'A' + shift) % 26 + 'A');
                // plainText = plainText.replace(ch, shiftedChar); // Replace all occurrences of the character
                // cipherText += shiftedChar; // Everytime create a new string object, because it is in loop
                cipherText.append(shiftedChar);
            } else if (Character.isLowerCase(ch)) {
                char shiftedChar = (char) ((ch - 'a' + shift) % 26 + 'a');
                // cipherText += shiftedChar;
                cipherText.append(shiftedChar);
            } else {
                // cipherText += ch;
                cipherText.append(ch);
            }
        }
        return cipherText.toString();
    }

    public String decode(String cipherText) {
        StringBuilder plainText = new StringBuilder();
        // String plainText = "";
        for (int i = 0; i < cipherText.length(); i++) {
            char ch = cipherText.charAt(i);
            if (Character.isUpperCase(ch)) {
                char shiftedChar = (char) ((ch - 'A' - (shift % 26) + 26) % 26 + 'A'); // +26: Adjust for negative shift
                // plainText += shiftedChar;
                plainText.append(shiftedChar);
            } else if (Character.isLowerCase(ch)) {
                char shiftedChar = (char) ((ch - 'a' - (shift % 26) + 26) % 26 + 'a');
                // plainText += shiftedChar;
                plainText.append(shiftedChar);
            } else {
                // plainText += ch;
                plainText.append(ch);
            }
        }
        return plainText.toString();
    }

   // public void createFile() {
   //     try {
   //         File file = new File("data/input.txt");
   //         FileWriter writer = new FileWriter(file);
   //         writer.write("Hello Everyone!\n");
   //         writer.write("I am solving the second question of Polymorphism.");
   //         writer.close();
   //         System.out.println("File created successfully!");
   //     } catch (IOException e) {
   //         System.out.println("Error: " + e.getMessage());
   //     }
   // }

   public void encodeFile() {
       try {
           BufferedReader reader = new BufferedReader(new FileReader(inputFileName));
           BufferedWriter writer = new BufferedWriter(new FileWriter(outputFileName));
           String line;
           while ((line = reader.readLine()) != null) {
               String encodedLine = encode(line);
               writer.write(encodedLine);
               writer.newLine();
           }
           reader.close();
           writer.close();
           System.out.println("File encoded successfully!");
       } catch (IOException e) {
           throw new RuntimeException(e);
       }
   }

   public void decodeFile() {
       try {
           BufferedReader reader = new BufferedReader(new FileReader(inputFileName));
           BufferedWriter writer = new BufferedWriter(new FileWriter(outputFileName));
           String line;
           while ((line = reader.readLine()) != null) {
               String decodedLine = decode(line);
               writer.write(decodedLine);
               writer.newLine();
           }
           reader.close();
           writer.close();
           System.out.println("File decoded successfully!");
       } catch (Exception e) {
           throw new RuntimeException(e);
       }
   }
}