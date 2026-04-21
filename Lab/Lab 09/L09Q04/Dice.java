import java.util.Random;

public class Dice {
    public int roll() {
        // return (int) ((Math.random() * 6) + 1);
        Random rand = new Random();
        return rand.nextInt(6) + 1;
    }
}