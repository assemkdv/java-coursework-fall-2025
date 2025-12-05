/*
Assignment: Lab 8 Task 1
Name: Samie Kadirova
Email: a.kadirova@tcu.edu
Class-Section: COSC 10403
Overview:
The purpose of this lab is to practice writing and calling methods in Java.
Given the main program (TurtleAge.java), this Turtle class is completed with methods to set 
and get the shell strength of a turtle and to output the turtle's information. The class 
stores the turtle's age and shell strength, calculates the current shell strength based on 
age using a decay formula, and displays all turtle information.
*/

// Turtle class that represents a turtle with age and shell strength properties
public class Turtle {
   // Private instance variable to store the turtle's age
   private int age;
   
   // Instance variables to store shell strength values
   // shellStrength: the original shell strength value
   // currentShellStrength: the calculated current shell strength after age decay
   int shellStrength, currentShellStrength;

  
   // Method to set the turtle's age
   public void setAge(int newAge) {
      age = newAge;  
   }

   // Method to get the turtle's age
   public int getAge() {
      return age;
   }

   // Method to set the turtle's shell strength
   public void setShellStrength(int newShellStrength) {
      shellStrength = newShellStrength;
   }

   // Method to get the turtle's shell strength
   public int getShellStrength() {
      return shellStrength;
   }

   // Method to calculate current shell strength
   public void calcShellStrength() {
      double strengthDecreaseRate = 0.05;
      int turtleAge = age;

      // Shell strength calculation formula
      currentShellStrength = (int) Math.round(shellStrength * Math.pow((1 - strengthDecreaseRate), turtleAge));
   }

   // Method to output turtle's information
   public void printInfo() {
      System.out.println("Turtle Information:");
      System.out.println("Age: " + age);
      System.out.println("Original Shell Strength: " + shellStrength);
      System.out.println("Current Shell Strength: " + currentShellStrength);
   }
}