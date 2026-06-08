public class CourseFeeDiscount {
    public static void main(String[] args) {
        // Create a double variable named fee and assign 125000 to it
        double fee = 125000.0;
        
        // Create another double variable discountPercent and assign 10 to it
        double discountPercent = 10.0;
        
        // Compute discount amount and assign it to the discount variable
        double discount = (fee * discountPercent) / 100.0;
        
        // Compute the final discounted fee the student has to pay
        double finalFee = fee - discount;
        
        // Print the result matching the output format: The discount amount is INR ___ and final discounted fee is INR ___
        System.out.println("The discount amount is INR " + discount + " and final discounted fee is INR " + finalFee);
    }
}
