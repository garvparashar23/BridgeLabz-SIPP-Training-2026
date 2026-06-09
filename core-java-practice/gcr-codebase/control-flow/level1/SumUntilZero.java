import java.util.Scanner;
public class SumUntilZero {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double total = 0.0;
        System.out.print("Enter a double value (0 to stop): ");
        double value = input.nextDouble();
        while (value != 0.0) {
            total += value;
            System.out.print("Enter next double value (0 to stop): ");
            value = input.nextDouble();
        }
        System.out.println("The sum of entered numbers is: " + total);
        input.close();
    }
}
