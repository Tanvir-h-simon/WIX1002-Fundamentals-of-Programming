public class CombineDiscount extends DiscountPolicy{
    DiscountPolicy policy1;
    DiscountPolicy policy2;

    public CombineDiscount(DiscountPolicy policy1, DiscountPolicy policy2) {
        this.policy1 = policy1;
        this.policy2 = policy2;
    }

    @Override
    public double computeDiscount(int count, double itemCost) {
        double discount1 = policy1.computeDiscount(count, itemCost);
        double discount2 = policy2.computeDiscount(count, itemCost);

        return Math.max(discount1, discount2);
    }
}