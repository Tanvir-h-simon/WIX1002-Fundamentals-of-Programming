public class PurchaseSystem {
    String productCode;
    double unitPrice;
    int quantity;
    double totalPrice;

    public PurchaseSystem(String productCode, double unitPrice, int quantity) {
        this.productCode = productCode;
        this.unitPrice = unitPrice;
        this.quantity = quantity;
    }

    public double calcTotalPrice() {
        return unitPrice * quantity;
    }

    public void display() {
        System.out.println("Product Code: " + productCode);
        System.out.println("Unit Price: " + unitPrice);
        System.out.println("Quantity: " + quantity);
        System.out.println("Total Price: " + calcTotalPrice());
    }
}