public class Game1  {
    private Dice dice1 = new Dice();
    private Dice dice2 = new Dice();
    private Player player1;
    private Player player2;

    private int turn = 0;

    // public Game1(String name, int score) {}
    public Game1(Player player1, Player player2) {
        this.player1 = player1;
        this.player2 = player2;
    }

    private boolean playTurn(Player player, int turn) {
        System.out.println("[Turn: " + turn + "] " + player.getName() + "'s turn.");

        int roll1 = dice1.roll();
        System.out.println(player.getName() + " rolled a " + roll1);
        int roll2 = dice2.roll();
        System.out.println(player.getName() + " rolled a " + roll2);
        player.addScore(roll1 + roll2);

        while (roll1 == roll2 && player.getScore() < 100) {
            System.out.println("Doubles! Roll again.");
            roll1 = dice1.roll();
            System.out.println(player.getName() + " rolled a " + roll1);
            roll2 = dice2.roll();
            System.out.println(player.getName() + " rolled a " + roll2);
            player.addScore(roll1 + roll2);
        }

        System.out.println(player.getName() + "'s total score: " + player.getScore());
        System.out.println();

        return player.getScore() >= 100;
    }

    public void play() {
        System.out.println("Game 1 started! Roll two dices each turn.");

        while (true) {
            if (playTurn(player1, turn)) {
                System.out.println(player1.getName() + " wins Game 1 with " + player1.getScore() + " points!");
                break;
            }
            if (playTurn(player2, turn)) {
                System.out.println(player2.getName() + " wins Game 1 with " + player2.getScore() + " points!");
                break;
            }
            turn++;
        }
        /* System.out.println("Game 1 started! " + getName() + "'s turn. Roll two dices each turn.");

        while (getScore() < 100) {
            System.out.println("[Turn: " + turn + "] Current score: " + getScore());

            int roll1 = dice1.roll();
            System.out.println(getName() + " rolled a " + roll1);
            int roll2 = dice2.roll();
            System.out.println(getName() + " rolled a " + roll2);

            int total = roll1 + roll2;
            addScore(total);

            while (roll1 == roll2 && getScore() < 100) {
                System.out.println("Doubles! Roll again.");
                roll1 = dice1.roll();
                System.out.println(getName() + " rolled a " + roll1);
                roll2 = dice2.roll();
                System.out.println(getName() + " rolled a " + roll2);

                total = roll1 + roll2;
                addScore(total);
            }
            System.out.println("Total score is: " + getScore());
            System.out.println();
            turn++;
        }
        System.out.println("Game 1 ended! " + getName() + " has won with a total score of " + getScore() +  "."); */
    }
}