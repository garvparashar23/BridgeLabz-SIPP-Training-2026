import java.util.Scanner;

public class SideOfSquare {
    public static void main(String[] args) {
        // Create Scanner Object to take inputs
        Scanner input = new Scanner(System.in);
        
        // Prompt the user to enter the perimeter of the square
        System.out.print("Enter the perimeter of the square: ");
        double perimeter = input.nextDouble();
        
        // Calculate the side of the square: side = perimeter / 4
        double side = perimeter / 4.0;
        
        // Print the result matching the output format:
        // The length of the side is ___ whose perimeter is ____
        System.out.println("The length of the side is " + side + " whose perimeter is " + perimeter);
        
        // Close the scanner
        input.close();
    }
}
