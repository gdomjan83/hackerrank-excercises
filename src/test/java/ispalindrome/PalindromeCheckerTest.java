package ispalindrome;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PalindromeCheckerTest {

    PalindromeChecker checker = new PalindromeChecker();

    @Test
    void testIsPalindromeTrue() {
        int number = 12321;
        assertEquals(true, checker.isPalindrome(number));
        number = 25655652;
        assertEquals(true, checker.isPalindrome(number));
    }

    @Test
    void testIsPalindromeFalse() {
        int number = -12321;
        assertEquals(false, checker.isPalindrome(number));
        number = 2551;
        assertEquals(false, checker.isPalindrome(number));
    }

}