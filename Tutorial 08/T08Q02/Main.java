import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int number = sc.nextInt();
        Digit d = new Digit(number);
        int answer = d.digitMultiply(number);
        d.printAnswer(answer);
    }
}