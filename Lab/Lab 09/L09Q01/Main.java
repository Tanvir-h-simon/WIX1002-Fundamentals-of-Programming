import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter rectangle length: ");
        float length = input.nextFloat();
        System.out.print("Enter rectangle width: ");
        float width = input.nextFloat();
        Rectangle r1 = new Rectangle(length, width);
        r1.display();

        System.out.print("Enter square side: ");
        float side = input.nextFloat();
        Square square = new Square(side);
        square.display();

        System.out.print("Enter circle diameter: ");
        float diameter = input.nextFloat();
        Circle circle = new Circle(diameter);
        circle.display();

        input.close();
    }
}