import java.util.Scanner;
public class LeapYearLogicalOperators {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a year: ");
        int year = input.nextInt();
        int gregorianStartYear = 1582;
        if (year >= gregorianStartYear) {
            boolean isLeapYear = (year % 4 == 0 && year % 100 != 0) || (year % 400 == 0);
            if (isLeapYear) {
                System.out.println(year + " is a Leap Year.");
            } else {
                System.out.println(year + " is not a Leap Year.");
            }
        } else {
            System.out.println("The LeapYear program only works for year >= " + gregorianStartYear);
        }
        input.close();
    }
}
