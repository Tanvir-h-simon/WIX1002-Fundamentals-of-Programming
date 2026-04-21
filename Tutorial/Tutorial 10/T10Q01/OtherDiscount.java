public class OtherDiscount extends DiscountPolicy {
    public OtherDiscount() {}

    @Override
    double computeDiscount(int count, double itemCost) {
        if (count <= 2 && count > 0) {
            return itemCost * 1; // No discount
        } else if (count > 2 && count <= 5) {
            return itemCost * 0.9; // 10% discount
        } else if (count > 5 && count <= 8) {
            return itemCost * 0.8; // 20% discount
        } else {
            return itemCost * 0.7; // 30% discount
        }
    }
}