public class Connection {
    // static - belongs to the class, not to any specific object.
    private static int count = 0;

    public Connection() {
        count++;
    }

    public void disconnect() {
        if (count > 0) {
            count--;
        }
    }

    public void display() {
        System.out.println("Current connections: " + count);
    }
}