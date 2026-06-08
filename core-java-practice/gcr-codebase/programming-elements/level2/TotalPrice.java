import java.util.Scanner;

public class TotalPrice {
    public static void main(String[] args) {
        // Create Scanner Object to read input values
        Scanner input = new Scanner(System.in);
        
        // Prompt user for unit price of the item
        System.out.print("Enter the unit price of the item (INR): ");
        double unitPrice = input.nextDouble();
        
        // Prompt user for the quantity to be bought
        System.out.print("Enter the quantity: ");
        int quantity = input.nextInt();
        
        // Calculate total price
        double totalPrice = unitPrice * quantity;
        
        // Print the result matching the output format:
        // The total purchase price is INR ___ if the quantity ___ and unit price is INR ___
        System.out.println("The total purchase price is INR " + totalPrice + " if the quantity " + quantity + " and unit price is INR " + unitPrice);
        
        // Close the scanner
        input.close();
    }
}
