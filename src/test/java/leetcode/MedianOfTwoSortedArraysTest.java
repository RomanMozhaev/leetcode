package leetcode;

import org.junit.Test;

import static org.junit.Assert.*;

public class MedianOfTwoSortedArraysTest {

    @Test
    public void testOddSumArray() {
        MedianOfTwoSortedArrays median = new MedianOfTwoSortedArrays();
        int[] num1 = {1, 3};
        int[] num2 = {2};
        double result = median.findMedianSortedArrays(num1, num2);
        double expect = 2D;
        assertEquals(expect, result, 0.001);
    }

    @Test
    public void testEvenSumArray() {
        MedianOfTwoSortedArrays median = new MedianOfTwoSortedArrays();
        int[] num1 = {1, 4};
        int[] num2 = {2, 3};
        double result = median.findMedianSortedArrays(num1, num2);
        double expect = 2.5;
        assertEquals(expect, result, 0.001);
    }

    @Test
    public void testEvenSumArray2() {
        MedianOfTwoSortedArrays median = new MedianOfTwoSortedArrays();
        int[] num1 = {1, 2};
        int[] num2 = {3, 4};
        double result = median.findMedianSortedArrays(num1, num2);
        double expect = 2.5;
        assertEquals(expect, result, 0.001);
    }

}
