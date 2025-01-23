import java.util.Scanner;

public class Q2_2018_19 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        
        int score = 0;
        int totalQuestions = 0;

        while (true) {
            System.out.print("Enter a number (-1 to quit): ");
            int number = scan.nextInt();
            
            if (number == -1){ 
                break;
            }

            System.out.print("Enter a factor: ");
            int factor = scan.nextInt();
            
            System.out.print(factor + " is a factor of " + number + "?: ");
            String answer = scan.next().toLowerCase();
            
            totalQuestions++;
            
            if (answer.equals("true") && (number % factor == 0)){
                System.out.println("Your answer is correct.");
                score++;
            } else if (answer.equals("false") && (number % factor != 0)){
                System.out.println("Your answer is correct.");
                score++;
            } else {
                System.out.println("Your answer is incorrect.");
            }
        }
        
        System.out.printf("Your final score: %d/%d%n", score, totalQuestions);
    }
}