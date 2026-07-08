import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class AddressBookApp {
    private final List<Contact> contacts = new ArrayList<>();
    private final Map<String, Contact> contactsByName = new HashMap<>();
    private final Set<String> phoneNumbers = new HashSet<>();

    public boolean addContact(String name, String phone, String email) {
        String key = normalize(name);
        if (contactsByName.containsKey(key) || phoneNumbers.contains(phone)) {
            return false;
        }

        Contact contact = new Contact(name, phone, email);
        contacts.add(contact);
        contactsByName.put(key, contact);
        phoneNumbers.add(phone);
        return true;
    }

    public Contact searchByName(String name) {
        return contactsByName.get(normalize(name));
    }

    public boolean deleteContact(String name) {
        Contact contact = contactsByName.remove(normalize(name));
        if (contact == null) {
            return false;
        }

        contacts.remove(contact);
        phoneNumbers.remove(contact.phone);
        return true;
    }

    public void displaySortedByName() {
        List<Contact> sortedContacts = new ArrayList<>(contacts);
        Collections.sort(sortedContacts);

        if (sortedContacts.isEmpty()) {
            System.out.println("Address book is empty.");
            return;
        }

        for (Contact contact : sortedContacts) {
            System.out.println(contact);
        }
    }

    private String normalize(String value) {
        return value.trim().toLowerCase();
    }

    public static void main(String[] args) {
        AddressBookApp app = new AddressBookApp();
        app.addContact("Aarav Sharma", "9876543210", "aarav@example.com");
        app.addContact("Meera Iyer", "9123456780", "meera@example.com");
        app.addContact("Rohan Gupta", "9988776655", "rohan@example.com");

        System.out.println("Search result: " + app.searchByName("Meera Iyer"));
        app.deleteContact("Rohan Gupta");
        System.out.println("\nContacts sorted by name:");
        app.displaySortedByName();
    }

    static class Contact implements Comparable<Contact> {
        private final String name;
        private final String phone;
        private final String email;

        Contact(String name, String phone, String email) {
            this.name = name;
            this.phone = phone;
            this.email = email;
        }

        @Override
        public int compareTo(Contact other) {
            return this.name.compareToIgnoreCase(other.name);
        }

        @Override
        public String toString() {
            return "Name: " + name + ", Phone: " + phone + ", Email: " + email;
        }
    }
}
