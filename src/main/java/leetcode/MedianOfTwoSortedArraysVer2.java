package leetcode;

/*
Given two sorted arrays nums1 and nums2 of size m and n respectively, return the median of the two sorted arrays.
Example 1:

Input: nums1 = [1,3], nums2 = [2]
Output: 2.00000
Explanation: merged array = [1,2,3] and median is 2.

Example 2:
Input: nums1 = [1,2], nums2 = [3,4]
Output: 2.50000
Explanation: merged array = [1,2,3,4] and median is (2 + 3) / 2 = 2.5.

Example 3:
Input: nums1 = [0,0], nums2 = [0,0]
Output: 0.00000

Example 4:
Input: nums1 = [], nums2 = [1]
Output: 1.00000

Example 5:
Input: nums1 = [2], nums2 = []
Output: 2.00000

Constraints:
nums1.length == m
nums2.length == n
0 <= m <= 1000
0 <= n <= 1000
1 <= m + n <= 2000
-106 <= nums1[i], nums2[i] <= 106

Follow up: The overall run time complexity should be O(log (m+n)).
 */
// log complexity
public class MedianOfTwoSortedArraysVer2 {

    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        if (nums1.length < nums2.length) {
            return findMedian(nums1, nums2);
        } else {
            return findMedian(nums2, nums1);
        }
    }

    private double findMedian(int[] nums1, int[] nums2) {
        int len1 = nums1.length;
        int len2 = nums2.length;
        int commonLen = len1 + len2;
        boolean even = commonLen % 2 == 0;
        int min = 0;
        int max = len1;
        int i = 0;
        int j = 0;
        while (min <= max) {
            i = (min + max) / 2;
            j = (commonLen + 1) / 2 - i;
            if (i < max && nums1[i] < nums2[j - 1]) {
                min = i + 1;
            } else if (i > min && nums1[i - 1] > nums2[j]) {
                max = i - 1;
            } else {
                break;
            }
        }
        if (i == 0) {
            return even
                    ? (nums2[j - 1] + (len1 > 0 ? j < len2 ? Math.min(nums1[i], nums2[j]) : nums1[i] : nums2[j])) / 2.0
                    : nums2[j - 1];
        } else if (j == 0) {
            return even
                    ? (nums1[len1 - 1] + nums2[0]) / 2.0
                    : nums2[0];
        } else {
            return even
                    ? (Math.max(nums1[i - 1], nums2[j - 1]) + (i == len1 ? nums2[j] : Math.min(nums1[i], nums2[j]))) / 2.0
                    : Math.max(nums1[i - 1], nums2[j - 1]);
        }
    }
}
