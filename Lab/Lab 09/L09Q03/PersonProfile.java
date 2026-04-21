public class PersonProfile {
    private String name;
    private String address;
    private String email;

    public PersonProfile(String name, String address, String email) {
        this.name = name;
        this.address = address;
        this.email = email;
    }

    public String getName() {
        return name;
    }

    // If the field never changes after creation → constructor only, skip the setter
    // If the field can change later → add a setter
    public void setName(String name) {
        this.name = name;
    }


    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String toString() {
        return "Name: " + name +
                "\nAddress: " + address +
                "\nEmail: " + email;
    }
}