package vehicles;

public abstract class Vehicle {
    private String licensePlate;
    private String make;
    private String model;
    protected double rentalPrice;

    public Vehicle(String licensePlate, String make, String model, double rentalPrice) {
        this.licensePlate = licensePlate;
        this.make = make;
        this.model = model;
        this.rentalPrice = rentalPrice;
    }

    public String getLicensePlate() {
        return licensePlate;
    }

    public String getMake() {
        return make;
    }

    public String getModel() {
        return model;
    }

    public double getRentalPrice() {
        return rentalPrice;
    }
    public abstract double calculateRentalCost(int days);


}
