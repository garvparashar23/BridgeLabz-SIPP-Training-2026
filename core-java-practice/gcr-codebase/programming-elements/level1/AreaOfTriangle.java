import java.util.Scanner;

public class AreaOfTriangle {
    public static void main(String[] args) {
        // Create Scanner Object to read base and height
        Scanner input = new Scanner(System.in);
        
        // Prompt user for base and height of the triangle in centimeters
        System.out.print("Enter the base of the triangle in cm: ");
        double base = input.nextDouble();
        
        System.out.print("Enter the height of the triangle in cm: ");
        double height = input.nextDouble();
        
        // Calculate the area in square centimeters using formula: 0.5 * base * height
        double areaSqCm = 0.5 * base * height;
        
        // Define the conversion factor for centimeters to inches (1 inch = 2.54 cm)
        double cmPerInch = 2.54;
        
        // Convert the area to square inches by dividing by (2.54 * 2.54)
        double areaSqIn = areaSqCm / (cmPerInch * cmPerInch);
        
        // Print the result matching the output format:
        // The Area of the triangle in sq cm is ___ and sq in is ___
        System.out.println("The Area of the triangle in sq cm is " + areaSqCm + " and sq in is " + areaSqIn);
        
        // Close the scanner
        input.close();
    }
}
