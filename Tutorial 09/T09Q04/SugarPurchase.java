public class SugarPurchase extends PurchaseSystem{
    double weight;

    public SugarPurchase(String productCode, double unitPrice, int quantity, double weight) {
        super(productCode, unitPrice, quantity);
        this.weight = weight;
    }

    @Override
    public double calcTotalPrice() {
        // return unitPrice * quantity * weight;
        return super.calcTotalPrice() + weight;
    }
}