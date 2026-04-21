import java.util.Scanner;

public class V02Q03 {
    public static String generateInitials(String name) {
        String[] parts = name.split("[\\s\\-_'.,]+");
        String initials = "";

        for (int i = 0; i < parts.length; i++) {
            String word = parts[i].toLowerCase();

            if (word.equals("bin") || word.equals("binti") ||
                    word.equals("a/l") || word.equals("a/p") ||
                    word.equals("al") || word.equals("ap") ||
                    word.equals("@")) {
                continue;
            }

            if (parts[i].length() > 0) {
                initials += Character.toUpperCase(parts[i].charAt(0));
            }
        }
        return initials;
    }

    public static int convertArabics(String roman) {
        roman = roman.toUpperCase();
        int total = 0;

        for (int i = 0; i < roman.length(); i++) {
            int current = value(roman.charAt(i));
            if (current == -1) return -1;

            if (i < roman.length() - 1) {
                int next = value(roman.charAt(i + 1));
                if (next == -1) return -1;

                if (current < next) total -= current;
                else total += current;
            } else {
                total += current;
            }
        }
        return total;
    }

    public static int value(char c) {
        if (c == 'I') return 1;
        if (c == 'V') return 5;
        if (c == 'X') return 10;
        if (c == 'L') return 50;
        if (c == 'C') return 100;
        if (c == 'D') return 500;
        if (c == 'M') return 1000;
        return -1;
    }

    public static String convertRomans(int num) {
        if (num <= 0 || num > 3999) return "Invalid";

        int[] values = {1000, 900, 500, 400, 100, 90,
                50, 40, 10, 9, 5, 4, 1};

        String[] symbols = {"M", "CM", "D", "CD", "C", "XC",
                "L", "XL", "X", "IX", "V", "IV", "I"};

        String result = "";

        for (int i = 0; i < values.length; i++) {
            while (num >= values[i]) {
                num -= values[i];
                result += symbols[i];
            }
        }
        return result;
    }

    public static int calculate(int a, int b, char op) {
        if (op == '+') return a + b;
        if (op == '-') return a - b;
        if (op == '*') return a * b;
        if (op == '/') return (b != 0) ? a / b : -1;
        if (op == '%') return (b != 0) ? a % b : -1;
        if (op == '^') return (int)Math.pow(a, b);
        return -1;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter your name: ");
        String name = sc.nextLine();

        System.out.print("Enter number of statements: ");
        int n = sc.nextInt();
        sc.nextLine();

        String initials = generateInitials(name);

        System.out.println("Statements for the Roman numeral test are sent in by "
                + initials + ", (" + name + ").");
        System.out.println();

        int correct = 0;

        for (int i = 0; i < n; i++) {

            System.out.print("Enter statement " + (i + 1) + ": ");
            String line = sc.nextLine();

            String[] parts = line.split(" ");

            if (parts.length != 5) {
                System.out.println("Invalid Statement.");
                continue;
            }

            String r1 = parts[0];
            char op = parts[1].charAt(0);
            String r2 = parts[2];
            String r3 = parts[4];

            int a = convertArabics(r1);
            int b = convertArabics(r2);
            int c = convertArabics(r3);

            if (a <= 0 || b <= 0 || c <= 0 ||
                    a > 3999 || b > 3999 || c > 3999) {
                System.out.println("Invalid Statement.");
                continue;
            }

            int result = calculate(a, b, op);

            if (result <= 0 || result > 3999) {
                System.out.println("Invalid Statement.");
                continue;
            }

            if (result == c) {
                System.out.println(a + " " + op + " " + b + " = " + c + " is correct.");
                correct++;
            } else {
                String correctRoman = convertRomans(result);
                System.out.println(a + " " + op + " " + b + " = " + c
                        + " is wrong, as the answer should be "
                        + correctRoman + ", which is " + result
                        + " in Arabic numeral form.");
            }
        }

        System.out.println();

        System.out.println("Number of Correct Statements = " + correct);
        double percentage = (correct * 100.0) / n;
        System.out.printf("Percentage of Correct Statements = %.2f%%\n", percentage);
    }
}