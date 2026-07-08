import java.util.ArrayDeque;
import java.util.Deque;

public class LongestAbsoluteFilePathSolution {
    public int lengthLongestPath(String input) {
        Deque<Integer> pathLengths = new ArrayDeque<>();
        pathLengths.push(0);
        int longest = 0;

        for (String line : input.split("\\n")) {
            int level = line.lastIndexOf("\t") + 1;
            String name = line.substring(level);

            while (pathLengths.size() > level + 1) {
                pathLengths.pop();
            }

            int currentLength = pathLengths.peek() + name.length();
            if (name.contains(".")) {
                longest = Math.max(longest, currentLength);
            } else {
                pathLengths.push(currentLength + 1);
            }
        }

        return longest;
    }

    public static void main(String[] args) {
        LongestAbsoluteFilePathSolution solution = new LongestAbsoluteFilePathSolution();
        System.out.println(solution.lengthLongestPath("dir\n\tsubdir1\n\tsubdir2\n\t\tfile.ext"));
    }
}
