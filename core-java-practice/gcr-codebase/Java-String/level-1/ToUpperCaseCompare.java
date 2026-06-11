import java.util.Scanner;

class ToUpperCaseCompare {

   public static String toUpperCase(String text) {
      String result = "";
      for (int i = 0; i < text.length(); i++) {
         char ch = text.charAt(i);
         if (ch >= 'a' && ch <= 'z') {
            result = result + (char) (ch - 32);
         } else {
            result = result + ch;
         }
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

      System.out.print("Enter text: ");
      String text = sc.nextLine();

      String myUpper = toUpperCase(text);
      String builtInUpper = text.toUpperCase();

      System.out.println("User-defined uppercase: " + myUpper);
      System.out.println("Built-in uppercase: " + builtInUpper);
      System.out.println("Both results are equal: " + areEqual(myUpper, builtInUpper));

      sc.close();
   }
}
