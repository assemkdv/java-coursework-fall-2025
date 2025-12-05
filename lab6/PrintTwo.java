/*
Assignment: Lab 6_2
Name: Samie Kadirova
Email: a.kadirova@tcu.edu
Class-Section: CoSc10403
Overview:
Use for and while loops to write repeating lines of code.
*/
import java.util.Scanner;
public class PrintTwo {
    public static void main (String[] args) {
        
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter the first integer (A): ");
        int A = scan.nextInt();
        System.out.print("Enter the second integer (B): ");
        int B = scan.nextInt();
        
        if (A < B) { // if B is greater than A, this loop performs and will print out the numbers from A to B, in ascending order
        for (int i = A; i <= B; i++) {
            System.out.print(i + " ");
        }
        System.out.println(); // to go to the next line
    }
        if (A >= B) { // if A is greater than B, this loop performs and will print out the numbers from A to B, in descending order
        for (int j = A; j >= B; j--) { 
            System.out.print(j + " ");
        }
        System.out.println();
    }
    }   
}
