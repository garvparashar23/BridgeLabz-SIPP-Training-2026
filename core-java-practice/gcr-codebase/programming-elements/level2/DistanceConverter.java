import java.util.Scanner;

public class DistanceConverter {
    public static void main(String[] args) {
        // Create Scanner Object to take inputs
        Scanner input = new Scanner(System.in);
        
        // Prompt user to enter distance in feet
        System.out.print("Enter distance in feet: ");
        double distanceInFeet = input.nextDouble();
        
        // Define conversion factors as variables
        double feetPerYard = 3.0;
        double yardsPerMile = 1760.0;
        
        // Perform conversion calculations
        double distanceInYards = distanceInFeet / feetPerYard;
        double distanceInMiles = distanceInYards / yardsPerMile;
        
        // Print the result matching the output format:
        // The distance in yards is ___ while the distance in miles is ___
        System.out.println("The distance in yards is " + distanceInYards + " while the distance in miles is " + distanceInMiles);
        
        // Close the scanner
        input.close();
    }
}
