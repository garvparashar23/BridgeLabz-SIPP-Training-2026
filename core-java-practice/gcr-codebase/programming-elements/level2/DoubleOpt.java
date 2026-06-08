import java.util.Scanner;

public class DoubleOpt {
    public static void main(String[] args) {
        // Create Scanner Object to take inputs from Keyboard
        Scanner input = new Scanner(System.in);
        
        // Prompt user to enter double values for a, b, and c
        System.out.print("Enter value of a (double): ");
        double a = input.nextDouble();
        
        System.out.print("Enter value of b (double): ");
        double b = input.nextDouble();
        
        System.out.print("Enter value of c (double): ");
        double c = input.nextDouble();
        
        // Perform operations demonstrating operator precedence on double:
        // 1. Multiplication (*) has higher precedence than addition (+)
        double op1 = a + b * c;
        
        // 2. Multiplication (*) has higher precedence than addition (+)
        double op2 = a * b + c;
        
        // 3. Division (/) has higher precedence than addition (+)
        double op3 = c + a / b;
        
        // 4. Modulus (%) has higher precedence than addition (+)
        double op4 = a % b + c;
        
        // Print the results matching the output format:
        // The results of Double Operations are ___, ___, ___, and ___
        System.out.println("The results of Double Operations are " + op1 + ", " + op2 + ", " + op3 + ", and " + op4);
        
        // Close the scanner
        input.close();
    }
}
