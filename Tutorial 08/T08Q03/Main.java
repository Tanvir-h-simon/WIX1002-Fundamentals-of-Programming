import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter coordinate: ");
        float x = sc.nextFloat();
        float y = sc.nextFloat();

        Coordinate2D obj  = new Coordinate2D(x, y);
        System.out.println("Coordinate: (" + obj.getX() + ", " + obj.getY() + ")");
    }
}