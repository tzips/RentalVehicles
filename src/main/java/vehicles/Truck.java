package vehicles;



    public class Truck extends Vehicle {
        private int capacity; // קיבולת המשאית
        private static final double DAILY_PRICE = 300.0;// מחיר יומי קבוע למשאית מלבד הקיבולת

        public Truck(String licensePlate, String make, String model, int capacity) {
            super(licensePlate, make, model);
            this.capacity = capacity;
            this.rentalPrice= DAILY_PRICE;
        }

        public int getCapacity() {
            return capacity;
        }

        public void setCapacity(int capacity) {
            this.capacity = capacity;
        }
        //דריסת המתודה מהאב לחישוב מחיר השכרת משאית
        @Override
        public double calculateRentalCost(int days) {
            if (days <= 0) {
                throw new IllegalArgumentException("Number of days must be positive");
            }
            double extra = capacity * 10; // תוספת על כל טון
            return (rentalPrice * days) + extra;
        }
    }


