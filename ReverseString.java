/**
 * Link: https://leetcode.com
 * Time Complexity: O(N) - We visit each element once.
 * Space Complexity: O(1) - The reversal is done in-place.
 */
class Solution {
    public void reverseString(char[] s) {
        int i = 0, j = s.length - 1;
        while (i < j) {
            char temp = s[i];
            s[i] = s[j];
            s[j] = temp;
            i++;
            j--;
        }
    }
}
