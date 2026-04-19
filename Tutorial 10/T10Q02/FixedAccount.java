public class FixedAccount implements Interest{
    double balance;

    public FixedAccount(double balance){
        this.balance = balance;
    }

    @Override
    public double computeInterest() {
        double yearlyRate = 0.03; // 3%
        return (balance * yearlyRate) / 12;
    }
}