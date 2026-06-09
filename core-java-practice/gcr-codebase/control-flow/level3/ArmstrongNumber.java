import java.util.Scanner;
public class ArmstrongNumber {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int number = input.nextInt();
        int sum = 0;
        int originalNumber = number;
        while (originalNumber != 0) {
            int digit = originalNumber % 10;
            int cube = digit * digit * digit;
            sum += cube;
            originalNumber = originalNumber / 10;
        }
        boolean isArmstrong = (number == sum);
        if (isArmstrong) {
            System.out.println(number + " is an Armstrong Number.");
        } else {
            System.out.println(number + " is not an Armstrong Number.");
        }
        input.close();
    }
}
