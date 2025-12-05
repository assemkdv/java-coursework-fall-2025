/*
Assignment: Lab 4_1
Name: Samie Kadirova
Email: a.kadirova@tcu.edu
Class-Section: CoSc10403
Overview:
The purpose of this lab is to practice using conditional statements (if-else) in Java and to handle input/output operations using the Scanner class. 
I wrote a program that evaluates an integer against three different conditions and prints specific outputs based on these evaluations.

Task:
My program evaluates the input integer for the following conditions and print results based on each condition:
Condition 1: Positive or Negative
If the integer is positive, print "YES". If the integer is zero or negative, print "NO".
Condition 2: Odd or Even
If the integer is odd, print "YES". If the integer is even, print "NO".
Condition 3: Last Digit Equals 7
If the last digit of the integer is 7, print "YES". Otherwise, print "NO".
*/
import java.util.Scanner; // to use the Scanner class
public class Lab_4_1 {
    public static void main (String[] args) {
        int number; // declaring an integer number
        Scanner scan = new Scanner(System.in); 
        System.out.print("Please enter an integer to evaluate: ");
        number = scan.nextInt();
        if (number > 0) {  // condition to check if the number is positive
            System.out.println(number + " is a Positive Number");
        }
        else { // if the above condition is false, print out saying that it is a negative value
            System.out.println(number + " is NOT a Positive Number");
        }

        if (number % 2 == 0) { // condition to check if it is an even number
            System.out.println(number + " is NOT an ODD Number");
        }
        else { // if the above condition is false, print out saying that it is an odd number
            System.out.println(number + " is an ODD Number");
        }

        if (Math.abs(number) % 10 == 7) { // condition to check if the last digit is equal to 0 (to find the last digit of a value, it does not matter if the value is negative or positive, so we will just take the absolute)
            System.out.println("Yes, last digit is 7 in: " + number);
        }
        else { // if the above condition is false, print out saying that the last digit is not 7
            System.out.println("No, last digit is not 7 in: " + number);
        }
    }
}