import java.util.Scanner;
public class SumUntilZeroOrNegative {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double total = 0.0;
        while (true) {
            System.out.print("Enter a double value (0 or negative to stop): ");
            double value = input.nextDouble();
            if (value <= 0.0) {
                break;
            }
            total += value;
        }
        System.out.println("The sum of entered numbers is: " + total);
        input.close();
    }
}
