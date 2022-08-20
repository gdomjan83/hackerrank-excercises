package longestsubstring;

import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {
    Solution solution = new Solution();

    @Test
    void testLengthOfLongestSubstringEmptyString() {
        assertEquals(0, solution.lengthOfLongestSubstring(""));
    }

    @Test
    void testLengthOfLongestSubstringOneCharacter() {
        assertEquals(1, solution.lengthOfLongestSubstring("d"));
    }

    @Test
    void testLengthOfLongestSubstringWrongAnswer() {
        assertNotEquals(4, solution.lengthOfLongestSubstring("abca"));
    }

    @Test
    void testLengthOfLongestSubstringMoreCharacter() {
        assertEquals(3, solution.lengthOfLongestSubstring("abcabcbb"));
        assertEquals(1, solution.lengthOfLongestSubstring("bbbbb"));
        assertEquals(3, solution.lengthOfLongestSubstring("pwwkew"));
        assertEquals(7, solution.lengthOfLongestSubstring("abcabcadefg"));
    }
}