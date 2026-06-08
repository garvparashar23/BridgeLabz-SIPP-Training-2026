import java.util.Scanner;

public class HeightConverter {
    public static void main(String[] args) {
        // Create Scanner Object to take user input from standard input
        Scanner input = new Scanner(System.in);
        
        // Prompt the user for height in centimeters
        System.out.print("Enter your height in centimeters: ");
        double heightCm = input.nextDouble();
        
        // Define conversion constants as variables
        double cmPerInch = 2.54;
        int inchesPerFoot = 12;
        
        // Convert total height in cm to total inches
        double totalInches = heightCm / cmPerInch;
        
        // Compute the number of feet (integer division)
        int feet = (int) (totalInches / inchesPerFoot);
        
        // Compute the remaining inches (modulus division)
        double remainingInches = totalInches % inchesPerFoot;
        
        // Print the result matching the output format: Your Height in cm is ___ while in feet is ___ and inches is ___
        System.out.println("Your Height in cm is " + heightCm + " while in feet is " + feet + " and inches is " + remainingInches);
        
        // Close the scanner
        input.close();
    }
}
