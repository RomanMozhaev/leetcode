package leetcode;

public class LongestPalindromicSubstringVer2 {


    public String longestPalindrome(String s) {
        char[] chars = s.toCharArray();
        if (s == null || chars.length < 1) return "";
        int start = 0, end = 0;
        for (int i = 0; i < chars.length; i++) {
            int len1 = expandAroundCenter(chars, i, i);
            int len2 = expandAroundCenter(chars, i, i + 1);
            int len = Math.max(len1, len2);
            if (len > end - start) {
                start = i - (len - 1) / 2;
                end = i + len / 2;
            }
        }
        return s.substring(start, end + 1);
    }

    private int expandAroundCenter(char[] chars, int left, int right) {
        int L = left, R = right;
        while (L >= 0 && R < chars.length && chars[L] == chars[R]) {
            L--;
            R++;
        }
        return R - L - 1;
    }
}
