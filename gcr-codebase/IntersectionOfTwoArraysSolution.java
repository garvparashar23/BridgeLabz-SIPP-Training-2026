import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class IntersectionOfTwoArraysSolution {
    public int[] intersection(int[] nums1, int[] nums2) {
        Set<Integer> first = new HashSet<>();
        Set<Integer> result = new HashSet<>();

        for (int num : nums1) {
            first.add(num);
        }

        for (int num : nums2) {
            if (first.contains(num)) {
                result.add(num);
            }
        }

        int[] answer = new int[result.size()];
        int index = 0;
        for (int num : result) {
            answer[index++] = num;
        }
        return answer;
    }

    public static void main(String[] args) {
        IntersectionOfTwoArraysSolution solution = new IntersectionOfTwoArraysSolution();
        System.out.println(Arrays.toString(solution.intersection(new int[] {1, 2, 2, 1}, new int[] {2, 2})));
    }
}
