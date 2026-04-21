import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter name for player 1: ");
        String name_1 = input.nextLine();

        Game player_1 = new Game(name_1);

        System.out.print("Enter name for player 2: ");
        String name_2 = input.nextLine();

        Game player_2 = new Game(name_2);

        boolean gameOver = false;

        while (!gameOver) {
            System.out.println(player_1.getPlayerName() + "'s turn: ");
            int point_1 = player_1.move();

            if (point_1 >= 100) {
                System.out.println(player_1.getPlayerName() + " wins the game!");
                gameOver = true;
                break;
            }

            System.out.println(player_2.getPlayerName() + "'s turn: ");
            int point_2 = player_2.move();

            if (point_2 >= 100) {
                System.out.println(player_2.getPlayerName() + " wins the game!");
                gameOver = true;
            }
        }
    }
}