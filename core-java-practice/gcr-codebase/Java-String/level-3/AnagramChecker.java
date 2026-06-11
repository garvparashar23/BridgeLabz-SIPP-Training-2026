import java.util.Scanner;

class AnagramChecker {

   public static boolean areAnagrams(String first, String second) {
      if (first.length() != second.length()) {
         return false;
      }

      int[] count1 = new int[256];
      int[] count2 = new int[256];

      for (int i = 0; i < first.length(); i++) {
         count1[first.charAt(i)]++;
         count2[second.charAt(i)]++;
      }

      for (int i = 0; i < 256; i++) {
         if (count1[i] != count2[i]) {
            return false;
         }
      }
      return true;
   }

   public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);

      System.out.print("Enter first text: ");
      String first = sc.nextLine();
      System.out.print("Enter second text: ");
      String second = sc.nextLine();

      boolean result = areAnagrams(first, second);
      System.out.println("\"" + first + "\" and \"" + second + "\" are anagrams: " + result);

      sc.close();
   }
}
