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
        
        // Calculate the area in square centimeters: ½ * base * height
        double areaSqCm = 0.5 * base * height;
        
        // Define the conversion factor (1 inch = 2.54 cm)
        double cmPerInch = 2.54;
        
        // Calculate the area in square inches
        double areaSqIn = areaSqCm / (cmPerInch * cmPerInch);
        
        // Print the result matching the output format:
        // The Area of the triangle in sq in is ___ and sq cm is ___
        System.out.println("The Area of the triangle in sq in is " + areaSqIn + " and sq cm is " + areaSqCm);
        
        // Close the scanner
        input.close();
    }
}
