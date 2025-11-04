package vehicles;



    public class Truck extends Vehicle {
        private int capacity; // קיבולת המשאית (בטונות למשל)

        public Truck(String licensePlate, String make, String model, double rentalPrice, int capacity) {
            super(licensePlate, make, model, rentalPrice);
            this.capacity = capacity;
        }

        public int getCapacity() {
            return capacity;
        }

        public void setCapacity(int capacity) {
            this.capacity = capacity;
        }

        @Override
        public double calculateRentalCost(int days) {
            if (days <= 0) {
                throw new IllegalArgumentException("Number of days must be positive");
            }
            double extra = capacity * 10; // תוספת על כל טון
            return (rentalPrice * days) + extra;
        }
    }


