public class Main {
    public static void main(String[] args) {
        Vehicle van = new Vehicle("0011", "Van", "Toyota", 100.0, 50.0);
        // System.out.print(van.toString());
        System.out.print(van);

        int rentalDays = 2;
        System.out.println("Rental Days: " + rentalDays);
        System.out.println("Total Cost: RM" +
                van.calculateRentalCost(rentalDays));

        System.out.println("-".repeat(20));

        Vehicle motorcycle = new Vehicle("0022", "Motorcycle", "Honda", 150.0, 100.0);
        System.out.print(motorcycle.toString());
        rentalDays = 14;
        System.out.println("Rental Days: " + rentalDays);
        System.out.println("Total Cost: RM" +
                van.calculateRentalCost(rentalDays));
    }
} 