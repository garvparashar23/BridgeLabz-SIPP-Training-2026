import java.util.Scanner;
public class RocketCountdownWhile {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter starting number for countdown: ");
        int counter = input.nextInt();
        while (counter >= 1) {
            System.out.println(counter);
            counter--;
        }
        input.close();
    }
}
