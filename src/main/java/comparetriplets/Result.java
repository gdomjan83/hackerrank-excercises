package comparetriplets;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/*
Alice and Bob each created one problem for HackerRank. A reviewer rates the two challenges,
awarding points on a scale from 1 to 100 for three categories: problem clarity, originality, and difficulty.

The rating for Alice's challenge is the triplet a = (a[0], a[1], a[2]), and the rating for Bob's challenge is the triplet b = (b[0], b[1], b[2]).

The task is to find their comparison points by comparing a[0] with b[0], a[1] with b[1], and a[2] with b[2].

    If a[i] > b[i], then Alice is awarded 1 point.
    If a[i] < b[i], then Bob is awarded 1 point.
    If a[i] = b[i], then neither person receives a point.

Comparison points is the total points a person earned.

Given a and b, determine their respective comparison points.
 */

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
