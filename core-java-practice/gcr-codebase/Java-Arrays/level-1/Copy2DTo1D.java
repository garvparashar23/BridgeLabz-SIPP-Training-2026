import java.util.Scanner;

class Copy2DTo1D {
   public static void main(String[] args) {
      Scanner input = new Scanner(System.in);
      System.out.print("Enter number of rows: ");
      int rows = input.nextInt();
      System.out.print("Enter number of columns: ");
      int columns = input.nextInt();
      if (rows <= 0 || columns <= 0) {
         System.err.println("Invalid dimensions.");
         System.exit(0);
      }
      int[][] matrix = new int[rows][columns];
      System.out.println("Enter matrix elements:");
      for (int i = 0; i < rows; i++) {
         for (int j = 0; j < columns; j++) {
            matrix[i][j] = input.nextInt();
         }
      }
      int[] array = new int[rows * columns];
      int index = 0;
      for (int i = 0; i < rows; i++) {
         for (int j = 0; j < columns; j++) {
            array[index] = matrix[i][j];
            index++;
         }
      }
      System.out.println("1D Array elements:");
      for (int i = 0; i < array.length; i++) {
         System.out.print(array[i] + " ");
      }
      input.close();
   }
}
