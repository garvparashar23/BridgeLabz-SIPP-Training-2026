import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

public class SmartCityTrafficMonitoringSystem {
    private final Map<String, Integer> vehicleCounts = new HashMap<>();

    public void addOrUpdateVehicleCount(String roadName, int count) {
        if (count < 0) {
            throw new IllegalArgumentException("Vehicle count cannot be negative.");
        }
        vehicleCounts.put(roadName.trim(), count);
    }

    public void addVehicles(String roadName, int vehicles) {
        if (vehicles < 0) {
            throw new IllegalArgumentException("Vehicle count cannot be negative.");
        }
        String road = roadName.trim();
        vehicleCounts.put(road, vehicleCounts.getOrDefault(road, 0) + vehicles);
    }

    public String findBusiestRoad() {
        String busiestRoad = null;
        int highestCount = -1;

        for (Map.Entry<String, Integer> entry : vehicleCounts.entrySet()) {
            if (entry.getValue() > highestCount) {
                highestCount = entry.getValue();
                busiestRoad = entry.getKey();
            }
        }

        return busiestRoad == null ? "No roads monitored" : busiestRoad + " (" + highestCount + " vehicles)";
    }

    public void displaySortedRoads() {
        for (Map.Entry<String, Integer> entry : new TreeMap<>(vehicleCounts).entrySet()) {
            System.out.println(entry.getKey() + ": " + entry.getValue() + " vehicles");
        }
    }

    public void generateTrafficReport() {
        if (vehicleCounts.isEmpty()) {
            System.out.println("No traffic data available.");
            return;
        }

        System.out.println("Traffic Analysis Report");
        displaySortedRoads();
        System.out.println("Busiest road: " + findBusiestRoad());
        System.out.println("Total roads monitored: " + vehicleCounts.size());
    }

    public static void main(String[] args) {
        SmartCityTrafficMonitoringSystem system = new SmartCityTrafficMonitoringSystem();
        system.addOrUpdateVehicleCount("MG Road", 450);
        system.addOrUpdateVehicleCount("Ring Road", 680);
        system.addVehicles("MG Road", 75);
        system.generateTrafficReport();
    }
}
