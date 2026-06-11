import java.util.Scanner;

class TrimSpacesCompare {

   public static String trimText(String text) {
      int start = 0;
      int end = text.length() - 1;

      while (start <= end && text.charAt(start) == ' ') {
         start++;
      }
      while (end >= start && text.charAt(end) == ' ') {
         end--;
      }

      String result = "";
      for (int i = start; i <= end; i++) {
         result = result + text.charAt(i);
      }
      return result;
   }

   public static boolean areEqual(String a, String b) {
      if (a.length() != b.length()) {
         return false;
      }
      for (int i = 0; i < a.length(); i++) {
         if (a.charAt(i) != b.charAt(i)) {
            return false;
         }
      }
      return true;
   }

   public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);

      System.out.print("Enter text with leading/trailing spaces: ");
      String text = sc.nextLine();

      String myTrim = trimText(text);
      String builtInTrim = text.trim();

      System.out.println("Original text: \"" + text + "\"");
      System.out.println("User-defined trimmed text: \"" + myTrim + "\"");
      System.out.println("Built-in trimmed text: \"" + builtInTrim + "\"");
      System.out.println("Both results are equal: " + areEqual(myTrim, builtInTrim));

      sc.close();
   }
}
