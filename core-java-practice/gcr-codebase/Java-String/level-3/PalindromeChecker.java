import java.util.Scanner;

class PalindromeChecker {

   public static boolean checkIterative(String text) {
      int start = 0;
      int end = text.length() - 1;
      while (start < end) {
         if (text.charAt(start) != text.charAt(end)) {
            return false;
         }
         start++;
         end--;
      }
      return true;
   }

   public static boolean checkRecursive(String text, int start, int end) {
      if (start >= end) {
         return true;
      }
      if (text.charAt(start) != text.charAt(end)) {
         return false;
      }
      return checkRecursive(text, start + 1, end - 1);
   }

   public static boolean checkUsingArray(String text) {
      char[] original = text.toCharArray();
      char[] reversed = new char[text.length()];

      for (int i = 0; i < text.length(); i++) {
         reversed[i] = text.charAt(text.length() - 1 - i);
      }

      for (int i = 0; i < original.length; i++) {
         if (original[i] != reversed[i]) {
            return false;
         }
      }
      return true;
   }

   public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);

      System.out.print("Enter text: ");
      String text = sc.nextLine();

      System.out.println("Iterative palindrome check: " + checkIterative(text));
      System.out.println("Recursive palindrome check: " + checkRecursive(text, 0, text.length() - 1));
      System.out.println("Array-based palindrome check: " + checkUsingArray(text));

      sc.close();
   }
}
