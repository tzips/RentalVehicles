package vehicles;


    public class Car extends Vehicle {
        private String type;
        private static final double DAILY_PRICE = 250.0;// מחיר יומי קבוע למכונית

        public Car(String licensePlate, String make, String model, String type) {
            super(licensePlate, make, model);
            this.type = type;
            this .rentalPrice=DAILY_PRICE;
        }


        public String getType() {
            return type;
        }

        public void setType(String type) {
            this.type = type;
        }

        //דריסת המתודה מהאב לחישוב מחיר השכרת מכונית
        @Override
        public double calculateRentalCost(int days) {
            if (days <= 0) {
                throw new IllegalArgumentException("Number of days must be positive");
            }
            return rentalPrice * days; // מחיר קבוע לפי ימים
        }
    }


