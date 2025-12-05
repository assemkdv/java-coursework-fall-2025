/*
Assignment: HW 4, Q2
Name: Samie Kadirova
Email: a.kadirova@tcu.edu
Class-Section: CoSc10403
Overview:
This program prompts the user to enter a score between 1 and 100.
It checks if the score is within the valid range. If it is not, 
the program displays an error message and exits. 
If the score is valid, the program calls the method gradeCalculation() 
to determine and return the letter grade based on the score, 
then prints the result to the screen.
*/
import java.util.Scanner; // Import Scanner class to read input from user
public class mygrade {
    public static void main(String[] args) {
        int score;
        Scanner scan = new Scanner(System.in); // Create Scanner object to read input
        System.out.println("Enter a score between 1 and 100:");
        score = scan.nextInt(); // Read score from the user
        if (score > 100 || score < 0) { // Check if score is out of valid range
            System.out.println("Error: Score is out of range.");
        }
        else { 
        System.out.println(gradecalculation(score)); // Call method to calculate grade and print it
        }
    }
    public static String gradecalculation(int score) {
        
        // This method takes a score as input
        // Determines the letter grade based on the score
        // Returns the grade as a string

        String grade;

        if (score >= 90) { // Score 90-100 -> Grade A
            grade = "A";
        }
        else if (score >= 80) { // Score 80-89 -> Grade B
            grade = "B";
        }
        else if (score >= 70) { // Score 70-79 -> Grade C
            grade = "C";
        }
        else if (score >= 60) { // Score 60-69 -> Grade D
            grade = "D";
        }
        else {
            grade = "F"; // Score below 60 -> Grade F
        }
        return "The grade is: " + grade; // Return the result string
    }
}