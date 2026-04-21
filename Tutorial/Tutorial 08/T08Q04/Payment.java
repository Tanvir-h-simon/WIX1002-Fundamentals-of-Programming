public class Payment {
    // Cash payment
    public void pay(double amount) {
        System.out.println("Cash Payment: $" + amount);
    }

    // Cheque payment
    public void pay(double amount, String chequeNumber) {
        System.out.println("Cheque Payment: $" + amount);
        System.out.println("Cheque Number: " + chequeNumber);
    }

    // Credit card payment
    public void pay(double amount, String cardHolder, String cardType,
                    String expiryDate, int cvv) {

        System.out.println("Credit Card Payment: $" + amount);
        System.out.println("Card Holder: " + cardHolder);
        System.out.println("Card Type: " + cardType);
        System.out.println("Expiry Date: " + expiryDate);
        System.out.println("CVV: " + cvv);
    }
}