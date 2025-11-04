package customers;

import vehicles.Vehicle;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class CorporateCustomer implements Customer {
    private String name;
    private String companyName;
    private List<Vehicle> rentedVehicles;
    private static final double DISCOUNT_RATE = 0.1; // הנחת תאגיד 10%

    // 🔹 בנאי
    public CorporateCustomer(String name, String companyName) {
        this.name = name;
        this.companyName = companyName;
        this.rentedVehicles = new ArrayList<>();
    }

    @Override
    public String getName() {
        return name + " (" + companyName + ")";
    }

    @Override
    public void rentVehicle(Vehicle vehicle, int days) {
        rentedVehicles.add(vehicle);
        double originalCost = vehicle.calculateRentalCost(days);
        double discountedCost = originalCost * (1 - DISCOUNT_RATE);
        System.out.println(name + " from " + companyName +
                " rented " + vehicle.getModel() +
                " for " + days + " days with discount. Total cost: " + discountedCost);
    }

    @Override
    public List<Vehicle> getRentedVehicles() {
        return Collections.unmodifiableList(rentedVehicles);
    }
}

