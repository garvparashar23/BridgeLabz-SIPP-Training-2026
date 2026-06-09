import java.util.Scanner;
public class BmiCalculator {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter weight of the person (in kg): ");
        double weight = input.nextDouble();
        System.out.print("Enter height of the person (in cm): ");
        double heightCm = input.nextDouble();
        double heightMeters = heightCm / 100.0;
        double bmi = weight / (heightMeters * heightMeters);
        String weightStatus = "";
        if (bmi <= 18.4) {
            weightStatus = "Underweight";
        } else if (bmi >= 18.5 && bmi <= 24.9) {
            weightStatus = "Normal";
        } else if (bmi >= 25.0 && bmi <= 39.9) {
            weightStatus = "Overweight";
        } else {
            weightStatus = "Obese";
        }
        System.out.println("\n--- BMI Calculation Results ---");
        System.out.println("Weight: " + weight + " kg");
        System.out.println("Height: " + heightCm + " cm (" + heightMeters + " m)");
        System.out.println("Calculated BMI: " + bmi);
        System.out.println("Weight Status: " + weightStatus);
        input.close();
    }
}
