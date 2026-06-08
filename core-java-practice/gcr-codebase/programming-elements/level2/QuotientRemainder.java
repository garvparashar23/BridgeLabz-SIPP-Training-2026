import java.util.Scanner;

public class QuotientRemainder {
    public static void main(String[] args) {
        // Create Scanner Object to read input numbers
        Scanner input = new Scanner(System.in);
        
        // Prompt user for two numbers
        System.out.print("Enter the first number (integer): ");
        int number1 = input.nextInt();
        
        System.out.print("Enter the second number (integer): ");
        int number2 = input.nextInt();
        
        // Calculate the quotient using division operator (/)
        int quotient = number1 / number2;
        
        // Calculate the remainder using modulus operator (%)
        int remainder = number1 % number2;
        
        // Print the result matching the output format:
        // The Quotient is ___ and Reminder is ___ of two number ___ and ___
        System.out.println("The Quotient is " + quotient + " and Reminder is " + remainder + 
                           " of two number " + number1 + " and " + number2);
        
        // Close the scanner
        input.close();
    }
}
