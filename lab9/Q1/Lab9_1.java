/*
Assignment: Lab 9_1
Name: Samie Kadirova
Email: a.kadirova@tcu.edu
Class-Section: COSC 10403
Overview:
This program allows the user to enter a series of integers,
stores them in an array, and then prints the integers in both
forward and backward order.
*/

import java.util.Scanner;
public class Lab9_1 {

    public static void main(String[] args) {
        // Create a Scanner object to read user input
        Scanner scanner = new Scanner(System.in);
        
        // Prompt the user to enter the number of integers they want to input
        System.out.print("Enter the number of integers you want to input: ");
        int numberOfIntegers = scanner.nextInt();
        
        // Create an array of the appropriate size based on user input
        int[] integerArray = new int[numberOfIntegers];
        
        // Prompt the user to enter each integer
        System.out.println("Enter the integers: ");
        
        // Loop through the array to get each integer from the user
        for (int i = 0; i < numberOfIntegers; i++) {
            System.out.print("Integer " + (i + 1) + ": ");
            integerArray[i] = scanner.nextInt();
        }
        
        // Display integers in forward order
        System.out.print("Integers in forward order: ");
        for (int i = 0; i < numberOfIntegers; i++) {
            System.out.print(integerArray[i]);
            // Add a space after each integer except the last one
            if (i < numberOfIntegers - 1) {
                System.out.print(" ");
            }
        }
        System.out.println(); // Move to next line
        
        // Display integers in backward order
        System.out.print("Integers in backward order: ");
        for (int i = numberOfIntegers - 1; i >= 0; i--) {
            System.out.print(integerArray[i]);
            // Add a space after each integer except the last one
            if (i > 0) {
                System.out.print(" ");
            }
        }
        System.out.println(); // Move to next line
    }
}
