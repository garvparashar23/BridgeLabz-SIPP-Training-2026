import java.util.Scanner;

public class KmToMilesConverter {
    public static void main(String[] args) {
        // Create Scanner Object to take user input from Standard Input (Keyboard)
        Scanner input = new Scanner(System.in);
        
        // Create a double variable km to store the input distance
        double km;
        
        // Prompt the user to enter the distance in kilometers
        System.out.print("Enter the distance in kilometers: ");
        km = input.nextDouble();
        
        // Create a conversion factor variable (1 mile = 1.6 km)
        double kmToMilesRatio = 1.6;
        
        // Calculate the distance in miles
        double miles = km / kmToMilesRatio;
        
        // Print the result matching the output format: The total miles is ___ mile for the given ___ km
        System.out.println("The total miles is " + miles + " mile for the given " + km + " km");
        
        // Close the scanner object
        input.close();
    }
}
