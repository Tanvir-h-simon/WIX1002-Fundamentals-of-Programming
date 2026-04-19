public class Tester {
    public static void main(String[] args) {

        Interest saving = new SavingAccount(10000);
        Interest fixed = new FixedAccount(10000);

        System.out.printf("Saving Account Monthly Interest: %.2f\n", saving.computeInterest());
        System.out.printf("Fixed Account Monthly Interest: %.2f", fixed.computeInterest());
    }
}