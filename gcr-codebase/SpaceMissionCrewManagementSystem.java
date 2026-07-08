import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

public class SpaceMissionCrewManagementSystem {
    private final Map<String, List<Astronaut>> missionCrew = new HashMap<>();
    private final Map<String, Set<String>> assignedAstronautIds = new HashMap<>();

    public boolean addMission(String missionName) {
        String mission = missionName.trim();
        if (missionCrew.containsKey(mission)) {
            return false;
        }
        missionCrew.put(mission, new ArrayList<>());
        assignedAstronautIds.put(mission, new HashSet<>());
        return true;
    }

    public boolean assignAstronaut(String missionName, Astronaut astronaut) {
        String mission = missionName.trim();
        missionCrew.putIfAbsent(mission, new ArrayList<>());
        assignedAstronautIds.putIfAbsent(mission, new HashSet<>());

        if (!assignedAstronautIds.get(mission).add(astronaut.getAstronautId())) {
            return false;
        }

        missionCrew.get(mission).add(astronaut);
        return true;
    }

    public void displayMissions() {
        if (missionCrew.isEmpty()) {
            System.out.println("No missions available.");
            return;
        }

        for (Map.Entry<String, List<Astronaut>> entry : new TreeMap<>(missionCrew).entrySet()) {
            System.out.println("Mission: " + entry.getKey());
            for (Astronaut astronaut : entry.getValue()) {
                System.out.println("  " + astronaut);
            }
            System.out.println("Total astronauts: " + entry.getValue().size());
            System.out.println();
        }
    }

    public static void main(String[] args) {
        SpaceMissionCrewManagementSystem system = new SpaceMissionCrewManagementSystem();
        system.addMission("Lunar Research");
        system.assignAstronaut("Lunar Research", new Astronaut("A101", "Kavya Rao", "Pilot"));
        system.assignAstronaut("Lunar Research", new Astronaut("A102", "Neil Verma", "Engineer"));
        system.assignAstronaut("Mars Survey", new Astronaut("A101", "Kavya Rao", "Pilot"));
        system.assignAstronaut("Lunar Research", new Astronaut("A101", "Kavya Rao", "Pilot"));
        system.displayMissions();
    }

    static class Astronaut {
        private final String astronautId;
        private final String name;
        private final String specialization;

        Astronaut(String astronautId, String name, String specialization) {
            this.astronautId = astronautId;
            this.name = name;
            this.specialization = specialization;
        }

        String getAstronautId() {
            return astronautId;
        }

        @Override
        public String toString() {
            return "ID: " + astronautId + ", Name: " + name + ", Specialization: " + specialization;
        }
    }
}
