package leetcode;
/*
Given a string s, find the length of the longest substring without repeating characters.
Example 1:
Input: s = "abcabcbb"
Output: 3
Explanation: The answer is "abc", with the length of 3.
 */
public class LongestSubstringWithoutRepeatingCharacters {


    public int lengthOfLongestSubstring(String s) {
        int[] charCount = new int[200];
        int start = 0;
        char[] chars = s.toCharArray();
        int maxLength = 0;
        for (int i = 0; i < chars.length; i++) {
            int ch = chars[i];
            charCount[ch]++;
            while (charCount[ch] > 1) {
                int prevChar = chars[start++];
                charCount[prevChar]--;
            }
            int newMaxLength = i + 1 - start;
            if (newMaxLength > maxLength) {
                maxLength = newMaxLength;
            }
        }
        return maxLength;
    }
}
