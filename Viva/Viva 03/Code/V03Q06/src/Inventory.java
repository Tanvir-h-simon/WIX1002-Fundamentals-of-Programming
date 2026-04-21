import java.util.HashMap;
import java.util.Map;

public class Inventory {
    private Map<Product, Integer> productStock;

    public Inventory() {
        this.productStock = new HashMap<>();
    }

    public void addProduct(Product product, int qty) {
        productStock.put(product, qty);
    }

    public boolean isAvailable(Product product, int qty) {
        return productStock.getOrDefault(product, 0) >= qty;
    }

    public void updateStock(Product product, int qty) {
        product.reduceStock(qty);
        productStock.put(product, productStock.get(product) - qty);
    }
}