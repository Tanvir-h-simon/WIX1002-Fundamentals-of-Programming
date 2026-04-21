import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.HashMap;

public class L07Q06 {
    public static void main(String[] args) {
        HashMap<String, String[]> productMap = new HashMap<>();

        try {
            BufferedReader br = new BufferedReader(new FileReader("data/product.txt"));
            String line;

            while ((line = br.readLine()) != null) {
                String[] parts = line.split(",");

                String productID   = parts[0].trim();
                String productName = parts[1].trim();
                String productPrice = parts[parts.length - 1].trim();

                productMap.put(productID, new String[]{productName, productPrice});
            }

            br.close();

        } catch (IOException e) {
            System.out.println("Error reading product.txt: " + e.getMessage());
            return;
        }

        try {
            BufferedReader br = new BufferedReader(new FileReader("data/order.txt"));
            String line;

            // Print header
            System.out.printf("%-10s %-25s %-10s %-15s %-12s%n",
                    "ProductID", "ProductName", "Quantity", "PricePerUnit", "TotalPrice");

            while ((line = br.readLine()) != null) {
                String[] parts = line.split(",");

                String orderID    = parts[0].trim();
                String productID  = parts[1].trim();
                int    quantity   = Integer.parseInt(parts[2].trim());

                if (productMap.containsKey(productID)) {
                    String[] product     = productMap.get(productID);
                    String   productName = product[0];
                    double   price       = Double.parseDouble(product[1]);
                    double   totalPrice  = price * quantity;

                    System.out.printf("%-10s %-25s %-10d %-15.2f %-12.2f%n",
                            productID, productName, quantity, price, totalPrice);
                } else {
                    System.out.printf("%-10s %-25s%n", productID, "[Product not found]");
                }
            }

            br.close();

        } catch (IOException e) {
            System.out.println("Error reading order.txt: " + e.getMessage());
        }
    }
}