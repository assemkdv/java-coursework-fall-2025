import java.util.Scanner;
/*
Assignment: Lab 3_2
Name: Samie Kadirova
Email: a.kadirova@tcu.edu
Class-Section: CoSc10403
Overview:
The purpose of this lab is to practice using Operators in Java and to handle input/output operations using the Scanner class. 
In this assignment, write a Java program that takes a three-digit integer as input and calculates the sum of its digits. The program should be able to handle both positive and negative three-digit numbers.
*/
public class Lab3_2 {
    public static void main (String[] args) {
        Scanner scan = new Scanner(System.in);
        int ThreeDigitNumber;
        System.out.println("Enter a three-digit number: ");
        ThreeDigitNumber = Math.abs(scan.nextInt());
        int firstDigit = ThreeDigitNumber / 100;
        int secondDigit = (ThreeDigitNumber % 100) / 10;
        int thirdDigit = ThreeDigitNumber % 10;
        int sumOfDigits = firstDigit + secondDigit + thirdDigit;
        System.out.println("Sum of digits: " + sumOfDigits);


    }
}