package ispalindrome;

//Given an integer x, return true if x is palindrome integer.
//An integer is a palindrome when it reads the same backward as forward.

public class PalindromeChecker {
    public boolean isPalindrome(int x) {
        char[] chars = String.valueOf(x).toCharArray();
        for (int i = 0; i < chars.length / 2; i++) {
            if (chars[i] != chars[chars.length - 1 - i]) {
                return false;
            }
        }
        return true;
    }
}
