package customers;

import vehicles.Vehicle;
import java.util.List;

    public interface Customer {

        String getName(); // להחזיר שם הלקוח

        void rentVehicle(Vehicle vehicle, int days); // לשכור רכב למספר ימים

        List<Vehicle> getRentedVehicles(); // להחזיר רשימת רכבים ששכר
    }


