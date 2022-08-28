package comparetriplets;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Result {
    public List<Integer> compareTriplets(List<Integer> aliceList, List<Integer> bobList) {
        List<Integer> result = new ArrayList<>(Arrays.asList(0, 0));
        for (int i = 0; i < aliceList.size(); i++) {
            if (aliceList.get(i) > bobList.get(i)) {
                result.set(0, result.get(0) + 1);
            } else if (aliceList.get(i) < bobList.get(i)) {
                result.set(1, result.get(1) + 1);
            }
        }
        return result;
    }
}
