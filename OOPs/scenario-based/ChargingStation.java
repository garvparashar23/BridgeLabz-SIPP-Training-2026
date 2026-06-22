public class ChargingStation {
    public static int totalStations = 0;
    public static double electricityRate = 0.12;
    private String stationId;
    private double unitsConsumed;

    public ChargingStation(String stationId, double unitsConsumed) {
        this.stationId = stationId;
        this.unitsConsumed = unitsConsumed;
        totalStations++;
    }

    public double calculateBill() {
        return unitsConsumed * electricityRate;
    }

    public void displayStationDetails() {
        System.out.println("Station ID: " + stationId + ", Units Consumed: " + unitsConsumed + ", Bill: $" + calculateBill());
    }

    public static void main(String[] args) {
        ChargingStation s1 = new ChargingStation("STATION-A", 150.0);
        ChargingStation s2 = new ChargingStation("STATION-B", 250.0);
        ChargingStation s3 = new ChargingStation("STATION-C", 90.0);
        ChargingStation s4 = new ChargingStation("STATION-D", 400.0);
        ChargingStation s5 = new ChargingStation("STATION-E", 180.0);

        System.out.println("Details at rate $" + electricityRate + "/unit:");
        s1.displayStationDetails();
        s2.displayStationDetails();
        s3.displayStationDetails();
        s4.displayStationDetails();
        s5.displayStationDetails();

        System.out.println("\nChanging rate to $0.15/unit...");
        ChargingStation.electricityRate = 0.15;

        s1.displayStationDetails();
        s2.displayStationDetails();
        s3.displayStationDetails();
        s4.displayStationDetails();
        s5.displayStationDetails();

        System.out.println("\nTotal Stations Created: " + ChargingStation.totalStations);
    }
}
