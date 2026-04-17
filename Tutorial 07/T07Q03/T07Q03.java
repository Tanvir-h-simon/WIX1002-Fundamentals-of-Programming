import java.io.*;
import java.util.Scanner;

public class T07Q03 {
    public static void main(String[] args) {
        try {
            String sentence = "I am learning Java.";

            // Write binary to file
            BufferedWriter bw = new BufferedWriter(new FileWriter("data/sentence.txt"));
            for (int i = 0; i < sentence.length(); i++) {
                // char ch = sentence.charAt(i);
                // int ascii = (int) ch;
                int ascii = sentence.charAt(i);
                // String binary = String.format("%8s", Integer.toBinaryString(ascii)); // %8s pads with spaces, not zeros
                String binary = String.format("%8s", Integer.toBinaryString(ascii)).replace(' ', '0');
                bw.write(binary + " ");
            }
            bw.close();

            // Read binary from text file and covert into text
            BufferedReader br = new BufferedReader(new FileReader("data/sentence.txt"));
            String line = br.readLine(); // One sentence
            br.close();

            String[] binary = line.trim().split(" ");
            // String text = "";
            // for (String s : binary) {
            //     int ascii = Integer.parseInt(s, 2); // Convert binary to decimal
            //     char ch = (char) ascii;
            //     text += ch;
            // }
            StringBuilder sb = new StringBuilder();
            for (String s : binary) {
                int ascii = Integer.parseInt(s, 2);
                char ch = (char) ascii;
                sb.append(ch);
            }
            System.out.println("Decoded sentence: " + sb.toString());
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}