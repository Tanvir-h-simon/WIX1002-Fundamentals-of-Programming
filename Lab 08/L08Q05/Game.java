public class Game {
    private String name;
    private int point;

    public Game(String name) {
        this.name = name;
        this.point = 0;
    }

    public int move() {
        int diceRoll = (int) (1 + (Math.random() * (6)));
        point += diceRoll;
        System.out.println(name + " rolled a " + diceRoll + " and move to position " + point);
        return point;
    }

    public String getPlayerName() {
        return name;
    }

    public int getPosition() {
        return point;
    }
}