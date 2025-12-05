/* 
Assignment: Lab 8 Task 2
Name: Samie Kadirova 
Email: a.kadirova@tcu.edu 
Class-Section: COSC 10403 
Overview: The purpose of this lab is to practice writing and calling methods in Java. 
This program (digitSum.java) contains a method named digitSum that accepts an integer 
as a parameter and returns the sum of the digits of that integer. The main program takes 
an integer input from the user and prints out the sum of the digits of the user-provided number. 
*/

import java.util.Scanner;

public class digisum {
   
   // Method that accepts an integer and returns the sum of its digits
   public static int digitSum(int number) {
      int sum = 0;
      // Handle negative numbers by converting to positive
      number = Math.abs(number);
      
      // Extract and sum each digit
      while (number > 0) {
         sum += number % 10;  // Get the last digit
         number = number / 10; // Remove the last digit
      }
      
      return sum;
   }
   
   public static void main(String[] args) {
      Scanner scnr = new Scanner(System.in);
      
      System.out.print("Enter an integer: ");
      int userInput = scnr.nextInt();
      
      int result = digitSum(userInput);
      
      System.out.println("Digit sum: " + result);
   }
}