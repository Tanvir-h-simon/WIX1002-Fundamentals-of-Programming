public class Main {
    public static void main(String[] args) {

        System.out.println("\nTesting object a: "); // Generate 10 random integers within 0 to 100.
        Number a = new Number();
        a.displayArray();
        a.findEvenNumbers();
        a.findPrimeNumbers();
        a.findMaximum();
        a.findMinimum();
        a.calculateAverage();
        a.findSquareNumbers();

        System.out.println("\n\nTesting object b: "); // Generate 5 random integers within 0 to 100.
        Number b = new Number(5);
        b.displayArray();
        b.findEvenNumbers();
        b.findPrimeNumbers();
        b.findMaximum();
        b.findMinimum();
        b.calculateAverage();
        b.findSquareNumbers();

        System.out.println("\n\nTesting object c: ");
        Number c = new Number(4, 50);  // Generate 4 random integers within 0 to 50.
        c.displayArray();
        c.findEvenNumbers();
        c.findPrimeNumbers();
        c.findMaximum();
        c.findMinimum();
        c.calculateAverage();
        c.findSquareNumbers();
    }
}