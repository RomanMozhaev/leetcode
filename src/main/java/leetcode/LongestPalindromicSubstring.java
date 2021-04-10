package leetcode;

public class LongestPalindromicSubstring {

    int leftIndex = 0;
    int rightIndex = 0;

    public String longestPalindrome(String s) {
        char[] chars = s.toCharArray();
        int[] repeat = new int[200];
        char ch;
        for (int i = 0; i < chars.length; i++) {
            ch = chars[i];
            repeat[ch]++;
            if (repeat[ch] > 1) {
                checkLength(chars, i);
            }
        }
        return s.substring(leftIndex, rightIndex + 1);
    }

    private void checkLength(char[] chars, int i) {
        int left = i - 1;
        int right = i - 1;
        while (right < chars.length - 1 && chars[left] == chars[right + 1]) {
            right++;
        }
        while (left > 0 && right < chars.length - 1 && chars[left - 1] == chars[right + 1]) {
            left--;
            right++;
        }
        countNewLength(left, right);
    }

    private void countNewLength(int left, int right) {
        if (right - left > rightIndex - leftIndex) {
            rightIndex = right;
            leftIndex = left;
        }
    }
}
