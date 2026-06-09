import java.util.Scanner;
public class FriendComparison {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter Amar's age: ");
        int amarAge = input.nextInt();
        System.out.print("Enter Amar's height (in cm): ");
        double amarHeight = input.nextDouble();
        System.out.print("Enter Akbar's age: ");
        int akbarAge = input.nextInt();
        System.out.print("Enter Akbar's height (in cm): ");
        double akbarHeight = input.nextDouble();
        System.out.print("Enter Anthony's age: ");
        int anthonyAge = input.nextInt();
        System.out.print("Enter Anthony's height (in cm): ");
        double anthonyHeight = input.nextDouble();
        String youngestFriend = "";
        String tallestFriend = "";
        if (amarAge <= akbarAge && amarAge <= anthonyAge) {
            youngestFriend = "Amar";
        } else if (akbarAge <= amarAge && akbarAge <= anthonyAge) {
            youngestFriend = "Akbar";
        } else {
            youngestFriend = "Anthony";
        }
        if (amarHeight >= akbarHeight && amarHeight >= anthonyHeight) {
            tallestFriend = "Amar";
        } else if (akbarHeight >= amarHeight && akbarHeight >= anthonyHeight) {
            tallestFriend = "Akbar";
        } else {
            tallestFriend = "Anthony";
        }
        System.out.println("Youngest Friend: " + youngestFriend);
        System.out.println("Tallest Friend: " + tallestFriend);
        input.close();
    }
}
