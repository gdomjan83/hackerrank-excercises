package javadequeue;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class UniqueNumbersTest {

    UniqueNumbers uniqueNumbers = new UniqueNumbers();

    @Test
    void testCountUniqueNumbers() {
        int subArraySize = 3;
        Integer[] numbers = {5, 3, 5, 2, 3, 2};

        assertEquals(3, uniqueNumbers.countUniqueNumbers(subArraySize, numbers));;
    }
}