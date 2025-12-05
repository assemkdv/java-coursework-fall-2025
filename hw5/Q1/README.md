# Craps Game Simulation (craps.java)

## Overview
This program simulates a simplified version of the casino dice game **Craps**.  
The user chooses how many games to play, and the program repeatedly simulates that many games, counts how many the **player** wins vs. how many the **house** wins, and then prints both the raw counts and the win percentages.

The game logic follows the standard Craps rules using two six-sided dice and separate methods for rolling dice and playing a single game.

---

## Game Rules (Simplified)
For each game:

1. **Come-out roll**: roll two dice and add them.
2. Based on the total:
   - **2, 3, or 12** → player loses immediately (house wins).
   - **7 or 11** → player wins immediately.
   - **4, 5, 6, 8, 9, or 10** → this value becomes the **point**.
3. If a **point** is established:
   - Keep rolling the two dice.
   - If the **point** is rolled again before a 7 → **player wins**.
   - If a **7** is rolled before the point → **house wins**.

---

## Methods & Concepts Demonstrated

- `int rollDice()`  
  - Simulates rolling a single six-sided die and returns a value from 1–6.  
  - Used twice per roll to represent the two dice.

- `boolean playGame()`  
  - Simulates **one full game of Craps**.  
  - Handles the come-out roll, possible point, and rerolls.  
  - Returns `true` if the player wins, `false` if the house wins.

- Other concepts:
  - Random number generation with `java.util.Random`
  - Loops to simulate multiple games
  - Counters for wins/losses
  - Calculating and formatting percentages to two decimal places
  - User input with `Scanner`

---

## Sample Output

```text
How many times should we play the game? 100
The player won 46 out of 100 games (46.00% win rate).
The house won 54 out of 100 games (54.00% win rate).

How many times should we play the game? 50
The player won 20 out of 50 games (40.00% win rate).
The house won 30 out of 50 games (60.00% win rate).

How many times should we play the game? 1000
The player won 499 out of 1000 games (49.90% win rate).
The house won 501 out of 1000 games (50.10% win rate).

