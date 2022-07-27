package javadequeue;

import java.util.*;

public class UniqueNumbers {

    //In this problem, you are given N integers.
    // You need to find the maximum number of unique integers among all the possible continuous subarrays of size M.
    public int countUniqueNumbers(int subarraySize, Integer[] numbers) {
        List<Integer> uniquesInSubarray = new ArrayList<>();
        for (int i = 0; i <= numbers.length - subarraySize; i++) {
            Integer[] sub = Arrays.copyOfRange(numbers, i, i + subarraySize);
            uniquesInSubarray.add(new HashSet<>(Arrays.asList(sub)).size());
        }
        return uniquesInSubarray.stream()
                .mapToInt(i -> i)
                .max()
                .getAsInt();
    }
}
