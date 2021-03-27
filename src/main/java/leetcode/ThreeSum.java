package leetcode;
/*
Given an array nums of n integers, are there elements a, b, c in nums such that a + b + c = 0?
Find all unique triplets in the array which gives the sum of zero.
Notice that the solution set must not contain duplicate triplets.

Example 1:
Input: nums = [-1,0,1,2,-1,-4]
Output: [[-1,-1,2],[-1,0,1]]
 */

import java.util.*;

public class ThreeSum {

    public List<List<Integer>> threeSum(int[] nums) {
        Set<List<Integer>> set = new HashSet<>();
        if (nums.length < 3) {
            return List.copyOf(set);
        }
        Arrays.sort(nums);
        int zero = Arrays.binarySearch(nums, 0);
        int firstNegative;
        int firstPositive;
        if (zero >= 0) {
            firstNegative = zero - 1;
            while ((firstNegative - 1 >= 0 && nums[firstNegative - 1] == 0)) {
                firstNegative--;
            }
            firstPositive = zero + 1;
            while ((firstPositive + 1 < nums.length && nums[firstPositive + 1] == 0)) {
                firstPositive++;
            }
        } else {
            firstNegative = -zero - 2;
            firstPositive = -zero - 1;
        }
        List<Integer> zeros = new ArrayList<>();
        Set<Integer> negative = new HashSet<>();
        Set<Integer> positive = new HashSet<>();
        for (int num : nums) {
            if (num == 0) {
                zeros.add(num);
            } else if (num < 0) {
                negative.add(num);
            } else {
                positive.add(num);
            }
        }
        if (zeros.size() >= 3) {
            set.add(List.of(0, 0, 0));
        }
        if (negative.isEmpty() || positive.isEmpty()) {
            return List.copyOf(set);
        }
        if (!zeros.isEmpty()) {
            negative.forEach(n -> {
                if (positive.contains(-n)) {
                    set.add(List.of(n, 0, -n));
                }
            });
        }
        for (int i = 0; i <= firstNegative - 1; i++) {
            for (int j = i + 1; j <= firstNegative; j++) {
                Integer one = nums[i];
                Integer two = nums[j];
                Integer three = -(one + two);
                if (positive.contains(three)) {
                    set.add(List.of(one, two, three));
                }
            }
        }
        for (int i = firstPositive; i < nums.length - 1; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                int one = nums[i];
                int two = nums[j];
                int three = -(one + two);
                if (negative.contains(three)) {
                    set.add(List.of(three, one, two));
                }
            }
        }
        return List.copyOf(set);
    }
}
