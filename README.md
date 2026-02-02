# [151. Reverse Words in a String](https://leetcode.com)

## 📝 Problem Description
Given an input string `s`, reverse the order of the words. A word is defined as a sequence of non-space characters. The returned string should have words separated by a single space, with no leading or trailing spaces.

**Example:**
- **Input:** `s = "  hello world  "`
- **Output:** `"world hello"`

## 💡 Approach
1. **Sanitize Input:** Use `.trim()` to remove leading/trailing spaces.
2. **Split:** Use regex `\\s+` to split the string into an array, which handles multiple spaces between words.
3. **Reverse & Build:** Iterate through the array backwards and append words to a `StringBuilder`.
4. **Format:** Ensure a single space is added between words but not at the end of the final string.

## 🚀 Complexity
- **Time Complexity:** $O(N)$ - We traverse the string and the array once.
- **Space Complexity:** $O(N)$ - We store the words in an array and use a `StringBuilder` for the result.
