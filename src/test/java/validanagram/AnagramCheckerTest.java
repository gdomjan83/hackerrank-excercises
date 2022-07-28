package validanagram;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class AnagramCheckerTest {

    AnagramChecker checker = new AnagramChecker();

    @Test
    void testIsAnagramTrue() {
        String word = "anagram";
        String otherWord = "nagaram";
        assertEquals(true, checker.isAnagram(word, otherWord));
    }

    @Test
    void testIsAnagramFalse() {
        String word = "anagramma";
        String otherWord = "nagaram";
        assertEquals(false, checker.isAnagram(word, otherWord));
    }

}