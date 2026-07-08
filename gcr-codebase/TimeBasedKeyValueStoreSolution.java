import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class TimeBasedKeyValueStoreSolution {
    private final Map<String, List<Entry>> valuesByKey = new HashMap<>();

    public void set(String key, String value, int timestamp) {
        valuesByKey.computeIfAbsent(key, unused -> new ArrayList<>()).add(new Entry(timestamp, value));
    }

    public String get(String key, int timestamp) {
        List<Entry> entries = valuesByKey.get(key);
        if (entries == null) {
            return "";
        }

        int left = 0;
        int right = entries.size() - 1;
        String answer = "";

        while (left <= right) {
            int middle = left + (right - left) / 2;
            Entry current = entries.get(middle);
            if (current.timestamp <= timestamp) {
                answer = current.value;
                left = middle + 1;
            } else {
                right = middle - 1;
            }
        }

        return answer;
    }

    public static void main(String[] args) {
        TimeBasedKeyValueStoreSolution store = new TimeBasedKeyValueStoreSolution();
        store.set("foo", "bar", 1);
        System.out.println(store.get("foo", 1));
        System.out.println(store.get("foo", 3));
    }

    static class Entry {
        private final int timestamp;
        private final String value;

        Entry(int timestamp, String value) {
            this.timestamp = timestamp;
            this.value = value;
        }
    }
}
