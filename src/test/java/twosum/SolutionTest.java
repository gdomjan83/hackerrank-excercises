package twosum;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {

    Solution solution = new Solution();

    @Test
    void testTwoSum() {
        int[] input = {15,7,11,2};
        int target = 9;

        assertArrayEquals(new int[]{1, 3}, solution.twoSum(input, target));

        int[] input2 = {3,2,4};
        target = 6;

        assertArrayEquals(new int[]{1, 2}, solution.twoSum(input2, target));
    }
}