import java.util.Scanner;

public class VolumeOfCylinder {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter radius: ");
        double radius = input.nextDouble();
        System.out.print("Enter height: ");
        double height = input.nextDouble();
        double volume = Math.PI * radius * radius * height;
        System.out.println("Volume of cylinder: " + volume);
        input.close();
    }
}
