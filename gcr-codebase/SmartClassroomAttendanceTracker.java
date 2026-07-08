import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;

public class SmartClassroomAttendanceTracker {
    private final Map<String, ArrayList<String>> attendance = new HashMap<>();

    public boolean markAttendance(String subject, String studentName) {
        String subjectKey = subject.trim();
        String student = studentName.trim();
        ArrayList<String> students = attendance.computeIfAbsent(subjectKey, key -> new ArrayList<>());

        for (String existingStudent : students) {
            if (existingStudent.equalsIgnoreCase(student)) {
                return false;
            }
        }

        students.add(student);
        return true;
    }

    public List<String> getStudentsForSubject(String subject) {
        return attendance.getOrDefault(subject.trim(), new ArrayList<>());
    }

    public void displayAttendance() {
        if (attendance.isEmpty()) {
            System.out.println("No attendance has been marked.");
            return;
        }

        for (Map.Entry<String, ArrayList<String>> entry : new TreeMap<>(attendance).entrySet()) {
            System.out.println("Subject: " + entry.getKey());
            System.out.println("Students present: " + entry.getValue());
            System.out.println("Total present: " + entry.getValue().size());
            System.out.println();
        }
    }

    public static void main(String[] args) {
        SmartClassroomAttendanceTracker tracker = new SmartClassroomAttendanceTracker();
        tracker.markAttendance("Java", "Aarav");
        tracker.markAttendance("Java", "Meera");
        tracker.markAttendance("Java", "Aarav");
        tracker.markAttendance("Data Structures", "Rohan");
        tracker.displayAttendance();
    }
}
