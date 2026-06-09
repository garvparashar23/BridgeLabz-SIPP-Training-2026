import java.util.Scanner;
public class SumOfNaturalNumbersWhile {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int number = input.nextInt();
        if (number > 0) {
            int formulaSum = number * (number + 1) / 2;
            int loopSum = 0;
            int counter = 1;
            while (counter <= number) {
                loopSum += counter;
                counter++;
            }
            System.out.println("Sum computed using formula: " + formulaSum);
            System.out.println("Sum computed using while loop: " + loopSum);
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
