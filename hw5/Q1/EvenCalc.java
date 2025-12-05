/*
 * Assignment: HW 5 Q2
 * Name: Samie Kadirova
 * Email: a.kadirova@tcu.edu
 * Class-Section: CoSc10403
 * 
 * Overview:
 * This program calculates the percentage of even numbers in an array.
 * The program prompts the user to enter the size of an array and its elements,
 * then calculates and displays the percentage of even numbers in that array.
 * The program uses a do-while loop to allow the user to calculate percentages
 * for multiple arrays until they choose to exit.
 */

import java.util.Scanner;

public class EvenCalc {

    
     // Method to calculate the percentage of even numbers in the array
     // return the percentage of even numbers in the array (0.0 if array is empty)
    
    public static double percentEven(int[] nums) {
        // Handle edge case: empty array returns 0.0
        if (nums.length == 0) {
            return 0.0;
        }
        
        // Counter to track the number of even numbers found
        int evenCount = 0;
        
        // Iterate through each element in the array
        for (int i = 0; i < nums.length; i++) {
            // Check if the current element is even (divisible by 2)
            if (nums[i] % 2 == 0) {
                evenCount++; // Increment counter if number is even
            }
        }
        
        // Use floating point division to get accurate percentage
        // Cast evenCount to double to ensure decimal precision in division
        return ((double) evenCount / nums.length) * 100;
    }
    
    // Main method that runs the Even Percentage Calculator program
    public static void main(String[] args) {
        // Create Scanner object to read user input
        Scanner scan = new Scanner(System.in);
        String continueChoice; // Variable to store user's choice to continue or exit
        
        // Do-while loop to allow multiple calculations
        do {
            // Prompt user for the size of the array
            System.out.print("Enter the number of elements in the array: ");
            int numElements = scan.nextInt();
            
            // Create array of specified size
            int[] array = new int[numElements];
            
            // Read elements into the array
            if (numElements > 0) {
                System.out.println("Enter the elements of the array: ");
                // Loop to read each element from user input
                for (int i = 0; i < numElements; i++) {
                    System.out.print("Element " + (i + 1) + ": ");
                    array[i] = scan.nextInt();
                }
            }
            
            // Calculate and display percentage by calling percentEven method
            double percentage = percentEven(array);
            System.out.printf("Percentage of even numbers: %.2f%%\n", percentage);
            
            // Ask if user wants to continue with another array
            System.out.print("Would you like to enter a new array? (yes/no): ");
            continueChoice = scan.next();
            
        } while (continueChoice.equalsIgnoreCase("yes")); // Continue loop if user enters "yes"
        
        // Display thank you message when user chooses to exit
        System.out.println("Thank you for using the Even Percentage Calculator!");
    }
}
