import java.util.Scanner;

class StudentVotingEligibility {

   public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);
      int total = 10;
      int[] ages = new int[total];

      System.out.println("Enter age of " + total + " students:");
      for (int i = 0; i < total; i++) {
         System.out.print("Student " + (i + 1) + " age: ");
         ages[i] = sc.nextInt();
      }

      System.out.println("-----------------------------");
      System.out.printf("%-10s %-10s %-15s%n", "Student", "Age", "Can Vote");
      System.out.println("-----------------------------");

      for (int i = 0; i < total; i++) {
         String canVote;
         if (ages[i] < 0) {
            canVote = "false";
         } else if (ages[i] >= 18) {
            canVote = "true";
         } else {
            canVote = "false";
         }
         System.out.printf("%-10d %-10d %-15s%n", i + 1, ages[i], canVote);
      }

      System.out.println("-----------------------------");
      sc.close();
   }
}
