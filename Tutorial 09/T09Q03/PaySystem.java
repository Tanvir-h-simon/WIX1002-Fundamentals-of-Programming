public class PaySystem {
    double payrate;
    double hours;

    public PaySystem(double payrate, double hours) {
        this.payrate = payrate;
        this.hours = hours;
    }

    public double calculatePay() {
        return payrate * hours;
    }

    public void display() {
        System.out.println("Total Payment = " + calculatePay());
    }
}