public class Main { // Tester Class
    public static void main(String[] args) {
        BankAccount user = new BankAccount("Tanvir Hossain", "A05210276", 1000);
        user.displayInfo();

        // Perform some transactions
        user.deposit(1000.0);
        user.withdraw(500.0);
        user.withdraw(200.0);
        user.displayBalance();
    }
}