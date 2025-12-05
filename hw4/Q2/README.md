# HW4 Q2

## Overview
This program prompts the user for a non-negative integer `n` and prints the **nth Fibonacci number**. The Fibonacci value is computed using a method named `fib(n)`, which takes an integer parameter and returns the corresponding Fibonacci number.

The program demonstrates mathematical recursion/iteration concepts and method-based problem solving.

## What is the Fibonacci Sequence?
The Fibonacci sequence begins with:
1, 1, 2, 3, 5, 8, 13, 21, ...

markdown
Copy code
Each number is the sum of the **two previous numbers**:
- 2 = 1 + 1  
- 3 = 1 + 2  
- 5 = 2 + 3  
- 8 = 3 + 5  
- etc.

## Concepts Demonstrated
- Method creation (`fib(n)`)
- Looping or recursion (depending on implementation)
- Using return values
- Input validation
- Mathematical problem solving

## Fibonacci Logic

fib(1) = 1

fib(2) = 1

fib(n) = fib(n - 1) + fib(n - 2)


## Sample Output

```
Enter a non-negative integer n:
7

The 7th Fibonacci number is: 13

Enter a non-negative integer n:
5

The 5th Fibonacci number is: 5

```

