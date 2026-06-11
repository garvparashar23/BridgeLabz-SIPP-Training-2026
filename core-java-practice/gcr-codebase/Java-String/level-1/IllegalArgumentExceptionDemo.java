import java.util.Scanner;

class IllegalArgumentExceptionDemo {

   public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);

      System.out.print("Enter text: ");
      String text = sc.nextLine();

      int start = text.length();
      int end = 0;

      System.out.println("\n--- Generating IllegalArgumentException ---");
      try {
         String result = text.substring(start, end);
         System.out.println("Substring: " + result);
      } catch (IllegalArgumentException e) {
         System.out.println("Program stopped due to: " + e.getMessage());
      }

      System.out.println("\n--- Handling IllegalArgumentException ---");
      try {
         String result = text.substring(start, end);
         System.out.println("Substring: " + result);
      } catch (IllegalArgumentException e) {
         System.out.println("IllegalArgumentException: " + e.getMessage());
      }

      sc.close();
   }
}
