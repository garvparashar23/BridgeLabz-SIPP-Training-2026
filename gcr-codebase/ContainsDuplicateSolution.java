import java.util.HashSet;
import java.util.Set;

public class ContainsDuplicateSolution {
    public boolean containsDuplicate(int[] nums) {
        Set<Integer> seen = new HashSet<>();
        for (int num : nums) {
            if (!seen.add(num)) {
                return true;
            }
        }
        return false;
    }

    public static void main(String[] args) {
        ContainsDuplicateSolution solution = new ContainsDuplicateSolution();
        System.out.println(solution.containsDuplicate(new int[] {1, 2, 3, 1}));
    }
}
