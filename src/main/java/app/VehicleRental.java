package app;

import customers.CorporateCustomer;
import customers.Customer;
import customers.RegularCustomer;
import vehicles.Car;
import vehicles.Truck;
import vehicles.Vehicle;

import java.util.List;

public class VehicleRental {

    public static void main(String[] args) {

        // --------------------------
        // 🔹 שלב 1: יצירת רכבים לדוגמה
        // --------------------------
        Vehicle car1 = new Car("123-11-456", "Toyota", "Corolla", 50.0, "Sedan");
        Vehicle car2 = new Car("321-22-654", "Honda", "Civic", 60.0, "Hatchback");
        Vehicle truck1 = new Truck("555-33-999", "Volvo", "FH16", 100.0, 10);

        // --------------------------
        // 🔹 שלב 2: יצירת לקוחות
        // --------------------------
        Customer regular = new RegularCustomer("Tzipi");
        Customer corporate = new CorporateCustomer("David", "TechCorp");

        // --------------------------
        // 🔹 שלב 3: הדגמת פעולות השכרה (לוגים בזמן אמת)
        // --------------------------
        System.out.println("\n===== RENTAL OPERATIONS =====");
        regular.rentVehicle(car1, 3);
        corporate.rentVehicle(truck1, 5);
        regular.rentVehicle(car2, 2);

        // --------------------------
        // 🔹 שלב 4: הדפסת סיכום מסודר לפי לקוחות
        // --------------------------
        System.out.println("\n===== RENTAL SUMMARY BY CUSTOMER =====");
        printCustomerRentals(regular);
        printCustomerRentals(corporate);
    }

    private static void printCustomerRentals(Customer customer) {
        List<Vehicle> vehicles = customer.getRentedVehicles();
        System.out.println(customer.getName() + " rented the following vehicles:");

        if (vehicles.isEmpty()) {
            System.out.println(" • No vehicles rented.");
        } else {
            for (Vehicle v : vehicles) {
                System.out.println(" • " + v.getMake() + " " + v.getModel()
                        + " (" + v.getLicensePlate() + ") | Daily rate: " + v.getRentalPrice());
            }
        }
        System.out.println();
    }
}


