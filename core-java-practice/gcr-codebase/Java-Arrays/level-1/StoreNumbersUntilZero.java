import java.util.Scanner;

class StoreNumbersUntilZero {
   public static void main(String[] args) {
      Scanner input = new Scanner(System.in);
      int maxSize = 10;
      double[] numbers = new double[maxSize];
      double total = 0.0;
      int index = 0;
      while (true) {
         System.out.print("Enter a number: ");
         double userEntry = input.nextDouble();
         if (userEntry <= 0) {
            break;
         }
         if (index == maxSize) {
            break;
         }
         numbers[index] = userEntry;
         index++;
      }
      System.out.print("Numbers entered: ");
      for (int i = 0; i < index; i++) {
         System.out.print(numbers[i] + " ");
         total += numbers[i];
      }
      System.out.println();
      System.out.println("Total: " + total);
      input.close();
   }
}
