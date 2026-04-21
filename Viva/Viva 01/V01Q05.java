import java.util.Scanner;

public class V01Q05 {
    public static void main(String[] args) {
        Scanner scan= new Scanner(System.in);

        int totalGroups = 0;
        int longestLength = 0;
        int sumLengths = 0;

        System.out.println("Enter input number: ");
        long num = scan.nextLong();

        if (num > 0) {
            String numStr = Long.toString(num);

            char longestDigit = numStr.charAt(0);

            int count = 1; // Current group length

            for (int i = 1; i < numStr.length(); i++) {
                if (numStr.charAt(i) == numStr.charAt(i - 1)) {
                    count++;
                } else {
                    totalGroups++;
                    sumLengths += count;

                    if (count > longestLength) {
                        longestLength = count;
                        longestDigit = numStr.charAt(i - 1);
                    }
                    count = 1; // Reset count for the next group
                }
            }

            // Handle the last group
            totalGroups++;
            sumLengths += count;
            if (count > longestLength) {
                longestLength = count;
                longestDigit = numStr.charAt(numStr.length() - 1);
            }

            System.out.println(totalGroups);
            System.out.println(longestDigit + " " + longestLength);
            System.out.println(sumLengths);
        } else {
            System.out.print("Enter a valid number.");
        }
    }
}