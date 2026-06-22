class Vehicle {
    String vehicleNumber;
    String ownerName;
    String vehicleType;

    public Vehicle(String vehicleNumber, String ownerName, String vehicleType) {
        this.vehicleNumber = vehicleNumber;
        this.ownerName = ownerName;
        this.vehicleType = vehicleType;
    }
}

public class SmartParking {
    private static Vehicle[] vehicles = new Vehicle[10];

    public static void displayCars() {
        for (Vehicle v : vehicles) {
            if (v != null && "Car".equalsIgnoreCase(v.vehicleType)) {
                System.out.println("Car -> Owner: " + v.ownerName + ", Number: " + v.vehicleNumber);
            }
        }
    }

    public static void displayBikes() {
        for (Vehicle v : vehicles) {
            if (v != null && "Bike".equalsIgnoreCase(v.vehicleType)) {
                System.out.println("Bike -> Owner: " + v.ownerName + ", Number: " + v.vehicleNumber);
            }
        }
    }

    public static void main(String[] args) {
        vehicles[0] = new Vehicle("MH12AB1234", "Amit", "Car");
        vehicles[1] = new Vehicle("MH12CD5678", "Rohan", "Bike");
        vehicles[2] = new Vehicle("DL3CAN9999", "Priya", "Car");
        vehicles[3] = new Vehicle("DL3SAY8888", "Karan", "Bike");
        vehicles[4] = new Vehicle("KA51MB4567", "Sneha", "Car");
        vehicles[5] = new Vehicle("KA51XY1212", "Vijay", "Bike");
        vehicles[6] = new Vehicle("HR26BP0001", "Rahul", "Car");
        vehicles[7] = new Vehicle("HR26ZZ9999", "Anjali", "Bike");
        vehicles[8] = new Vehicle("UP16TR4321", "Sanjay", "Car");
        vehicles[9] = new Vehicle("UP16MN7890", "Deepak", "Bike");

        System.out.println("--- Parked Cars ---");
        displayCars();

        System.out.println("\n--- Parked Bikes ---");
        displayBikes();
    }
}
