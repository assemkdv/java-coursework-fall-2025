/*
Assignment: Lab 7_2
Name: Samie Kadirova
Email: a.kadirova@tcu.edu
Class-Section: CoSc10403
Overview:
The purpose of this lab is to practice writing and using methods in Java.
In this assignment, the program prompts the user to enter a positive real number (base) 
and an integer (exponent). It then calculates the result of raising the base to the 
given exponent using a custom power(a, n) method. The method performs the calculation 
manually with loops instead of using the Math.pow() function from the Java standard library.
import java.util.Scanner;
*/
import java.util.Scanner;
public class Lab7_2 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the base (a positive real number):");
        double base = scan.nextDouble();
        System.out.println("Enter the exponent (an integer):");
        int exponent = scan.nextInt();
        System.out.println("The result of " + base + " raised to the power of " + exponent + " is: " + power(base, exponent));
    }
    public static double power(double a, int n) {
        double result = 1; // Initialize result to 1 (since any number to power 0 is 1)

        // If exponent is positive, multiply 'a' n times
        if (n > 0) {
            for (int i = 1; i <= n; i++) {
                result *= a;
            }
        }
        // If exponent is negative, compute reciprocal (1 / a^|n|)
        else if (n < 0) {
            for (int i = 1; i <= -n; i++) {
                result *= a;
            }
            result = 1 / result;
        }
        // If exponent is zero, result remains 1
        return result; // Return the computed value
    }
}
