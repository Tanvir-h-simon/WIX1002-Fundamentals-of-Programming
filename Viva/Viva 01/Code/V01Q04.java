import java.util.Scanner;
public class V01Q04 {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);

        // int number = 0;
        // boolean valid = false;
        //
        // while (valid == false) {
        //     System.out.print("Enter a positive integer: ");
        //     if (input.hasNextInt()) { // hasNextInt() is a method from the Scanner class: It checks whether the next input is an integer and checks before reading
        //         number = input.nextInt();
        //
        //         if (number > 0) {
        //             valid = true;
        //         } else {
        //             System.out.println("Invalid input. Please re-input a valid positive integer.");
        //         }
        //     } else {
        //         System.out.println("Invalid input. Please re-input a valid positive integer.");
        //         input.next(); // Removes one word/token from buffer (A buffer is a temporary storage area in memory where input is kept before your program uses it.)
        //     }
        // }
        //
        //

        String userInput;
        int number = 0;
        boolean valid = false;

        while (!valid) {
            System.out.print("Enter a positive integer: ");
            userInput = input.nextLine();

            boolean isNumber = true;

            for (int i = 0; i < userInput.length(); i++) {
                char ch = userInput.charAt(i);
                if (Character.isDigit(ch) == false) {
                    isNumber = false;
                    break;
                }
            }

            if (isNumber && userInput.length() > 0) {
                number = Integer.parseInt(userInput);

                if (number > 0) {
                    valid = true;
                } else {
                    System.out.println("nvalid input. Please re-input a valid positive integer.");
                }
            } else {
                System.out.println("nvalid input. Please re-input a valid positive integer.");
            }
        }

        if (number % 2 == 0) {
            System.out.println(number + " is even.");
        } else {
            System.out.println(number + " is odd.");
        }
        input.close();
    }
}