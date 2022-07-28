package bitsets;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class BitSetsSolutionTest {

    BitSetsSolution solution = new BitSetsSolution();

    @Test
    void testGetSetBits() {
        int setSize = 5;
        String[] operations = {"AND 1 2", "SET 1 4", "FLIP 2 2", "OR 2 1"};
        String expected = "0 0\n1 0\n1 1\n1 2\n";

        assertEquals(expected, solution.getSetBits(setSize, operations));
    }
}