import java.util.Scanner;
public class PowerFor {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter base number: ");
        int number = input.nextInt();
        System.out.print("Enter power (exponent): ");
        int power = input.nextInt();
        if (power >= 0) {
            long result = 1;
            for (int i = 1; i <= power; i++) {
                result = result * number;
            }
            System.out.println(number + "^" + power + " = " + result);
        } else {
            System.out.println("Error: Power (exponent) must be a non-negative integer.");
        }
        input.close();
    }
}
