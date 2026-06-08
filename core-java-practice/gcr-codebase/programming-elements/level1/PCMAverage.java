public class PCMAverage {
    public static void main(String[] args) {
        // Create variables for marks scored in Maths, Physics, and Chemistry out of 100
        double mathsMark = 94.0;
        double physicsMark = 95.0;
        double chemistryMark = 96.0;
        
        // Create a variable to hold the total number of subjects
        int numberOfSubjects = 3;
        
        // Calculate the total marks scored in PCM
        double totalMarksScored = mathsMark + physicsMark + chemistryMark;
        
        // Calculate the average percent mark in PCM
        double averagePercentMark = totalMarksScored / numberOfSubjects;
        
        // Print the result matching the output format: Sam’s average mark in PCM is ___
        System.out.println("Sam’s average mark in PCM is " + averagePercentMark);
    }
}
