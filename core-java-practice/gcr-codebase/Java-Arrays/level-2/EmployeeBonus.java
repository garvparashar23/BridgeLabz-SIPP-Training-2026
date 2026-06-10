import java.util.Scanner;

class EmployeeBonus {
   public static void main(String[] args) {
      Scanner input = new Scanner(System.in);
      int totalEmployees = 10;
      double bonusRateHigh = 5.0;
      double bonusRateLow = 2.0;
      int yearsThreshold = 5;
      double[] salary = new double[totalEmployees];
      double[] yearsOfService = new double[totalEmployees];
      double[] bonus = new double[totalEmployees];
      double[] newSalary = new double[totalEmployees];
      double totalBonus = 0.0;
      double totalOldSalary = 0.0;
      double totalNewSalary = 0.0;
      for (int i = 0; i < totalEmployees; ) {
         System.out.println("Employee " + (i + 1));
         System.out.print("Enter salary: ");
         double empSalary = input.nextDouble();
         System.out.print("Enter years of service: ");
         double empYears = input.nextDouble();
         if (empSalary < 0 || empYears < 0) {
            System.err.println("Invalid input. Please enter again.");
            continue;
         }
         salary[i] = empSalary;
         yearsOfService[i] = empYears;
         i++;
      }
      for (int i = 0; i < salary.length; i++) {
         if (yearsOfService[i] > yearsThreshold) {
            bonus[i] = salary[i] * bonusRateHigh / 100;
         } else {
            bonus[i] = salary[i] * bonusRateLow / 100;
         }
         newSalary[i] = salary[i] + bonus[i];
         totalBonus += bonus[i];
         totalOldSalary += salary[i];
         totalNewSalary += newSalary[i];
      }
      System.out.println("Total bonus payout: " + totalBonus);
      System.out.println("Total old salary: " + totalOldSalary);
      System.out.println("Total new salary: " + totalNewSalary);
      input.close();
   }
}
