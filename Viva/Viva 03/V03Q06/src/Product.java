public class Product {
    private final String name;
    private final double price;
    private int stock;

    // Constructor to initialize product attributes
    public Product(String name, double price, int stock) {
        this.name = name;
        this.price = price;
        this.stock = stock;
    }

    // Getter method to retrieve product name
    public String getName() {
        return name;
    }

    // Getter method to retrieve product price
    public double getPrice() {
        return price;
    }

    // Method to reduce stock by a specified quantity
    public void reduceStock(int quantity) {
        if (quantity > stock) {
            throw new IllegalArgumentException(name + " is out of stock");
        }
        stock -= quantity;
    }

    @Override
    public String toString() {
        return "Product{" +
                "name='" + name + ": " + '\'' +
                ", price=" + price +
                ", stock=" + stock +
                '}';
    }
}