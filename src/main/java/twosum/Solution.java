package twosum;

public class Solution {
    //Given an array of integers nums and an integer target, return indices of the two numbers such that they add up to target.
    //You may assume that each input would have exactly one solution, and you may not use the same element twice.
    //You can return the answer in any order.


    public int[] twoSum(int[] nums, int target) {
        for (int j = 0; j < nums.length - 1; j++) {
            int[] result = twoSumOfPart(j, nums, target);
            if (result[0] + result[1] > 0) {
                return result;
            }
        }
        throw new IllegalStateException("No indices found.");

    }

    private int[] twoSumOfPart(int start, int[] numbers, int target) {
        for (int i = start; i < numbers.length - 1; i++) {
            if (numbers[start] + numbers[i + 1] == target) {
                return new int[]{start, i + 1};
            }
        }
        return new int[]{0, 0};
    }
}
