import java.util.Scanner;
public class EmployeeBonus {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter salary of the employee: ");
        double salary = input.nextDouble();
        System.out.print("Enter years of service: ");
        double yearsOfService = input.nextDouble();
        double bonusAmount = 0.0;
        double bonusRate = 0.05;
        if (yearsOfService > 5.0) {
            bonusAmount = salary * bonusRate;
        }
        System.out.println("The employee's bonus amount is: " + bonusAmount);
        input.close();
    }
}
