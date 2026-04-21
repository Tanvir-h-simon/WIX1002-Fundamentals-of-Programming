import java.util.ArrayList;
import java.util.List;

public class Order {
    private List<Product> products;

    public Order() {
        this.products = new ArrayList<>();
    }

    public List<Product> getProducts() {
        return products;
    }

    public void addProduct(Product product) {
        products.add(product);
        // System.out.println("Product added to the order: " + product.getName());
    }

    public void removeProduct(Product product) {
        products.remove(product);
        // System.out.println("Product removed from the order: " + product.getName());
    }

    public double calculateTotal() {
        double total = 0;
        for (Product product : products) {
            total += product.getPrice();
        }
        // System.out.println("Total price of the order: " + total);
        return total;
    }
}