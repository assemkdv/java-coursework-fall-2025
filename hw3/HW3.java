/*
Assignment: HW 3, Q10
Name: Samie Kadirova
Email: a.kadirova@tcu.edu
Class-Section: CoSc10403
Overview:
This program displays a menu that lets the user create different screen art patterns 
(rectangle, reverse triangle, or reverse stair step) using loops, and repeats until the user exits.
*/
import java.util.Scanner;

public class HW3 {
    public static void main (String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Screen Art Program");
        System.out.println("Enter 1 to print rectangular pattern");
        System.out.println("Enter 2 to print reverse triangular pattern");
        System.out.println("Enter 3 to print reverse stair step pattern");
        System.out.println("Enter -1 to exit program");
        System.out.println("Your choice:");
    
        int number;
        number = scan.nextInt();

        if (number == 1) {
            int rows, columns;
            System.out.println("\nRectangular pattern selected\n");
            System.out.println("How many rows?");
            rows = scan.nextInt();
            System.out.println("\nHow many columns?");
            columns = scan.nextInt();
            System.out.println();

            for (int i = 1; i <= rows; i++) {
                for (int j = 1; j <= columns; j++) {
                    System.out.print("* ");
                }
                System.out.println();
            }
        }

        else if (number == 2) {
            int top;
            System.out.println("\nReverse triangular pattern selected\n");
            System.out.println("Size of Top?");
            top = scan.nextInt();
            System.out.println();

            for (int i = 1; i <= top; i++) {
                for (int j = i; j <= top; j++) {
                    System.out.print("* ");
                }
                System.out.println();

            }
        }

        else if (number == 3) {
            int steps;
            System.out.println("\nReverse stair step pattern selected\n");
            System.out.println("Number of steps");
            steps = scan.nextInt();
            System.out.println();

            for (int i = 1; i <= steps; i++) {
                for (int j = i; j <= (steps - 1); j++) {
                    System.out.print(" ");
                }
                System.out.print("#\n");
            
            }
        }

        else if (number == -1) {
            System.out.println("\nThank you for playing!");
        }

        else {
            System.out.println("\nInvalid choice. Please try again.");
        }
    }
}