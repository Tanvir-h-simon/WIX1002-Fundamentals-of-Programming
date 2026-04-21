public class Invoice {
    private final Order order;
    private final Customer customer;

    public Invoice(Order order, Customer customer) {
        this.order = order;
        this.customer = customer;
    }

    @Override
    public String toString() {

        StringBuilder sb = new StringBuilder();
        sb.append("Invoice for ").append(customer.getName()).append("\n");
        sb.append("Email: ").append(customer.getEmail()).append("\n");
        sb.append("Shipping Address: ").append(customer.getShippingAddress()).append("\n");
        sb.append("\n");
        sb.append("Products:").append("\n");

        for (Product product : order.getProducts()) {
            sb.append("- ").append(product.getName()).append(": RM").append(product.getPrice()).append("\n");
        }

        sb.append("\n");
        sb.append("Total: RM").append(order.calculateTotal()).append("\n");
        return sb.toString();
    }
}