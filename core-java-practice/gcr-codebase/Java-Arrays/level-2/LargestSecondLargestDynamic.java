import java.util.Scanner;

class LargestSecondLargestDynamic {
   public static void main(String[] args) {
      Scanner input = new Scanner(System.in);
      System.out.print("Enter a number: ");
      int number = input.nextInt();
      if (number < 0) {
         System.err.println("Invalid Number.");
         System.exit(0);
      }
      int maxDigit = 10;
      int[] digits = new int[maxDigit];
      int index = 0;
      int tempNumber = number;
      while (tempNumber != 0) {
         if (index == maxDigit) {
            maxDigit = maxDigit + 10;
            int[] temp = new int[maxDigit];
            for (int j = 0; j < digits.length; j++) {
               temp[j] = digits[j];
            }
            digits = temp;
         }
         digits[index] = tempNumber % 10;
         tempNumber /= 10;
         index++;
      }
      int largest = 0;
      int secondLargest = 0;
      for (int i = 0; i < index; i++) {
         if (digits[i] > largest) {
            secondLargest = largest;
            largest = digits[i];
         } else if (digits[i] > secondLargest && digits[i] != largest) {
            secondLargest = digits[i];
         }
      }
      System.out.println("Largest digit: " + largest);
      System.out.println("Second largest digit: " + secondLargest);
      input.close();
   }
}
