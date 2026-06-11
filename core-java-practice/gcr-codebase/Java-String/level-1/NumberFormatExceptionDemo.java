import java.util.Scanner;

class NumberFormatExceptionDemo {

   public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);

      System.out.print("Enter text to parse as integer: ");
      String text = sc.nextLine();

      System.out.println("\n--- Generating NumberFormatException ---");
      try {
         int num = Integer.parseInt(text);
         System.out.println("Parsed number: " + num);
      } catch (NumberFormatException e) {
         System.out.println("Program stopped due to: " + e.getMessage());
      }

      System.out.println("\n--- Handling NumberFormatException ---");
      try {
         int num = Integer.parseInt(text);
         System.out.println("Parsed number: " + num);
      } catch (NumberFormatException e) {
         System.out.println("NumberFormatException: " + e.getMessage());
      }

      sc.close();
   }
}
