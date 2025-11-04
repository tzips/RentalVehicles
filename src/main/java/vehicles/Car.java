package vehicles;


    public class Car extends Vehicle {
        private String type; // סוג המכונית (sedan, hatchback, SUV...)

        public Car(String licensePlate, String make, String model, double rentalPrice, String type) {
            super(licensePlate, make, model, rentalPrice);
            this.type = type;
        }

        public String getType() {
            return type;
        }

        public void setType(String type) {
            this.type = type;
        }

        @Override
        public double calculateRentalCost(int days) {
            if (days <= 0) {
                throw new IllegalArgumentException("Number of days must be positive");
            }
            return rentalPrice * days; // מחיר קבוע לפי ימים
        }
    }


