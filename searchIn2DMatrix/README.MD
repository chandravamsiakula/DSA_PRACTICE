# Search In 2D Matrix

[![Difficulty](https://img.shields.io/badge/Difficulty-Medium-orange)](https://leetcode.com/problems/search-a-2d-matrix)

---

You are given an `m x n` integer matrix where each row is sorted in ascending order.

Given an integer `target`, return `true` if the target exists in the matrix, otherwise return `false`.

You may search the matrix row by row using Binary Search.

---

## Example 1:

```bash
Input:
matrix = [
  [1,3,5,7],
  [10,11,16,20],
  [23,30,34,60]
]
target = 3

Output:
true

Explanation:
3 exists in the matrix.
```

---

## Example 2:

```bash
Input:
matrix = [
  [1,2,3],
  [4,5,6],
  [7,8,9]
]
target = 10

Output:
false

Explanation:
10 does not exist in the matrix.
```

---

## Constraints:

- `1 <= matrix.length <= 100`
- `1 <= matrix[i].length <= 100`
- `-10^4 <= matrix[i][j], target <= 10^4`
- Each row is sorted in ascending order.

---