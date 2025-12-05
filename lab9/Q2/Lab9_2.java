/*
Assignment: Lab 9_2
Name: Samie Kadirova
Email: a.kadirova@tcu.edu
Class-Section: COSC 10403
Overview:
This program prompts the user to enter the number of elements in an array,
takes double values as input, and calculates and displays the sum, minimum,
and maximum values in the array.
*/

import java.util.Scanner;
public class Lab9_2 {
    public static void main(String[] args) {
        // Create a Scanner object to read user input
        Scanner scanner = new Scanner(System.in);
        
        // Prompt the user to enter the number of elements
        int numberOfElements;
        do {
            System.out.print("Enter the number of elements in the array (positive integer): ");
            numberOfElements = scanner.nextInt();
            
            // Validate input - must be greater than 0
            if (numberOfElements <= 0) {
                System.out.println("Please enter a positive number greater than zero.");
            }
        } while (numberOfElements <= 0);
        
        // Create an array of doubles with the specified size
        double[] array = new double[numberOfElements];
        
        // Prompt the user to enter each element
        System.out.println("Enter " + numberOfElements + " elements (can be positive or negative):");
        
        // Loop through the array to get each element from the user
        for (int i = 0; i < numberOfElements; i++) {
            System.out.print("Element " + (i + 1) + ": ");
            array[i] = scanner.nextDouble();
        }
        
        // Calculate the sum, minimum, and maximum values
        double sum = 0.0;
        double min = array[0];
        double max = array[0];
        
        for (int i = 0; i < numberOfElements; i++) {
            sum += array[i];
            
            if (array[i] < min) {
                min = array[i];
            }
            
            if (array[i] > max) {
                max = array[i];
            }
        }
        
        // Display the results
        System.out.println();
        System.out.println("Sum of all elements: " + String.format("%.1f", sum));
        System.out.println("Minimum value: " + min);
        System.out.println("Maximum value: " + max);
        System.out.println();
    }
}
