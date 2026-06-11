import java.util.Scanner;

class CalendarDisplay {

   public static String getMonthName(int month) {
      String[] names = {
            "January", "February", "March", "April", "May", "June",
            "July", "August", "September", "October", "November", "December"
      };
      return names[month - 1];
   }

   public static boolean isLeapYear(int year) {
      return (year % 400 == 0) || (year % 4 == 0 && year % 100 != 0);
   }

   public static int getDaysInMonth(int month, int year) {
      int[] days = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
      if (month == 2 && isLeapYear(year)) {
         return 29;
      }
      return days[month - 1];
   }

   public static int getFirstDay(int month, int year) {
      int y = year - ((14 - month) / 12);
      int m = month + (12 * ((14 - month) / 12)) - 2;
      return (1 + y + (y / 4) - (y / 100) + (y / 400) + (31 * m / 12)) % 7;
   }

   public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);

      System.out.print("Enter month (1-12): ");
      int month = sc.nextInt();
      System.out.print("Enter year: ");
      int year = sc.nextInt();

      if (month < 1 || month > 12) {
         System.out.println("Error: Invalid month.");
         sc.close();
         return;
      }

      int totalDays = getDaysInMonth(month, year);
      int firstDay = getFirstDay(month, year);

      System.out.println("\n     " + getMonthName(month) + " " + year);
      System.out.println("Sun Mon Tue Wed Thu Fri Sat");

      for (int i = 0; i < firstDay; i++) {
         System.out.print("    ");
      }

      for (int day = 1; day <= totalDays; day++) {
         System.out.printf("%3d ", day);
         if ((firstDay + day) % 7 == 0) {
            System.out.println();
         }
      }
      System.out.println();

      sc.close();
   }
}
