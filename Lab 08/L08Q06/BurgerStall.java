public class BurgerStall {
    private String ID;
    private int numberOfSell;
    private  static int numberOfTotalSell = 0;

    public BurgerStall(String ID, int numberOfInitialSoldBurger) {
        this.ID = ID;
        this.numberOfSell = numberOfInitialSoldBurger;
        numberOfTotalSell += numberOfInitialSoldBurger;
    }

    public void sold(int amount) {
        numberOfSell += amount;
        numberOfTotalSell += amount;
    }

    public void displayStallSales() {
        System.out.println("Stall ID: " + ID);
        System.out.println("Burgers sold in a stall: " + numberOfSell);
    }

    public static void displayTotalSales() {
        System.out.println("Total burgers sold across all stalls: " + numberOfTotalSell);
    }
}