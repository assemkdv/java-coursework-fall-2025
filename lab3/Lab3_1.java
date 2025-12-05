import java.util.Scanner;
/*
Assignment: Lab 3_1
Name: Samie Kadirova
Email: a.kadirova@tcu.edu
Class-Section: CoSc10403
Overview:
The purpose of this lab is to practice using Operators in Java and to handle input/output operations using the Scanner class. 
In this assignment, I wrote a Java program that performs the following tasks:
•	Given an integer, prints its last digit.
•	For the same integer, prints its last two digits.
*/
public class Lab3_1 {
    public static void main (String[] args) {
        Scanner scan = new Scanner(System.in);
        int x;
        System.out.print("Enter an integer: ");
        x = scan.nextInt();
        if (x >= 10) {
            System.out.println("Last digit: " + (x % 10));
            System.out.println("Last two digits: " + (x % 100));
        }
        
        else if (x > 0 && x < 10) {
            System.out.println("Last digit: " + x);
            System.out.println("Last two digits: 0" + x);
        }

        else if (x > -10 && x < 0) {
            System.out.println("Last digit: " + Math.abs(x));
            System.out.println("Last two digits: 0" + Math.abs(x));
        }
        
        else {
            System.out.println("Last digit: " + (Math.abs(x) % 10));
            System.out.println("Last two digits: " + (Math.abs(x) % 100));
        }
         
    }
}
