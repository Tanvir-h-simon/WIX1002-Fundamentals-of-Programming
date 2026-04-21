import java.util.Scanner;

public class V01Q01 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Enter the username: ");
        String username = scan.nextLine().trim().toLowerCase();

        int numDistinctRunes = 0; // Number of distinct characters


        for (int i = 0; i < username.length(); i++) {
            char rune = username.charAt(i);
            if (username.indexOf(rune) == i) { // indexOf() finds the first position of that character.
                numDistinctRunes++;
            }
        }

        if (numDistinctRunes % 2 == 0) {
            System.out.println("ALLY DETECTED!");
        } else {
            System.out.println("ENEMY ALERT!");
        }

        System.out.println("Number of distinct runes: " + numDistinctRunes);
    }
}