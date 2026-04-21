import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // System.out.println("Enter your name: ");
        // String name = scanner.nextLine();
        // Game1 g1 = new Game1(name, 0, 1);
        System.out.println("Enter Player 1 name: ");
        String name1 = scanner.nextLine();
        System.out.println("Enter Player 2 name: ");
        String name2 = scanner.nextLine();

        Player player1 = new Player(name1, 0);
        Player player2 = new Player(name2, 0);

        // Game 1
        System.out.println("Welcome to the game 1!");
        Game1 g1 = new Game1(player1, player2);
        g1.play();

        player1.resetScore();
        player2.resetScore();

        // Game 2
        System.out.println("\nWelcome to the game 2!");
        Game2 g2 = new Game2(player1, player2);
        g2.play();

    }
}