class BankAccount {
    String name;
    String passport;
    double balance;

    BankAccount(String name, String passport, double balance) {
        this.name = name;
        this.passport = passport;
        this.balance = balance;
    }

    // Deposit method
    void deposit(double deposit) {
        balance += deposit;
        System.out.println("Deposited amount: " + deposit +" RM");
    }

    // Withdraw method
    void withdraw(double withdraw) {
        balance -= withdraw;
        System.out.println("Withdrew amount: " + withdraw + " RM");
    }


    void displayInfo() {
        System.out.println("Account name: " + name);
        System.out.println("IC or Passport number: " + passport);
    }

    void displayBalance() {
        System.out.println("Current balance: " + balance + " RM");
    }
}
