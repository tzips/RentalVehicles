package customers;

import vehicles.Vehicle;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class RegularCustomer implements Customer {
    private String name;
    private List<Vehicle> rentedVehicles; // רשימת רכבים ששכר

    // 🔹 בנאי
    public RegularCustomer(String name) {
        this.name = name;
        this.rentedVehicles = new ArrayList<>();
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public void rentVehicle(Vehicle vehicle, int days) {
        rentedVehicles.add(vehicle);
        double cost = vehicle.calculateRentalCost(days);
        System.out.println(name + " rented " + vehicle.getModel() +
                " for " + days + " days. Total cost: " + cost);
    }

    @Override
    public List<Vehicle> getRentedVehicles() {
        // מחזירים עותק לא ניתן לשינוי – עיקרון encapsulation
        return Collections.unmodifiableList(rentedVehicles);
    }
}

