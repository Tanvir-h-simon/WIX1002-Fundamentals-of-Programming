public class Room {
    private String roomNumber;
    private String roomType;
    private double rentalPrice;
    private static int totalRooms;

    public Room (String roomNumber, String roomType, double rentalPrice) {
        this.roomNumber = roomNumber;
        this.roomType = roomType;
        this.rentalPrice = rentalPrice;
        totalRooms++;
    }

    public String getRoomNumber(){
        return this.roomNumber ;
    }

    public String getRoomType(){
        return this.roomType;
    }

    public double getRentalPrice(){
        return this.rentalPrice;
    }

    public void setRoomNumber(String roomNumber){
        this.roomNumber = roomNumber;
    }

    public void setRoomType(String roomType){
        this.roomType = roomType;
    }

    public void setRentalPrice(double rentalPrice){
        this.rentalPrice = rentalPrice;
    }

    public double calculateRent(int days){
        return days * this.rentalPrice;
    }

    public double calculateRent(int days, double discount){
        return (this.rentalPrice - discount) * days;
    }

    public static Integer getTotalRooms(){
        return totalRooms;
    }

    public static void displayRoomDetails(Room room){
        System.out.println("Room Number: " + room.getRoomNumber());
        System.out.println("Room Type: " + room.getRoomType());
        System.out.printf("Rental Price: $%.2f\n", room.getRentalPrice());
        System.out.println("Total rooms: "+ totalRooms);
    }
}