public class Game2 {
    private Dice dice = new Dice();
    private Player player1;
    private Player player2;

    private int turn = 0;

    public Game2(Player player1, Player player2) {
        this.player1 = player1;
        this.player2 = player2;
    }

    private boolean playTurn(Player player) {
        System.out.println("[Turn: " + turn + "] " + player.getName() + "'s turn. Score: " + player.getScore());

        int roll = dice.roll();
        System.out.println(player.getName() + " rolled a " + roll);

        int total = roll;

        if (roll == 6) {
            System.out.println("Rolled a 6! Roll again.");
            int roll2 = dice.roll();
            System.out.println(player.getName() + " rolled a " + roll2);

            if (roll2 == 6) {
                System.out.println("Rolled 6 again! No score this turn.");
                total = 0;
            } else {
                total += roll2;
            }
        }

        int newTotal = player.getScore() + total;

        if (newTotal > 100) {
            System.out.println("Score would exceed 100! Turn score not counted.");
        } else {
            player.addScore(total);
        }

        System.out.println(player.getName() + "'s total score: " + player.getScore());
        System.out.println();

        return player.getScore() >= 100;
    }

    public void play() {
        System.out.println("Game 2 started! Roll one die each turn. First to exactly 100 wins!");
        System.out.println();

        while (true) {
            if (playTurn(player1)) {
                System.out.println(player1.getName() + " wins Game 2 with " + player1.getScore() + " points!");
                break;
            }
            if (playTurn(player2)) {
                System.out.println(player2.getName() + " wins Game 2 with " + player2.getScore() + " points!");
                break;
            }
            turn++;
        }
    }
}