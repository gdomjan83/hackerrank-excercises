package longestsubstring;

import java.util.HashSet;
import java.util.Set;

//Given a string s, find the length of the longest substring without repeating characters.

public class Solution {
    public int lengthOfLongestSubstring(String s) {
        if (s.length() == 0 || s.length() == 1) {
            return s.length();
        }
        int longest = 1;
        for (int i = 0; i < s.length() - 1; i++) {
            longest = iterateSubString(longest, i, s);
        }
        return longest;
    }

    private boolean checkIfHasDoubleCharacters(String input) {
        Set<Character> chars = new HashSet<>();
        for (Character c : input.toCharArray()) {
            chars.add(c);
        }
        return chars.size() != input.length();
    }

    private int iterateSubString(int longest, int startPosition, String input) {
        for (int j = startPosition + longest; j <= input.length(); j++) {
            String sub = input.substring(startPosition, j);
            if (!checkIfHasDoubleCharacters(sub)) {
                longest = Math.max(sub.length(), longest);
            } else {
                break;
            }
        }
        return longest;
    }
}
