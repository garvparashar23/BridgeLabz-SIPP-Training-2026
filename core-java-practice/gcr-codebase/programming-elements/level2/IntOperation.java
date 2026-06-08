import java.util.Scanner;

public class IntOperation {
    public static void main(String[] args) {
        // Create Scanner Object to take inputs from Keyboard
        Scanner input = new Scanner(System.in);
        
        // Prompt user to enter values for a, b, and c
        System.out.print("Enter value of a (integer): ");
        int a = input.nextInt();
        
        System.out.print("Enter value of b (integer): ");
        int b = input.nextInt();
        
        System.out.print("Enter value of c (integer): ");
        int c = input.nextInt();
        
        // Perform operations demonstrating operator precedence:
        // 1. Multiplication (*) has higher precedence than addition (+)
        int op1 = a + b * c;
        
        // 2. Multiplication (*) has higher precedence than addition (+)
        int op2 = a * b + c;
        
        // 3. Division (/) has higher precedence than addition (+)
        int op3 = c + a / b;
        
        // 4. Modulus (%) has higher precedence than addition (+)
        int op4 = a % b + c;
        
        // Print the results matching the output format:
        // The results of Int Operations are ___, ___, ___, and ___
        System.out.println("The results of Int Operations are " + op1 + ", " + op2 + ", " + op3 + ", and " + op4);
        
        // Close the scanner
        input.close();
    }
}
