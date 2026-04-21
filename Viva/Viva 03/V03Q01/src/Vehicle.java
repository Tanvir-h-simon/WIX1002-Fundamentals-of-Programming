public class Vehicle {
    private String vehicleID;
    private String type;
    private String brand;
    private double rentalRate;
    private double fuelLevel;

    public Vehicle(){
        this.vehicleID= "0000";
        this.type= "Car";
        this.brand= "Myvi";
        this.rentalRate= 100.0;
        this.fuelLevel= 100.0;
    }

    public Vehicle(String vehicleID, String type, String brand, double
            rentalRate,  double fuelLevel){
        this.vehicleID = vehicleID;
        this.type = type;
        this.brand = brand;
        this.rentalRate = rentalRate;
        this.fuelLevel = fuelLevel;
    }

    public String getVehicleID() {
        return vehicleID;
    }
    public void setVehicleID(String vehicleID) {
        this.vehicleID = vehicleID;
    }
    public String getType() {
        return type;
    }
    public void setType(String type) {
        this.type = type;
    }
    public String getBrand() {
        return brand;
    }
    public void setBrand(String brand) {
        this.brand = brand;
    }
    public double getRentalRate() {
        return rentalRate;
    }
    public void setRentalRate(double rentalRate) {
        this.rentalRate = rentalRate;
    }
    public double getFuelLevel() {
        return fuelLevel;
    }
    public void setFuelLevel(double fuelLevel) {
        this.fuelLevel = fuelLevel;
    }

    public double calculateRentalRate() {
        double adjustedRate = rentalRate;
        if (type.equalsIgnoreCase("Van") || type.equalsIgnoreCase("vans")) {
            adjustedRate *= 1.2; // 20% more expensive 
        } else if (type.equalsIgnoreCase("Motorcycle") || type.equalsIgnoreCase("motorcycles")) {
            adjustedRate *= 0.75; // 25% less expensive 
        }
        return adjustedRate;
    }

    public double calculateRentalCost(int days) {
        double rate = calculateRentalRate();
        double totalCost = rate * days;

        if (days >= 7 && days <= 14) {
            totalCost *= 0.95; // 5% discount 
        } else if (days > 14) {
            totalCost *= 0.90; // 10% discount 
        }

        totalCost += calculateFuelCharge();
        return totalCost;
    }

    public double calculateFuelCharge() {
        if (fuelLevel <= 50.0) { // RM50 penalty if fuel < 50%
            return 50.0;
        }
        return 0.0; // No penalty
    }

    @Override
    public String toString() {
        return "Vehicle ID: " + vehicleID +
                "\nType: " + type +
                "\nBrand: " + brand +
                "\nRental Rate: $" + rentalRate +
                "\nFuel Level: " + fuelLevel + "%" +
                "\n";
    }
}