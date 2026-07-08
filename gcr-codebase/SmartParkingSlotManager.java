import java.util.ArrayList;
import java.util.List;

public class SmartParkingSlotManager {
    private final List<String> parkedVehicles = new ArrayList<>();

    public boolean vehicleEnter(String registrationNumber) {
        String vehicle = registrationNumber.trim().toUpperCase();
        if (parkedVehicles.contains(vehicle)) {
            return false;
        }
        parkedVehicles.add(vehicle);
        return true;
    }

    public boolean vehicleExit(String registrationNumber) {
        return parkedVehicles.remove(registrationNumber.trim().toUpperCase());
    }

    public boolean searchVehicle(String registrationNumber) {
        return parkedVehicles.contains(registrationNumber.trim().toUpperCase());
    }

    public void displayParkedVehicles() {
        if (parkedVehicles.isEmpty()) {
            System.out.println("No vehicles are currently parked.");
            return;
        }

        System.out.println("Parked vehicles:");
        for (String vehicle : parkedVehicles) {
            System.out.println(vehicle);
        }
        System.out.println("Total occupied parking slots: " + parkedVehicles.size());
    }

    public static void main(String[] args) {
        SmartParkingSlotManager manager = new SmartParkingSlotManager();
        manager.vehicleEnter("MH12AB1234");
        manager.vehicleEnter("KA05CD5678");
        manager.vehicleEnter("DL10EF9012");
        System.out.println("Is KA05CD5678 parked? " + manager.searchVehicle("KA05CD5678"));
        manager.vehicleExit("MH12AB1234");
        manager.displayParkedVehicles();
    }
}
