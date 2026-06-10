import java.util.Scanner;

class StudentMarks2D {
   public static void main(String[] args) {
      Scanner input = new Scanner(System.in);
      System.out.print("Enter number of students: ");
      int numberOfStudents = input.nextInt();
      if (numberOfStudents <= 0) {
         System.err.println("Invalid number.");
         System.exit(0);
      }
      int numberOfSubjects = 3;
      int maxMarksPerSubject = 100;
      int totalMaxMarks = numberOfSubjects * maxMarksPerSubject;
      int[][] marks = new int[numberOfStudents][numberOfSubjects];
      double[] percentages = new double[numberOfStudents];
      char[] grades = new char[numberOfStudents];
      for (int i = 0; i < numberOfStudents; ) {
         System.out.println("Student " + (i + 1));
         for (int j = 0; j < numberOfSubjects; ) {
            System.out.print("Enter marks for subject " + (j + 1) + ": ");
            int studentMarks = input.nextInt();
            if (studentMarks < 0) {
               System.err.println("Invalid marks. Enter positive values.");
               continue;
            }
            marks[i][j] = studentMarks;
            j++;
         }
         i++;
      }
      for (int i = 0; i < marks.length; i++) {
         int sum = 0;
         for (int j = 0; j < marks[i].length; j++) {
            sum += marks[i][j];
         }
         percentages[i] = (sum * 100.0) / totalMaxMarks;
         if (percentages[i] >= 90) {
            grades[i] = 'A';
         } else if (percentages[i] >= 80) {
            grades[i] = 'B';
         } else if (percentages[i] >= 70) {
            grades[i] = 'C';
         } else if (percentages[i] >= 60) {
            grades[i] = 'D';
         } else {
            grades[i] = 'F';
         }
      }
      for (int i = 0; i < numberOfStudents; i++) {
         System.out.println("Student " + (i + 1));
         System.out.println("Physics: " + marks[i][0]);
         System.out.println("Chemistry: " + marks[i][1]);
         System.out.println("Maths: " + marks[i][2]);
         System.out.println("Percentage: " + percentages[i]);
         System.out.println("Grade: " + grades[i]);
      }
      input.close();
   }
}
