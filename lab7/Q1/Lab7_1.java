/*
Assignment: Lab 7_1
Name: Samie Kadirova
Email: a.kadirova@tcu.edu
Class-Section: COSC 10403
Overview:
The purpose of this lab is to practice writing and calling methods in Java.
In this assignment, the program reads four real numbers representing Cartesian coordinates
of two points: (x1, y1) and (x2, y2). It then calculates and prints the distance between
these two points using a custom method named distance(x1, y1, x2, y2).
The method uses the distance formula: 
distance = √((x2 - x1)² + (y2 - y1)²)
*/
import java.util.Scanner;
public class Lab7_1 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        // Prompt user for coordinates of the first point
        System.out.println("Enter x1:");
        int x1 = scan.nextInt(); // Read x1 value
        System.out.println("Enter y1:");
        int y1 = scan.nextInt(); // Read y1 value
        // Prompt user for coordinates of the second point
        System.out.println("Enter x2:");
        int x2 = scan.nextInt(); // Read x2 value
        System.out.println("Enter y2:");
        int y2 = scan.nextInt(); // Read y2 value
        // Call the distance method and display the result
        System.out.print("The distance between the points is: " + distance(x1, y1, x2, y2));
        System.out.println();
    }

    // Calculates the distance between two points (x1, y1) and (x2, y2)
    // using the formula √((x2 - x1)² + (y2 - y1)²)
    public static double distance (int x1, int y1, int x2, int y2) {
         // Use Math.sqrt() and Math.pow() to apply the distance formula
        return Math.sqrt(Math.pow((x2 - x1), 2) + Math.pow((y2 - y1), 2));
    }
}
