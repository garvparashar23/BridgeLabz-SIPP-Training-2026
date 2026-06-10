import java.util.Scanner;

class DigitFrequency {
   public static void main(String[] args) {
      Scanner input = new Scanner(System.in);
      System.out.print("Enter a number: ");
      int number = input.nextInt();
      if (number < 0) {
         System.err.println("Invalid Number.");
         System.exit(0);
      }
      int temp = number;
      int count = 0;
      if (temp == 0) {
         count = 1;
      } else {
         while (temp > 0) {
            count++;
            temp /= 10;
         }
      }
      int[] digits = new int[count];
      int num = number;
      if (num == 0) {
         digits[0] = 0;
      } else {
         for (int i = 0; i < count; i++) {
            digits[i] = num % 10;
            num /= 10;
         }
      }
      int[] frequency = new int[10];
      for (int i = 0; i < digits.length; i++) {
         frequency[digits[i]]++;
      }
      for (int i = 0; i < frequency.length; i++) {
         if (frequency[i] > 0) {
            System.out.println("Digit " + i + " appears " + frequency[i] + " times");
         }
      }
      input.close();
   }
}
