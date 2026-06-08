import java.util.Scanner;

public class CourseFeeDiscountUser {
    public static void main(String[] args) {
        // Create Scanner Object to take user input from Keyboard
        Scanner input = new Scanner(System.in);
        
        // Prompt user for course fee
        System.out.print("Enter the course fee (INR): ");
        double fee = input.nextDouble();
        
        // Prompt user for discount percentage
        System.out.print("Enter the discount percentage: ");
        double discountPercent = input.nextDouble();
        
        // Compute the discount amount
        double discount = (fee * discountPercent) / 100.0;
        
        // Compute the final discounted fee
        double finalFee = fee - discount;
        
        // Print the result matching the output format: The discount amount is INR ___ and final discounted fee is INR ___
        System.out.println("The discount amount is INR " + discount + " and final discounted fee is INR " + finalFee);
        
        // Close the scanner
        input.close();
    }
}
