/*
Assignment: HW 4, Q3
Name: Samie Kadirova
Email: a.kadirova@tcu.edu
Class-Section: CoSc10403
Overview:
This program calculates the nth Fibonacci number for a given non-negative integer n.
It defines a method called fib(int n) that takes n as a parameter and returns the nth 
Fibonacci number. The program then prompts the user to enter a non-negative integer 
and prints the corresponding Fibonacci number.
*/
import java.util.Scanner; // import the Scanner class
public class Fibonacci {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in); // Create a scanner object to read input
        System.out.println("Enter a non-negative integer n:");
        int n = scan.nextInt(); // Read the user input
        System.out.println("The " + n + "th Fibonacci number is: " + fib(n)); // Calls the methods fib(n) to print the nth Fibonacci number and print the result
    }
    // Method to calculate the nth Fibonacci number
    public static int fib(int n) { 
        // Special case: if n is 1, the Fibonacci number is 1
        if (n == 0)
        return 0;
        if (n == 1)
        return 1;

        int first = 0; // First number in Fibonacci sequence
        int second = 1; // Second number in Fibonacci sequence
        int next = 0; // // Variable to store the next Fibonacci number

        // Loop to calculate Fibonacci numbers from 2 up to n
        for (int i = 2; i <= n; i++) {
            next = first + second; // Sum of the previous two numbers
            first = second; // Update first to previous second
            second = next; // Update second to the new Fibonacci number
        }
        return second; // Return the nth Fibonacci number
    }
}