import java.util.Scanner;
public class FactorialFor {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a positive integer: ");
        int number = input.nextInt();
        if (number >= 0) {
            long factorial = 1;
            for (int i = 1; i <= number; i++) {
                factorial = factorial * i;
            }
            System.out.println("The factorial of " + number + " is " + factorial);
        } else {
            System.out.println("Error: Factorial is not defined for negative numbers.");
        }
        input.close();
    }
}
