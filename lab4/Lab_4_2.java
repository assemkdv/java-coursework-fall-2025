/*
Assignment: Lab 4_1
Name: Samie Kadirova
Email: a.kadirova@tcu.edu
Class-Section: CoSc10403
Overview:
The purpose of this lab is to practice using conditional statements (if-else) in Java and to handle input/output operations using the Scanner class. 
I wrote a program that evaluates an integer against three different conditions and prints specific outputs based on these evaluations.

Task:
I wrote a Java program that takes three integer inputs from the user and prints the smallest and largest of the three numbers. 
*/
import java.util.Scanner; // to use the Scanner class
public class Lab_4_2 {
    public static void main (String[] args) {
        int number1, number2, number3; // declararion of integer numbers
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter three integers: ");
        number1 = scan.nextInt(); 
        number2 = scan.nextInt();
        number3 = scan.nextInt();

        if (number1 < number2 && number1 < number3) { // condition to check if number1 is the minimum
            System.out.println("The minimum number is: " + number1);
        }
        else if (number2 < number1 && number2 < number3) { // condition to check if number 2 is the minimum
            System.out.println("The minimum number is: " + number2);
        }
        else { // if the above conditions are false, print out that the number3 is the minimum
            System.out.println("The minimum number is: " + number3);
        }

        if (number1 > number2 && number1 > number3) { // condition to check if number1 is the maximum
            System.out.println("The maximum number is: " + number2);
        }
        else if (number2 > number1 && number2 > number3) { // condition to check if number2 is the maximum
            System.out.println("The maximum number is: " + number2);
        }
        else { // if the above conditions are false, print out that the number3 is the maximum
            System.out.println("The maximum number is: " + number3);
        }
    }
}