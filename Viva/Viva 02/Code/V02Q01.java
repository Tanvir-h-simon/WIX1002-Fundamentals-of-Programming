import java.util.Scanner;

public class V02Q01 {
    public static String findLongestPalindromicSubstring(String str) {
        String longestPalindrome = "";

        for (int i = 0; i < str.length(); i++) {
            for (int j = i; j < str.length(); j++) {

                String currentSubstring = str.substring(i, j + 1);

                if (isPalindrome(currentSubstring)) {

                    if (currentSubstring.length() > longestPalindrome.length()) {
                        longestPalindrome = currentSubstring;
                    }
                }
            }
        }
        return longestPalindrome;
    }


    private static boolean isPalindrome(String str) {
        int left = 0;
        int right = str.length() - 1;

        while (left < right) {
            if (str.charAt(left) != str.charAt(right)) {
                return false;
            }
            left++;
            right--;
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter string: ");
        String inputString = input.nextLine().trim();

        String longestPalindrome = findLongestPalindromicSubstring(inputString);
        System.out.println("Longest Palindromic Substring: " + longestPalindrome);
    }
}