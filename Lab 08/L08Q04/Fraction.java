import java.util.Scanner;

public class Fraction {
    int numerator;
    int denominator;

    Fraction() {
    }

    void userInput() {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the numerator: ");
        numerator = input.nextInt();
        System.out.println("Enter the denominator: ");
        denominator = input.nextInt();
    }

    // Mutator (setter) method for numerator
    void setNumerator(int numerator) {
        this.numerator = numerator;
    }

    // Mutator (setter) method for numerator
    void setDenominator(int denominator) {
        this.denominator = denominator;
    }

    // Accessor (getter) method for numerator
    int getNumerator() {
        return numerator;
    }

    // Accessor (getter) method for denominator
    int getDenominator() {
        return denominator;
    }

    void calcReducedFraction() {
        int gcd = calcGCD(Math.abs(numerator), Math.abs(denominator));
        if (gcd == 0) {
            System.out.println("Reduced Fraction = " + numerator + "/" + denominator);
        } else {
            System.out.println("Reduced Fraction = " + (numerator / gcd) + "/" + (denominator / gcd));
        }
    }

    int calcGCD(int a, int b) {
        while (b != 0) {
            int temp = b;
            b = a % b;
            a = temp;
        }
        return a;
    }
}