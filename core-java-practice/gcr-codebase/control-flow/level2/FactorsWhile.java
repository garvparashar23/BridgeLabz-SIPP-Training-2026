import java.util.Scanner;
public class FactorsWhile {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a positive integer: ");
        int number = input.nextInt();
        if (number > 0) {
            System.out.print("Factors of " + number + " (excluding itself): ");
            int counter = 1;
            while (counter < number) {
                if (number % counter == 0) {
                    System.out.print(counter + " ");
                }
                counter++;
            }
            System.out.println();
        } else {
            System.out.println("Error: Please enter a positive integer.");
        }
        input.close();
    }
}
