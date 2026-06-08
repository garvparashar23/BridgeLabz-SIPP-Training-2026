import java.util.Scanner;

public class BasicCalculator {
    public static void main(String[] args) {
        // Create Scanner Object to take inputs
        Scanner input = new Scanner(System.in);
        
        // Prompt user for the first number
        System.out.print("Enter first number: ");
        double number1 = input.nextDouble();
        
        // Prompt user for the second number
        System.out.print("Enter second number: ");
        double number2 = input.nextDouble();
        
        // Perform calculations and store results in variables
        double addition = number1 + number2;
        double subtraction = number1 - number2;
        double multiplication = number1 * number2;
        double division = number1 / number2;
        
        // Print the results matching the output format:
        // The addition, subtraction, multiplication and division value of 2 numbers ___ and ___ is ___, ____, ____, and ___
        System.out.println("The addition, subtraction, multiplication and division value of 2 numbers " + 
                           number1 + " and " + number2 + " is " + 
                           addition + ", " + subtraction + ", " + multiplication + ", and " + division);
        
        // Close the scanner
        input.close();
    }
}
