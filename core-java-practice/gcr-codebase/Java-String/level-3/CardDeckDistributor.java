import java.util.Scanner;

class CardDeckDistributor {

   public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);

      System.out.print("Enter number of cards to distribute: ");
      int cardCount = sc.nextInt();
      System.out.print("Enter number of players: ");
      int playerCount = sc.nextInt();

      if (cardCount <= 0 || playerCount <= 0) {
         System.out.println("Error: Number of cards and players must be positive.");
         sc.close();
         return;
      }

      String[] suits = {"Hearts", "Diamonds", "Clubs", "Spades"};
      String[] ranks = {"2", "3", "4", "5", "6", "7", "8", "9", "10",
            "Jack", "Queen", "King", "Ace"};

      String[] deck = new String[52];
      int index = 0;
      for (int i = 0; i < suits.length; i++) {
         for (int j = 0; j < ranks.length; j++) {
            deck[index] = ranks[j] + " of " + suits[i];
            index++;
         }
      }

      for (int i = 0; i < deck.length; i++) {
         int random = i + (int) (Math.random() * (deck.length - i));
         String temp = deck[i];
         deck[i] = deck[random];
         deck[random] = temp;
      }

      if (cardCount > deck.length) {
         System.out.println("Error: Not enough cards in the deck.");
         sc.close();
         return;
      }

      if (cardCount % playerCount != 0) {
         System.out.println("Error: Cards cannot be distributed equally among players.");
         sc.close();
         return;
      }

      int cardsPerPlayer = cardCount / playerCount;
      String[][] players = new String[playerCount][cardsPerPlayer];
      int deckIndex = 0;

      for (int i = 0; i < playerCount; i++) {
         for (int j = 0; j < cardsPerPlayer; j++) {
            players[i][j] = deck[deckIndex];
            deckIndex++;
         }
      }

      for (int i = 0; i < playerCount; i++) {
         System.out.println("Player " + (i + 1) + ":");
         for (int j = 0; j < cardsPerPlayer; j++) {
            System.out.println("  " + players[i][j]);
         }
      }

      sc.close();
   }
}
