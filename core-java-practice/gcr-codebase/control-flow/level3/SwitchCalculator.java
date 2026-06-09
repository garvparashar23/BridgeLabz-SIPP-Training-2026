import java.util.Scanner;
public class SwitchCalculator {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter first number (double): ");
        double first = input.nextDouble();
        System.out.print("Enter second number (double): ");
        double second = input.nextDouble();
        System.out.print("Enter operator (+, -, *, /): ");
        String op = input.next();
        double result = 0.0;
        boolean isValidOperation = true;
        switch (op) {
            case "+":
                result = first + second;
                break;
            case "-":
                result = first - second;
                break;
            case "*":
                result = first * second;
                break;
            case "/":
                if (second != 0) {
                    result = first / second;
                } else {
                    System.out.println("Error: Division by zero is undefined.");
                    isValidOperation = false;
                }
                break;
            default:
                System.out.println("Invalid Operator");
                isValidOperation = false;
                break;
        }
        if (isValidOperation) {
            System.out.println("Result: " + first + " " + op + " " + second + " = " + result);
        }
        input.close();
    }
}
