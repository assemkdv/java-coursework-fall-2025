# HW4 Q1

## Overview
This program prompts the user to enter a score between 1 and 100 and then displays the corresponding letter grade based on a predefined grading scale. The program validates the user’s input and prints an error message if the score is outside the valid range.

A separate method named `gradecalculation` is used to convert the numeric score into a letter grade. This method takes an integer score as its parameter and returns the grade as a string. Using this method is a required part of the assignment.

## Concepts Demonstrated
- Method creation and return values  
- Parameter passing  
- Conditional logic (`if-else` chains)  
- Input validation  
- Program termination using `return`  

## Grading Scale
| Score Range | Grade |
|-------------|--------|
| 90–100      | A |
| 80–89       | B |
| 70–79       | C |
| 60–69       | D |
| < 60        | F |

## Sample Output
Enter a score between 1 and 100:
95
The grade is: A

Enter a score between 1 and 100:
85
The grade is: B

Enter a score between 1 and 100:
70
The grade is: C

Enter a score between 1 and 100:
105
Error: Score is out of range.

Enter a score between 1 and 100:
-2
Error: Score is out of range.

Enter a score between 1 and 100:
0
The grade is: F

