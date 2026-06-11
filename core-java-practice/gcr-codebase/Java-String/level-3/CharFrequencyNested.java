import java.util.Scanner;

class CharFrequencyNested {

   public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);

      System.out.print("Enter text: ");
      String text = sc.nextLine();

      char[] chars = text.toCharArray();
      int[] count = new int[chars.length];

      for (int i = 0; i < chars.length; i++) {
         if (chars[i] == '0') {
            continue;
         }
         count[i] = 1;
         for (int j = i + 1; j < chars.length; j++) {
            if (chars[i] == chars[j]) {
               count[i]++;
               chars[j] = '0';
            }
         }
      }

      System.out.println("-------------------------");
      System.out.printf("%-12s %-12s%n", "Character", "Frequency");
      System.out.println("-------------------------");

      for (int i = 0; i < chars.length; i++) {
         if (chars[i] != '0') {
            System.out.printf("%-12s %-12d%n", chars[i], count[i]);
         }
      }

      System.out.println("-------------------------");
      sc.close();
   }
}
