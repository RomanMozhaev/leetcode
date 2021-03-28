package leetcode;

import org.junit.Test;

import static org.junit.Assert.*;

public class LongestSubstringWithoutRepeatingCharactersTest {

    @Test
    public void testString1() {
        String testString = "ppqplkew";
        LongestSubstringWithoutRepeatingCharacters lswrc = new LongestSubstringWithoutRepeatingCharacters();
        int result = lswrc.lengthOfLongestSubstring(testString);
        assertEquals(6, result);
    }

    @Test
    public void testString2() {
        String testString = "abcabcbb";
        LongestSubstringWithoutRepeatingCharacters lswrc = new LongestSubstringWithoutRepeatingCharacters();
        int result = lswrc.lengthOfLongestSubstring(testString);
        assertEquals(3, result);
    }

}
