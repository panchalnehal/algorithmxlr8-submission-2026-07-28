<p align="center"><img src="https://algorithmxlr8.io/logo-mark.png" width="56" alt="AlgorithmXlr8.io logo" /></p>
<h3 align="center">AlgorithmXlr8.io</h3>
<p align="center"><sub>Solved and synced automatically from <a href="https://algorithmxlr8.io">AlgorithmXlr8.io</a></sub></p>

---

# Happy Number

**Difficulty:** `Easy`

## Problem

Write an algorithm to determine if a number n is happy.

A happy number is defined by the following process:
- Starting with any positive integer, replace the number by the sum of the squares of its digits.
- Repeat the process until the number equals 1 (where it will stay), or it loops endlessly in a cycle that does not include 1.
- Those numbers for which this process ends in 1 are happy.

Return true if n is a happy number, and false if not.

Read n from standard input, and print true or false to standard output.

## Examples

### Example 1

**Input**
```
n = 19
```
**Output**
```
true
```

**Explanation:** 19 -> 82 -> 68 -> 100 -> 1, so 19 is happy.

### Example 2

**Input**
```
n = 2
```
**Output**
```
false
```

**Explanation:** 2 eventually falls into a repeating cycle that never reaches 1.

### Example 3

**Input**
```
n = 1
```
**Output**
```
true
```

**Explanation:** 1 is already the terminating value, so it is happy by definition.

---

Solved on [AlgorithmXlr8.io](https://algorithmxlr8.io/solve-dsa/happy-number).