public class Main {
    public static void main (String [] args){
        Room r1 = new Room ("101", "Single", 200.00);
        Room r2 = new Room ("205", "Double", 350.00);
        Room r3 = new Room ("311", "Suite", 700.00);

        int days = 5;
        double discount = 10.0;

        Room.displayRoomDetails(r1);
        displayRent(days, r1.calculateRent(days), discount, r1.calculateRent(days, discount));
        System.out.println();
        Room.displayRoomDetails(r2);
        displayRent(days, r2.calculateRent(days), discount, r2.calculateRent(days, discount));
        System.out.println();
        Room.displayRoomDetails(r3);
        displayRent(days, r3.calculateRent(days));
        System.out.println();
    }

    public static void displayRent(int days, double rent, double discount, double discountedRent) {
        System.out.printf("Total rent for %d days: $%.2f\n", days, rent);
        System.out.printf("Total rent for %d days with $%.2f discount per night: $%.2f\n", days, discount, discountedRent);
    }

    public static void displayRent(int days, double rent) {
        System.out.printf("Total Rent for %d days without discount: $%.2f\n", days, rent);
    }
}