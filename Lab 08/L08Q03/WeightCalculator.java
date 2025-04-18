import java.util.Scanner;

public class WeightCalculator {
    int age;
    double height;

    // Default constructor
    WeightCalculator() {
    }

    void userInput() {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter your age: ");
        age = input.nextInt();
        System.out.println("Enter your height: ");
        height = input.nextDouble();
    }

    void calculateWeight() {
        double weight = (height - 100 + age / 10.0) * 0.9;
        System.out.printf("Recommended weight: %.2f kg\n", weight);
    }

    void displayInfo() {
        System.out.println("Age: " + age);
        System.out.printf("Height: %.2f cm\n", height);
    }
}