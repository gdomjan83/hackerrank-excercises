package comparetriplets;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;

class ResultTest {

    Result result = new Result();

    @Test
    void testCompareTriplets() {
        List<Integer> aliceList = new ArrayList<>(Arrays.asList(5, 6, 7));
        List<Integer> bobList = new ArrayList<>(Arrays.asList(3, 6, 10));

        assertThat(result.compareTriplets(aliceList, bobList)).containsExactly(1, 1);

        aliceList = new ArrayList<>(Arrays.asList(5, 6, 7));
        bobList = new ArrayList<>(Arrays.asList(3, 2, 1));

        assertThat(result.compareTriplets(aliceList, bobList)).containsExactly(3, 0);
    }
}