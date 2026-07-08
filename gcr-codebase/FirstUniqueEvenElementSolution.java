import java.util.HashMap;
import java.util.Map;

public class FirstUniqueEvenElementSolution {
    public int firstUniqueEven(int[] nums) {
        Map<Integer, Integer> frequency = new HashMap<>();

        for (int num : nums) {
            if (num % 2 == 0) {
                frequency.put(num, frequency.getOrDefault(num, 0) + 1);
            }
        }

        for (int num : nums) {
            if (num % 2 == 0 && frequency.get(num) == 1) {
                return num;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        FirstUniqueEvenElementSolution solution = new FirstUniqueEvenElementSolution();
        System.out.println(solution.firstUniqueEven(new int[] {5, 4, 8, 4, 10, 8}));
    }
}
