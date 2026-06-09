import java.util.Scanner;
public class FactorsFor {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a positive integer: ");
        int number = input.nextInt();
        if (number > 0) {
            System.out.print("Factors of " + number + " (excluding itself): ");
            for (int i = 1; i < number; i++) {
                if (number % i == 0) {
                    System.out.print(i + " ");
                }
            }
            System.out.println();
        } else {
            System.out.println("Error: Please enter a positive integer.");
        }
        input.close();
    }
}
