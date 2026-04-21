import java.util.Scanner;

public class V01Q03  {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Enter the angles of the triangle: ");
        int a = scan.nextInt();
        int b = scan.nextInt();
        int c = scan.nextInt();

        // Check if the sum of angles equals 180 and all angles are greater than 0
        if ((a + b + c) == 180 && a > 0 && b > 0 && c > 0) {
            System.out.println("The triangle is valid.");

            // Check if the triangle is right-angled
            if (a == 90 || b == 90 || c == 90) {
                System.out.println("This is a right-angled triangle.");
            }

            // Check if the triangle is equilateral
            if (a == 60 && b == 60 && c == 60) {
                System.out.println("It is an equilateral triangle.");
            }
            // Check if the triangle is isosceles (any two angles are equal)
            else if (a == b || a == c || b == c) {
                System.out.println("It is an isosceles triangle.");
            }
            // If neither equilateral nor isosceles, it must be scalene
            else {
                System.out.println("It is a scalene triangle.");
            }
        } else {
            System.out.println("The triangle is not valid.");
        }
    }
}