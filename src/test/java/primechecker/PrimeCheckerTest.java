package primechecker;

import org.junit.jupiter.api.RepeatedTest;
import org.junit.jupiter.api.RepetitionInfo;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PrimeCheckerTest {

    PrimeChecker checker = new PrimeChecker();

    @Test
    void testException() {
        IllegalArgumentException iae = assertThrows(IllegalArgumentException.class,
                () -> checker.isPrime(1));
        assertEquals("Can only check a number greater than 1.", iae.getMessage());
    }

    @RepeatedTest(value = 5, name = "Test: {currentRepetition} of {totalRepetitions}")
    void testPrimes(RepetitionInfo repetitionInfo) {
        int[] inputs = {2, 3, 5, 59, 449};
        assertTrue(checker.isPrime(inputs[repetitionInfo.getCurrentRepetition() - 1]));
    }

    @RepeatedTest(value = 5, name = "Test: {currentRepetition} of {totalRepetitions}")
    void testNonPrimes(RepetitionInfo repetitionInfo) {
        int[] inputs = {4, 6, 8, 60, 450};
        assertFalse(checker.isPrime(inputs[repetitionInfo.getCurrentRepetition() - 1]));
    }
}