import java.util.Scanner;
public class HarshadNumber {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter an integer: ");
        int number = input.nextInt();
        int sum = 0;
        int originalNumber = number;
        int tempNumber = number;
        while (tempNumber != 0) {
            int digit = tempNumber % 10;
            sum += digit;
            tempNumber = tempNumber / 10;
        }
        boolean isHarshad = (sum != 0) && (originalNumber % sum == 0);
        if (isHarshad) {
            System.out.println(originalNumber + " is a Harshad Number.");
        } else {
            System.out.println(originalNumber + " is Not a Harshad Number.");
        }
        input.close();
    }
}
