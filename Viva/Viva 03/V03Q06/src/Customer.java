public class Customer {
    private final String name;
    private final String email;
    private final String shippingAddress;

    public Customer(String name, String email, String shippingAddress)
    {
        this.name = name;
        this.email = email;
        this.shippingAddress = shippingAddress;
    }

    public String getName() {
        return name;
    }

    public String getEmail() {
        return email;
    }

    public String getShippingAddress() {
        return shippingAddress;
    }

    @Override
    public String toString() {
        return "Customer{" +
                "name='" + name + '\'' +
                ", email='" + email + '\'' +
                ", shippingAddress='" + shippingAddress + '\'' +
                '}';
    }
}