package validanagram;

//Given two strings s and t, return true if t is an anagram of s, and false otherwise.
//An Anagram is a word or phrase formed by rearranging the letters of a different word or phrase,
// typically using all the original letters exactly once.

import java.util.Arrays;

public class AnagramChecker {

    public boolean isAnagram(String s, String t) {
        char[] charactersS = s.toCharArray();
        char[] charactersT = t.toCharArray();
        Arrays.sort(charactersS);
        Arrays.sort(charactersT);
        return Arrays.equals(charactersS, charactersT);
    }
}
