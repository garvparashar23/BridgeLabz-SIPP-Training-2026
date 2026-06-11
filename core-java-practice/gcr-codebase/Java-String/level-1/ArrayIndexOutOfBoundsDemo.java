import java.util.Scanner;

class ArrayIndexOutOfBoundsDemo {

   public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);

      System.out.print("Enter number of names: ");
      int count = sc.nextInt();
      sc.nextLine();

      if (count <= 0) {
         System.out.println("Invalid number of names.");
         sc.close();
         return;
      }

      String[] names = new String[count];
      for (int i = 0; i < count; i++) {
         System.out.print("Enter name " + (i + 1) + ": ");
         names[i] = sc.nextLine();
      }

      int badIndex = names.length + 1;

      System.out.println("\n--- Generating ArrayIndexOutOfBoundsException ---");
      try {
         System.out.println("Accessing invalid index " + badIndex + ": " + names[badIndex]);
      } catch (ArrayIndexOutOfBoundsException e) {
         System.out.println("Program stopped due to: " + e.getMessage());
      }

      System.out.println("\n--- Handling ArrayIndexOutOfBoundsException ---");
      try {
         System.out.println("Accessing invalid index " + badIndex + ": " + names[badIndex]);
      } catch (ArrayIndexOutOfBoundsException e) {
         System.out.println("ArrayIndexOutOfBoundsException: " + e.getMessage());
      }

      sc.close();
   }
}
