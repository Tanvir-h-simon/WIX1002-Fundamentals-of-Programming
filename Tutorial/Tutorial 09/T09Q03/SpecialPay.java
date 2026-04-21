public class SpecialPay extends PaySystem {

    public SpecialPay(double payrate, double hours) {
        super(payrate, hours);
    }

    @Override
    public double calculatePay() {
        double base = super.calculatePay();
        return base + (base * 0.30); // add 30% commission
    }
}