package customers;

import vehicles.Vehicle;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class RegularCustomer implements Customer {
    private String name;
    private List<Vehicle> rentedVehicles;


    public RegularCustomer(String name) {
        this.name = name;
        this.rentedVehicles = new ArrayList<>();
    }

    @Override
    public String getName() {
        return name;
    }
    //דריסת המתודה מהאב למחיר רכב
    @Override
    public void rentVehicle(Vehicle vehicle, int days) {
        rentedVehicles.add(vehicle);
        double cost = vehicle.calculateRentalCost(days);
        System.out.println(name + " rented " + vehicle.getModel() +
                " for " + days + " days. Total cost: " + cost);
    }
    //דריסת המתודה מהאב לרשימת רכבי הלקוח
    @Override
    public List<Vehicle> getRentedVehicles() {
        return Collections.unmodifiableList(rentedVehicles);
    }
}

