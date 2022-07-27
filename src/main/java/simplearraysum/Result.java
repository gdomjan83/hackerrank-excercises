package simplearraysum;

import java.util.List;

public class Result {

    //Given an array of integers, find the sum of its elements.
    public int simpleArraySum(List<Integer> input) {
        return input.stream()
                .mapToInt(i -> i)
                .sum();
    }
}
