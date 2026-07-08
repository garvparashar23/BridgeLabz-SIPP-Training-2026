import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class EventEntryVerificationSystem {
    private final Set<String> participantEmails = new HashSet<>();

    public boolean registerParticipant(String email) {
        return participantEmails.add(email.trim().toLowerCase());
    }

    public void displayParticipants() {
        if (participantEmails.isEmpty()) {
            System.out.println("No participants registered yet.");
            return;
        }

        System.out.println("Unique registered participants:");
        for (String email : new TreeSet<>(participantEmails)) {
            System.out.println(email);
        }
        System.out.println("Total eligible attendees: " + participantEmails.size());
    }

    public static void main(String[] args) {
        EventEntryVerificationSystem system = new EventEntryVerificationSystem();
        System.out.println(system.registerParticipant("riya@example.com") ? "Registered" : "Duplicate");
        System.out.println(system.registerParticipant("aman@example.com") ? "Registered" : "Duplicate");
        System.out.println(system.registerParticipant("RIYA@example.com") ? "Registered" : "Duplicate");
        system.displayParticipants();
    }
}
