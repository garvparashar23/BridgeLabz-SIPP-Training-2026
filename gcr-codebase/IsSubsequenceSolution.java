public class IsSubsequenceSolution {
    public boolean isSubsequence(String s, String t) {
        int sIndex = 0;
        int tIndex = 0;

        while (sIndex < s.length() && tIndex < t.length()) {
            if (s.charAt(sIndex) == t.charAt(tIndex)) {
                sIndex++;
            }
            tIndex++;
        }

        return sIndex == s.length();
    }

    public static void main(String[] args) {
        IsSubsequenceSolution solution = new IsSubsequenceSolution();
        System.out.println(solution.isSubsequence("abc", "ahbgdc"));
    }
}
