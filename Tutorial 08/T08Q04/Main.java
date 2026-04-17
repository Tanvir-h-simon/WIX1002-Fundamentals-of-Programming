public class Main {
    public static void main(String[] args) {
        Payment p = new Payment();
        // Method Overloading: Same method name, different parameter list.
        // Compile-time polymorphism- Java decides which method to call based on arguments
        // Cash
        p.pay(100.0);

        // Cheque
        p.pay(250.0, "CHK12345");

        // Credit Card
        p.pay(500.0, "Tanvir Hossain", "Visa", "12/28", 123);
    }
}