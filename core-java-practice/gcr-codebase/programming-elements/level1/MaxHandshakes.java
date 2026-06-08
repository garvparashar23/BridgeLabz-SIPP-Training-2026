import java.util.Scanner;

public class MaxHandshakes {
    public static void main(String[] args) {
        // Create Scanner Object to take inputs
        Scanner input = new Scanner(System.in);
        
        // Prompt user to enter the number of students
        System.out.print("Enter the number of students: ");
        int numberOfStudents = input.nextInt();
        
        // Calculate max handshakes: (n * (n - 1)) / 2
        int maxHandshakes = (numberOfStudents * (numberOfStudents - 1)) / 2;
        
        // Print the result
        System.out.println("The maximum number of possible handshakes among " + numberOfStudents + " students is " + maxHandshakes);
        
        // Close the scanner
        input.close();
    }
}
