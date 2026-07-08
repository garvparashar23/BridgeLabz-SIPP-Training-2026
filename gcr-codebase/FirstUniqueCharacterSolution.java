public class FirstUniqueCharacterSolution {
    public int firstUniqChar(String s) {
        int[] frequency = new int[26];
        for (char ch : s.toCharArray()) {
            frequency[ch - 'a']++;
        }

        for (int index = 0; index < s.length(); index++) {
            if (frequency[s.charAt(index) - 'a'] == 1) {
                return index;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        FirstUniqueCharacterSolution solution = new FirstUniqueCharacterSolution();
        System.out.println(solution.firstUniqChar("leetcode"));
    }
}
