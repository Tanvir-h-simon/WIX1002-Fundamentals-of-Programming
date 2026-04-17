public class Main {
    public static void main(String[] args) {

        Connection c1 = new Connection();
        Connection c2 = new Connection();
        Connection c3 = new Connection();

        c1.display(); // Current connection 3

        c2.disconnect();
        c1.display();

        Connection c4 = new Connection();
        c1.display();
    }
}