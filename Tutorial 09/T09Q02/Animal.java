public class Animal extends Organism {
    float amount;

    public Animal (int size, float rate, float amount) {
        super(size, rate);
        this.amount = amount;
    }

    public void display() {
        System.out.println("Size of the organism: " + size + "Growth rate: " + rate + "Amount of eating need: " + amount);
    }
}