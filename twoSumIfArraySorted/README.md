# Two Sum II - Input Array Is Sorted

[![Difficulty](https://img.shields.io/badge/Difficulty-Medium-orange)](https://leetcode.com/problems/two-sum-ii-input-array-is-sorted/description/)

---

Given a 1-indexed array of integers `numbers` that is already sorted in non-decreasing order, find two numbers such that they add up to a specific `target` number.

Return the indices of the two numbers `(1-indexed)` as an integer array `[index1, index2]`.

You may assume that each input has exactly one solution, and you may not use the same element twice.

---

## Example 1:

```bash
Input: numbers = [2,7,11,15], target = 9
Output: [1,2]
Explanation: The sum of 2 and 7 is 9.
Therefore, index1 = 1 and index2 = 2.
```

---

## Example 2:

```bash
Input: numbers = [2,3,4], target = 6
Output: [1,3]
Explanation: The sum of 2 and 4 is 6.
```

---

## Example 3:

```bash
Input: numbers = [-1,0], target = -1
Output: [1,2]
Explanation: The sum of -1 and 0 is -1.
```

---

## Constraints:

- `2 <= numbers.length <= 3 * 10^4`
- `-1000 <= numbers[i] <= 1000`
- `numbers` is sorted in non-decreasing order.
- `-1000 <= target <= 1000`
- The tests are generated such that there is exactly one solution.

---