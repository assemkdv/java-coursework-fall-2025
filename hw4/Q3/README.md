# HW4 Q3

## Overview
This program prompts the user for the number of hours worked and the hourly pay rate, then calculates the total gross pay. The program follows standard overtime rules:

- **Up to 40 hours:** paid at the normal hourly rate  
- **Above 40 hours:** paid at **2×** the hourly rate (overtime)

The pay calculation is performed inside a required method named `paycalculator`, which takes the user-entered hours and rate as parameters and returns the computed pay as a formatted string.

## Concepts Demonstrated
- Method creation with parameters and return values  
- Arithmetic calculations (regular + overtime pay)  
- Conditional logic  
- Input handling with the `Scanner` class  
- Basic currency formatting

## Sample Output

```
Enter hours worked:
20

Enter rate per hour:
50

The total gross pay is: $1000.00


Enter hours worked:
60

Enter rate per hour:
50

The total gross pay is: $4000.00


Enter hours worked:
0

Enter rate per hour:
50

The total gross pay is: $0.00


Enter hours worked:
105

Enter rate per hour:
50

The total gross pay is: $8500.00

```


