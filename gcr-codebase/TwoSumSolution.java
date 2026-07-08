import java.util.HashMap;
import java.util.Map;
import java.util.Arrays;

public class TwoSumSolution {
    public int[] twoSum(int[] nums, int target) {
        Map<Integer, Integer> indexByValue = new HashMap<>();

        for (int index = 0; index < nums.length; index++) {
            int needed = target - nums[index];
            if (indexByValue.containsKey(needed)) {
                return new int[] {indexByValue.get(needed), index};
            }
            indexByValue.put(nums[index], index);
        }

        return new int[] {-1, -1};
    }

    public static void main(String[] args) {
        TwoSumSolution solution = new TwoSumSolution();
        System.out.println(Arrays.toString(solution.twoSum(new int[] {2, 7, 11, 15}, 9)));
    }
}
