public class FindTheDifferenceSolution {
    public char findTheDifference(String s, String t) {
        char result = 0;

        for (char ch : s.toCharArray()) {
            result ^= ch;
        }

        for (char ch : t.toCharArray()) {
            result ^= ch;
        }

        return result;
    }

    public static void main(String[] args) {
        FindTheDifferenceSolution solution = new FindTheDifferenceSolution();
        System.out.println(solution.findTheDifference("abcd", "abcde"));
    }
}
