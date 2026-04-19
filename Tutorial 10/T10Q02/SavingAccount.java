public class SavingAccount implements Interest{
    double balance;

    public SavingAccount(double balance){
        this.balance = balance;
    }

    @Override
    public double computeInterest() {
        double yearlyRate = 0.005; // 0.5%
        return (balance * yearlyRate) / 12;
    }
}