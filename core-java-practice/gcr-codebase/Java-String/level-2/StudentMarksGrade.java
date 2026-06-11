import java.util.Scanner;

class StudentMarksGrade {

   public static String getGrade(double percent) {
      if (percent >= 80) {
         return "A";
      }
      if (percent >= 70) {
         return "B";
      }
      if (percent >= 60) {
         return "C";
      }
      if (percent >= 50) {
         return "D";
      }
      if (percent >= 40) {
         return "E";
      }
      return "R";
   }

   public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);

      System.out.print("Enter number of students: ");
      int count = sc.nextInt();

      if (count <= 0) {
         System.out.println("Invalid number of students.");
         sc.close();
         return;
      }

      int[][] marks = new int[count][3];

      for (int i = 0; i < count; i++) {
         for (int j = 0; j < 3; j++) {
            marks[i][j] = 10 + (int) (Math.random() * 90);
         }
      }

      System.out.println("-----------------------------------------------------------------------");
      System.out.printf("%-10s %-10s %-10s %-10s %-8s %-12s %-8s %-6s%n",
            "Student", "Physics", "Chemistry", "Maths", "Total", "Average", "Percent", "Grade");
      System.out.println("-----------------------------------------------------------------------");

      for (int i = 0; i < count; i++) {
         int physics = marks[i][0];
         int chemistry = marks[i][1];
         int maths = marks[i][2];
         int total = physics + chemistry + maths;
         double average = Math.round((total / 3.0) * 100.0) / 100.0;
         double percent = Math.round((total * 100.0 / 300.0) * 100.0) / 100.0;
         String grade = getGrade(percent);

         System.out.printf("%-10d %-10d %-10d %-10d %-8d %-12.2f %-8.2f %-6s%n",
               i + 1, physics, chemistry, maths, total, average, percent, grade);
      }

      System.out.println("-----------------------------------------------------------------------");
      sc.close();
   }
}
