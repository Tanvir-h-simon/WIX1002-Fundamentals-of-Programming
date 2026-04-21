import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of items: ");
        int count = sc.nextInt();
        System.out.println("Enter per item cost: ");
        double itemCost = sc.nextDouble();


        DiscountPolicy bulk = new BulkDiscount(10, 0.4); // 40% discount for items in bulk
        DiscountPolicy other = new OtherDiscount(); // Other discount policy

        DiscountPolicy combined = new CombineDiscount(bulk, other); // Combine both policies

        System.out.println("Number of items: " + count);
        System.out.println("Item cost: " + itemCost * count + " RM");

        System.out.println("Bulk Discount: " + bulk.computeDiscount(count, itemCost) + " RM");
        System.out.println("Other Discount: " + other.computeDiscount(count, itemCost) + " RM");
        System.out.println("Best Discount: " + combined.computeDiscount(count, itemCost)+ " RM");
    }
}