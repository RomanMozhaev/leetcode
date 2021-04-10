package leetcode;

import org.junit.Test;

import static org.junit.Assert.*;

public class LongestPalindromicSubstringTest {

    @Test
    public void test1() {
        String s = "babad";
        LongestPalindromicSubstring lps = new LongestPalindromicSubstring();
        String result = lps.longestPalindrome(s);
        String expect = "bab";
        assertEquals(expect, result);
    }
    @Test
    public void test2() {
        String s = "cbbd";
        LongestPalindromicSubstring lps = new LongestPalindromicSubstring();
        String result = lps.longestPalindrome(s);
        String expect = "bb";
        assertEquals(expect, result);
    }

    @Test
    public void test3() {
        String s = "a";
        LongestPalindromicSubstring lps = new LongestPalindromicSubstring();
        String result = lps.longestPalindrome(s);
        String expect = "a";
        assertEquals(expect, result);
    }

    @Test
    public void test4() {
        String s = "ac";
        LongestPalindromicSubstring lps = new LongestPalindromicSubstring();
        String result = lps.longestPalindrome(s);
        String expect = "a";
        assertEquals(expect, result);
    }

    @Test
    public void test5() {
        String s = "bb";
        LongestPalindromicSubstring lps = new LongestPalindromicSubstring();
        String result = lps.longestPalindrome(s);
        String expect = "bb";
        assertEquals(expect, result);
    }
    @Test
    public void test6() {
        String s = "bab";
        LongestPalindromicSubstring lps = new LongestPalindromicSubstring();
        String result = lps.longestPalindrome(s);
        String expect = "bab";
        assertEquals(expect, result);
    }



}
