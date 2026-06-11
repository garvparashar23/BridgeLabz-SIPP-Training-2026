import java.util.Scanner;

class RockPaperScissors {

   public static String getComputerChoice() {
      int num = (int) (Math.random() * 3);
      if (num == 0) {
         return "rock";
      }
      if (num == 1) {
         return "paper";
      }
      return "scissors";
   }

   public static String getWinner(String user, String computer) {
      if (user.equals(computer)) {
         return "Draw";
      }
      if (user.equals("rock") && computer.equals("scissors")) {
         return "User";
      }
      if (user.equals("paper") && computer.equals("rock")) {
         return "User";
      }
      if (user.equals("scissors") && computer.equals("paper")) {
         return "User";
      }
      return "Computer";
   }

   public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);

      System.out.print("Enter number of games: ");
      int games = sc.nextInt();

      if (games <= 0) {
         System.out.println("Invalid number of games.");
         sc.close();
         return;
      }

      String[][] results = new String[games][3];
      int userWins = 0;
      int computerWins = 0;
      int draws = 0;

      for (int i = 0; i < games; i++) {
         System.out.print("Enter your choice (rock/paper/scissors) for game " + (i + 1) + ": ");
         String user = sc.next().toLowerCase();

         if (!user.equals("rock") && !user.equals("paper") && !user.equals("scissors")) {
            System.out.println("Invalid choice. Using rock.");
            user = "rock";
         }

         String computer = getComputerChoice();
         String winner = getWinner(user, computer);

         results[i][0] = user;
         results[i][1] = computer;
         results[i][2] = winner;

         if (winner.equals("User")) {
            userWins++;
         } else if (winner.equals("Computer")) {
            computerWins++;
         } else {
            draws++;
         }
      }

      System.out.println("---------------------------------------------------------------");
      System.out.printf("%-8s %-12s %-14s %-10s%n", "Game", "User", "Computer", "Winner");
      System.out.println("---------------------------------------------------------------");

      for (int i = 0; i < games; i++) {
         System.out.printf("%-8d %-12s %-14s %-10s%n",
               i + 1, results[i][0], results[i][1], results[i][2]);
      }

      System.out.println("---------------------------------------------------------------");
      System.out.println("\nWin Statistics");
      System.out.println("---------------------------------------------------------------");
      System.out.printf("%-15s %-8s %-10s %-12s%n", "Category", "Count", "Average", "Percentage");
      System.out.println("---------------------------------------------------------------");

      double userAvg = Math.round((userWins * 100.0 / games)) / 100.0;
      double userPct = Math.round((userWins * 10000.0 / games)) / 100.0;
      double compAvg = Math.round((computerWins * 100.0 / games)) / 100.0;
      double compPct = Math.round((computerWins * 10000.0 / games)) / 100.0;
      double drawAvg = Math.round((draws * 100.0 / games)) / 100.0;
      double drawPct = Math.round((draws * 10000.0 / games)) / 100.0;

      System.out.printf("%-15s %-8d %-10.2f %-11.2f%%%n", "User Wins", userWins, userAvg, userPct);
      System.out.printf("%-15s %-8d %-10.2f %-11.2f%%%n", "Computer Wins", computerWins, compAvg, compPct);
      System.out.printf("%-15s %-8d %-10.2f %-11.2f%%%n", "Draws", draws, drawAvg, drawPct);
      System.out.println("---------------------------------------------------------------");

      sc.close();
   }
}
