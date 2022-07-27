package simplearraysum;

import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class ResultTest {

    Result result = new Result();

    @Test
    void testSumArray() {
        List<Integer> input = List.of(1, 2, 3, 4, 10, 11);
        assertEquals(31, result.simpleArraySum(input));
    }

}