import java.util.Scanner;

class BMIMultiDimensional {
   public static void main(String[] args) {
      Scanner input = new Scanner(System.in);
      System.out.print("Enter number of persons: ");
      int numberOfPersons = input.nextInt();
      if (numberOfPersons <= 0) {
         System.err.println("Invalid number.");
         System.exit(0);
      }
      double[][] personData = new double[numberOfPersons][3];
      String[] weightStatus = new String[numberOfPersons];
      double underweightLimit = 18.5;
      double normalLimit = 24.9;
      double overweightLimit = 29.9;
      for (int i = 0; i < numberOfPersons; ) {
         System.out.println("Person " + (i + 1));
         System.out.print("Enter height (m): ");
         double height = input.nextDouble();
         System.out.print("Enter weight (kg): ");
         double weight = input.nextDouble();
         if (height <= 0 || weight <= 0) {
            System.err.println("Invalid values. Enter positive values.");
            continue;
         }
         personData[i][0] = height;
         personData[i][1] = weight;
         personData[i][2] = weight / (height * height);
         double bmi = personData[i][2];
         if (bmi < underweightLimit) {
            weightStatus[i] = "Underweight";
         } else if (bmi <= normalLimit) {
            weightStatus[i] = "Normal";
         } else if (bmi <= overweightLimit) {
            weightStatus[i] = "Overweight";
         } else {
            weightStatus[i] = "Obese";
         }
         i++;
      }
      for (int i = 0; i < numberOfPersons; i++) {
         System.out.println("Person " + (i + 1));
         System.out.println("Height: " + personData[i][0]);
         System.out.println("Weight: " + personData[i][1]);
         System.out.println("BMI: " + personData[i][2]);
         System.out.println("Status: " + weightStatus[i]);
      }
      input.close();
   }
}
