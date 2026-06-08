public class PenDistribution {
    public static void main(String[] args) {
        // Create variables for total number of pens and total number of students
        int totalPens = 14;
        int totalStudents = 3;
        
        // Calculate the number of pens each student will get using integer division
        int pensPerStudent = totalPens / totalStudents;
        
        // Calculate the remaining pens that cannot be distributed equally using modulus operator
        int remainingPens = totalPens % totalStudents;
        
        // Print the result matching the output format: The Pen Per Student is ___ and the remaining pen not distributed is ___
        System.out.println("The Pen Per Student is " + pensPerStudent + " and the remaining pen not distributed is " + remainingPens);
    }
}
