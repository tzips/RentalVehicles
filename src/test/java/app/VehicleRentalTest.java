package app;

//בדיקה אוטומטית  על תקינות המתודה להשכרת רכבים
import org.junit.jupiter.api.Test;
import vehicles.Car;
import static org.junit.jupiter.api.Assertions.*;

   public class VehicleRentalTest {

        @Test
        void calculateRentalCost_shouldReturnCorrectValue() {
            Car car = new Car("123-45-678", "Toyota", "Corolla",  "Sedan");
            double cost = car.calculateRentalCost(3);
            assertEquals(750.0, cost, "Rental cost should be 3 days × 250₪");
        }
    }


