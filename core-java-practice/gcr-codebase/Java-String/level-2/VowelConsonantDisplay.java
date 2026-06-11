import java.util.Scanner;

class VowelConsonantDisplay {

   public static String getType(char ch) {
      char lower = ch;
      if (ch >= 'A' && ch <= 'Z') {
         lower = (char) (ch + 32);
      }

      if (lower < 'a' || lower > 'z') {
         return "Not a Letter";
      }

      if (lower == 'a' || lower == 'e' || lower == 'i' || lower == 'o' || lower == 'u') {
         return "Vowel";
      }
      return "Consonant";
   }

   public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);

      System.out.print("Enter text: ");
      String text = sc.nextLine();

      System.out.println("------------------------------");
      System.out.printf("%-12s %-18s%n", "Character", "Type");
      System.out.println("------------------------------");

      for (int i = 0; i < text.length(); i++) {
         char ch = text.charAt(i);
         System.out.printf("%-12s %-18s%n", ch, getType(ch));
      }

      System.out.println("------------------------------");
      sc.close();
   }
}
