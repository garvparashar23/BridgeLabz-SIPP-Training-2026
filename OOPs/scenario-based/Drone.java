public class Drone {
    private String droneId;
    private double batteryPercentage;
    public static String companyName = "Global Drones Co.";

    public Drone(String droneId, double batteryPercentage) {
        this.droneId = droneId;
        this.batteryPercentage = batteryPercentage;
    }

    public void startDelivery() {
        if (batteryPercentage >= 10.0) {
            batteryPercentage -= 10.0;
            System.out.println("Drone " + droneId + " started delivery. Battery level: " + batteryPercentage + "%");
        } else {
            System.out.println("Drone " + droneId + " battery too low to start delivery.");
        }
    }

    public void displayStatus() {
        System.out.println("Drone ID: " + droneId + ", Battery: " + batteryPercentage + "%, Company Name: " + companyName);
    }

    public static void main(String[] args) {
        Drone d1 = new Drone("DRONE-01", 95.0);
        Drone d2 = new Drone("DRONE-02", 50.0);
        Drone d3 = new Drone("DRONE-03", 8.0);

        d1.displayStatus();
        d2.displayStatus();
        d3.displayStatus();

        System.out.println("Verifying shared company name:");
        System.out.println("d1.companyName: " + Drone.companyName);
        System.out.println("d2.companyName: " + Drone.companyName);
        System.out.println("d3.companyName: " + Drone.companyName);

        Drone.companyName = "Logistics Premium";
        System.out.println("After changing companyName static field:");
        d1.displayStatus();
        d2.displayStatus();
        d3.displayStatus();

        d1.startDelivery();
        d2.startDelivery();
        d3.startDelivery();
    }
}
