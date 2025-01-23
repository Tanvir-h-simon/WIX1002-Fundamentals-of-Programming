import java.util.Scanner;

public class Q1_2015_16 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter the coordinate of X and Y: ");
        int x = input.nextInt();
        int y = input.nextInt();
        System.out.print("Enter the move: ");
        String move = input.next().toUpperCase();

        System.out.println("Initial Coordinate (" + x + ", " + y + ")");

        for (int i = 0; i < move.length(); i++) {
            switch (move.charAt(i)) {
                case 'R':
                    x++;
                    break;
                case 'L':
                    x--;
                    break;
                case 'U':
                    y++;
                    break;
                case 'D':
                    y--;
                    break;
            }
        }

        System.out.println("Final Coordinate (" + x + ", " + y + ")");
    }
}