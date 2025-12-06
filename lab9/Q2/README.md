# Array Calculations (Sum, Min, Max)

---

## Overview
This program prompts the user to enter the number of elements in an array, then reads that many double values from the user.  
After storing all values in the array, the program calculates and displays:

- The sum of all elements  
- The minimum value  
- The maximum value  

The program includes input validation to ensure the user enters a positive integer greater than zero.  
It also correctly handles arrays containing both positive and negative numbers.

---

## Objectives
- Practice working with arrays in Java  
- Collect user input using Scanner  
- Use loops to compute sum, minimum, and maximum  
- Handle input validation for array size  
- Work with double values (including negative values)

---

## Sample Output

```text

Enter the number of elements in the array (positive integer): 5
Enter 5 elements (can be positive or negative):
Element 1: 2.5
Element 2: -4.3
Element 3: 6.7
Element 4: -1.8
Element 5: 3.1

Sum of all elements: 6.2
Minimum value: -4.3
Maximum value: 6.7

Enter the number of elements in the array (positive integer): 0
Please enter a positive number greater than zero.
Enter the number of elements in the array (positive integer): -3
Please enter a positive number greater than zero.
Enter the number of elements in the array (positive integer): 3
Enter 3 elements (can be positive or negative):
Element 1: 8.2
Element 2: -3.5
Element 3: 4.1

Sum of all elements: 8.8
Minimum value: -3.5
Maximum value: 8.2
