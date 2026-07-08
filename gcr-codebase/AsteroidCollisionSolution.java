import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.Deque;

public class AsteroidCollisionSolution {
    public int[] asteroidCollision(int[] asteroids) {
        Deque<Integer> stack = new ArrayDeque<>();

        for (int asteroid : asteroids) {
            boolean destroyed = false;
            while (!stack.isEmpty() && asteroid < 0 && stack.peekLast() > 0) {
                int top = stack.peekLast();
                if (top < -asteroid) {
                    stack.removeLast();
                } else if (top == -asteroid) {
                    stack.removeLast();
                    destroyed = true;
                    break;
                } else {
                    destroyed = true;
                    break;
                }
            }

            if (!destroyed) {
                stack.addLast(asteroid);
            }
        }

        int[] result = new int[stack.size()];
        int index = 0;
        for (int asteroid : stack) {
            result[index++] = asteroid;
        }
        return result;
    }

    public static void main(String[] args) {
        AsteroidCollisionSolution solution = new AsteroidCollisionSolution();
        System.out.println(Arrays.toString(solution.asteroidCollision(new int[] {5, 10, -5})));
    }
}
