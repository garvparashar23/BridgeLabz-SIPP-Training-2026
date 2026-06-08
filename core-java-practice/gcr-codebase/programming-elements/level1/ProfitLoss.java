public class ProfitLoss {
    public static void main(String[] args) {
        // Create variables for cost price and selling price
        double costPrice = 129.0;
        double sellingPrice = 191.0;
        
        // Calculate profit
        double profit = sellingPrice - costPrice;
        
        // Calculate profit percentage
        double profitPercentage = (profit / costPrice) * 100.0;
        
        // Use a single print statement to display multiline text and variables
        System.out.println("The Cost Price is INR " + costPrice + " and Selling Price is INR " + sellingPrice + "\n" +
                           "The Profit is INR " + profit + " and the Profit Percentage is " + profitPercentage);
    }
}
