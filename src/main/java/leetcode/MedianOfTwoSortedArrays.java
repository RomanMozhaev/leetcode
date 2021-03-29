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

public class MedianOfTwoSortedArrays {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int len1 = nums1.length;
        int len2 = nums2.length;
        int index1 = 0;
        int index2 = 0;
        boolean odd = (len1 + len2) % 2 == 1;
        int medianIndex1 = odd ? ((len1 + len2) / 2) : ((len1 + len2) / 2) - 1;
        int medianIndex2 = odd ? -1 : medianIndex1 + 1;
        int sumIndex = -1;
        boolean first = true;
        int medianNum1 = 0;
        int medianNum2 = 0;
        while (index1 < len1 || index2 < len2) {
            if (index1 < len1 && index2 < len2) {
                if (nums1[index1] < nums2[index2]) {
                    index1++;
                    first = true;
                } else {
                    index2++;
                    first = false;
                }
            } else if (index1 < len1) {
                index1++;
                first = true;
            } else {
                index2++;
                first = false;
            }
            sumIndex++;
            if (sumIndex == medianIndex1) {
                medianNum1 = first ? nums1[index1 - 1] : nums2[index2 - 1];
                if (odd) {
                    break;
                }
            }
            if (sumIndex == medianIndex2) {
                medianNum2 = first ? nums1[index1 - 1] : nums2[index2 - 1];
                break;
            }
        }
        return odd ? medianNum1 : (medianNum1 + medianNum2) / 2.0;
    }
}
