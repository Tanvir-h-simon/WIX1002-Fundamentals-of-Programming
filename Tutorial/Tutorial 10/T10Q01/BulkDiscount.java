public class BulkDiscount extends DiscountPolicy {
    private int minimumOrder;
    double discountRate;

    public BulkDiscount(int minimumOrder, double discountRate) {
        this.minimumOrder = minimumOrder;
        this.discountRate = discountRate;
    }

    public double getMinimumOrder() {
        return minimumOrder;
    }

    public void setMinimumOrder(int minimumOrder) {
        this.minimumOrder = minimumOrder;
    }

    @Override
    double computeDiscount(int count, double itemCost) {
        return count >= minimumOrder ? itemCost * discountRate : 0;
    }
}