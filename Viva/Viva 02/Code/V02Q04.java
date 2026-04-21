import java.util.Scanner;

public class V02Q04 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter an integer: ");
        int number = input.nextInt();

        System.out.print("Enter the width: ");
        int width = input.nextInt();

        // static = belongs to class
        // non-static = belongs to object
        // V02Q04 obj = new V02Q04();
        // obj.format(number, width);
        // System.out.println("Formatted number: " + obj.format(number, width));

        String formattedNumber = format(number, width);
        System.out.println("Formatted number: " + formattedNumber);
    }

    // public String format(int number, int width) {
    //     String.format("format string", values);
    //     return String.format("%0" + width + "d", number); // d = number of digits
    // }

    public static String format(int number, int width) {
        return String.format("%0" + width + "d",  number); // d = number of digits
    }
}