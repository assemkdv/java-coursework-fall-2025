# Salary Raise Calculator (Performance-Based Raise Program)

This program calculates an employee’s raise based on their **performance rating** and **current salary**.  
You will complete the provided `Salary.java` skeleton by adding conditional logic and input validation.

---

## Objective

The purpose of this assignment is to practice:

- Using **conditional statements** (`if–else`)
- Handling **string comparisons**
- Validating user input and re-prompting when necessary
- Performing percentage-based calculations
- Formatting and displaying computed financial results

---

## Program Requirements

### Input
The program must:

1. Prompt the user for the **current salary**
2. Validate that the salary is **not negative**
3. Prompt the user for the **performance rating**, which must be one of:
   - `"Excellent"`
   - `"Good"`
   - `"Poor"`

---

## Raise Rules

Performance Rating | Raise Percentage
------------------ | ----------------
Excellent          | 6%
Good               | 4%
Poor               | 1.5%

## Sample Output

```text

Enter the current salary: 1000
Enter the performance rating (Excellent, Good, or Poor): Good
Current Salary:       $1000.0
Amount of your raise: $40.0
Your new salary:      $1040.0

Enter the current salary: 1000
Enter the performance rating (Excellent, Good, or Poor): Poor
Current Salary:       $1000.0
Amount of your raise: $15.0
Your new salary:      $1015.0

Enter the current salary: -1000
Error: Salary cannot be negative. Please reenter: -200
Error: Salary cannot be negative. Please reenter: 1000
Enter the performance rating (Excellent, Good, or Poor): Poor
Current Salary: $1000.0 
Amount of your raise: $15.0 
Your new salary: $1015.0 


Enter the current salary: 1000
Enter the performance rating (Excellent, Good, or Poor): Fair
Error: Invalid performance rating.


