import java.util.Scanner;

class OddEvenArrays {
   public static void main(String[] args) {
      Scanner input = new Scanner(System.in);
      System.out.print("Enter a natural number: ");
      int number = input.nextInt();
      if (number <= 0) {
         System.err.println("Invalid Number.");
         System.exit(0);
      }
      int arraySize = number / 2 + 1;
      int[] evenNumbers = new int[arraySize];
      int[] oddNumbers = new int[arraySize];
      int evenIndex = 0;
      int oddIndex = 0;
      for (int i = 1; i <= number; i++) {
         if (i % 2 == 0) {
            evenNumbers[evenIndex] = i;
            evenIndex++;
         } else {
            oddNumbers[oddIndex] = i;
            oddIndex++;
         }
      }
      System.out.print("Even numbers: ");
      for (int i = 0; i < evenIndex; i++) {
         System.out.print(evenNumbers[i] + " ");
      }
      System.out.println();
      System.out.print("Odd numbers: ");
      for (int i = 0; i < oddIndex; i++) {
         System.out.print(oddNumbers[i] + " ");
      }
      input.close();
   }
}
