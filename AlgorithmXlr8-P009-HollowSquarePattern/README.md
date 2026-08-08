<p align="center"><img src="https://algorithmxlr8.io/logo-mark.png" width="56" alt="AlgorithmXlr8.io logo" /></p>
<h3 align="center">AlgorithmXlr8.io</h3>
<p align="center"><sub>Solved and synced automatically from <a href="https://algorithmxlr8.io">AlgorithmXlr8.io</a></sub></p>

---

# Hollow Square Pattern

**Difficulty:** `Easy`

## Problem

Given a non-negative integer n, print an n x n hollow square: every cell on the first row, last row, first column, or last column is a star, and every other cell is a space.

Read n from standard input. Print n lines, each exactly n characters wide (interior rows need trailing spaces to reach full width, since the right border star is the last character). If n is 0, print nothing.

## Examples

### Example 1

**Input**
```
n = 5
```
**Output**
```
*****
*   *
*   *
*   *
*****
```

**Explanation:** The top row, bottom row, and the first and last column of every row are stars; everything else is a space.

### Example 2

**Input**
```
n = 1
```
**Output**
```
*
```

**Explanation:** A single star, since that one cell is simultaneously the top, bottom, first, and last of its row and column.

### Example 3

**Input**
```
n = 2
```
**Output**
```
**
**
```

**Explanation:** Both rows are entirely border, so both rows are solid stars.

---

Solved on [AlgorithmXlr8.io](https://algorithmxlr8.io/solve-dsa/hollow-square-pattern).