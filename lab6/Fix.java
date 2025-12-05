/*
Assignment: Lab 6_3
Name: Samie Kadirova
Email: a.kadirova@tcu.edu
Class-Section: CoSc10403
Overview:
Use for and while loops to write repeating lines of code.
*/
import java.util.Scanner;
public class Fix {
    public static void main (String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter a positive integer (n): ");
        int n = scan.nextInt();

        int sum = 0;
        for (int i = 1; i <= n; i++) {
            if (i % 2 == 0) {
                sum = sum + i; // takes the sum of the even numbers from 1 to n and stores it in variable sum. with each iteration, the value if replaced
            }
        }
        System.out.println("The sum of even numbers from 1 to " + n + " is: " + sum); // prints out the sum of the even numbers from 1 to n

    }
}
