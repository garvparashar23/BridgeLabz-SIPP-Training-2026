import java.util.Scanner;
public class SumOfNaturalNumbersFor {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int number = input.nextInt();
        if (number > 0) {
            int formulaSum = number * (number + 1) / 2;
            int loopSum = 0;
            for (int i = 1; i <= number; i++) {
                loopSum += i;
            }
            System.out.println("Sum computed using formula: " + formulaSum);
            System.out.println("Sum computed using for loop: " + loopSum);
            if (formulaSum == loopSum) {
                System.out.println("Both computations match! The sum of " + number + " natural numbers is correct.");
            } else {
                System.out.println("Computations do not match.");
            }
        } else {
            System.out.println("The number " + number + " is not a natural number");
        }
        input.close();
    }
}
