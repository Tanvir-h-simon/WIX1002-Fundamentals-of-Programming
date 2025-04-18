public class Money {
    private double amount;

    // Available notes and coins
    private static final double[] NOTES = {100, 50, 10, 5, 1};
    private static final double[] COINS = {0.50, 0.20, 0.10, 0.05};

    public Money(double amount) {
        this.amount = roundAmount(amount);
    }

    // Round the amount according to specified rules
    private double roundAmount(double amount) {
        // Get the fractional part (last two digits)
        int wholePart = (int) amount;
        double fractionalPart = amount - wholePart;

        // Round to nearest 0.05
        fractionalPart = Math.round(fractionalPart * 20) / 20.0;

        // Handle special cases
        double roundedFractional = fractionalPart;
        if (fractionalPart >= 0.11 && fractionalPart <= 0.12) {
            roundedFractional = 0.10;
        } else if (fractionalPart >= 0.13 && fractionalPart <= 0.17) {
            roundedFractional = 0.15;
        } else if (fractionalPart >= 0.18 && fractionalPart <= 0.19) {
            roundedFractional = 0.20;
        }

        return wholePart + roundedFractional;
    }

    // Calculate the number of notes and coins
    public void calculateNotesAndCoins() {
        System.out.println("Amount: RM" + String.format("%.2f", amount));
        System.out.println("Notes:");

        double remaining = amount;

        // Calculate notes
        for (double note : NOTES) {
            if (remaining >= note) {
                int count = (int) (remaining / note);
                System.out.println("RM" + (int)note + ": " + count);
                remaining = remaining % note;
                remaining = Math.round(remaining * 100) / 100.0; // Avoid floating point errors
            }
        }

        System.out.println("Coins:");

        // Calculate coins
        for (double coin : COINS) {
            if (remaining >= coin) {
                int count = (int) (remaining / coin);
                System.out.println((int)(coin * 100) + " cent: " + count);
                remaining = remaining % coin;
                remaining = Math.round(remaining * 100) / 100.0; // Avoid floating point errors
            }
        }

        // Handle any remaining small amount (less than 5 cent)
        if (remaining > 0) {
            System.out.println("Remaining (less than 5 cent): " + String.format("%.2f", remaining) + " (not accounted for)");
        }
    }

    // Add two Money objects
    public Money add(Money other) {
        return new Money(this.amount + other.amount);
    }

    // Subtract two Money objects
    public Money subtract(Money other) {
        return new Money(this.amount - other.amount);
    }

    // Getter for amount
    public double getAmount() {
        return amount;
    }

    public static void main(String[] args) {
        // Test the Money class
        Money m1 = new Money(123.17);
        System.out.println("Original: 123.17, Rounded: " + m1.getAmount());
        m1.calculateNotesAndCoins();

        Money m2 = new Money(87.13);
        System.out.println("\nOriginal: 87.13, Rounded: " + m2.getAmount());
        m2.calculateNotesAndCoins();

        Money sum = m1.add(m2);
        System.out.println("\nSum of " + m1.getAmount() + " + " + m2.getAmount() + " = " + sum.getAmount());

        Money difference = m1.subtract(m2);
        System.out.println("Difference of " + m1.getAmount() + " - " + m2.getAmount() + " = " + difference.getAmount());
    }
}