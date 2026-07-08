import java.util.ArrayDeque;
import java.util.Deque;

public class EvaluateReversePolishNotationSolution {
    public int evalRPN(String[] tokens) {
        Deque<Integer> stack = new ArrayDeque<>();

        for (String token : tokens) {
            if (isOperator(token)) {
                int right = stack.pop();
                int left = stack.pop();
                stack.push(calculate(left, right, token));
            } else {
                stack.push(Integer.parseInt(token));
            }
        }

        return stack.pop();
    }

    private boolean isOperator(String token) {
        return token.equals("+") || token.equals("-") || token.equals("*") || token.equals("/");
    }

    private int calculate(int left, int right, String operator) {
        switch (operator) {
            case "+":
                return left + right;
            case "-":
                return left - right;
            case "*":
                return left * right;
            default:
                return left / right;
        }
    }

    public static void main(String[] args) {
        EvaluateReversePolishNotationSolution solution = new EvaluateReversePolishNotationSolution();
        System.out.println(solution.evalRPN(new String[] {"2", "1", "+", "3", "*"}));
    }
}
