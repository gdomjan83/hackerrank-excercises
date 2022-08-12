package splitstrings;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class StringSplitTest {

    StringSplit stringSplit = new StringSplit();

    @Test
    void testSplitSringEven() {
        String input = "Veszprem";
        assertArrayEquals(new String[] {"Ve", "sz", "pr", "em"}, stringSplit.solution(input));
    }

    @Test
    void testSplitStringOdd() {
        String input = "Automatic";
        assertArrayEquals(new String[] {"Au", "to", "ma", "ti", "c_"}, stringSplit.solution(input));
    }

}