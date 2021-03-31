package leetcode;

import org.junit.Test;

import static org.junit.Assert.*;

public class MedianOfTwoSortedArraysVer2Test {


    @Test
    public void testOddSumArray() {
        MedianOfTwoSortedArraysVer2 median = new MedianOfTwoSortedArraysVer2();
        int[] num1 = {1, 3};
        int[] num2 = {2};
        double result = median.findMedianSortedArrays(num1, num2);
        double expect = 2D;
        assertEquals(expect, result, 0.001);
    }

    @Test
    public void testEvenSumArray() {
        MedianOfTwoSortedArraysVer2 median = new MedianOfTwoSortedArraysVer2();
        int[] num1 = {1, 4};
        int[] num2 = {2, 3};
        double result = median.findMedianSortedArrays(num1, num2);
        double expect = 2.5;
        assertEquals(expect, result, 0.001);
    }

    @Test
    public void testEvenSumArray2() {
        MedianOfTwoSortedArraysVer2 median = new MedianOfTwoSortedArraysVer2();
        int[] num1 = {1, 2, 5, 6};
        int[] num2 = {3, 4, 7, 8};
        double result = median.findMedianSortedArrays(num1, num2);
        double expect = 4.5;
        assertEquals(expect, result, 0.001);
    }

    @Test
    public void testEvenSumArray3() {
        MedianOfTwoSortedArraysVer2 median = new MedianOfTwoSortedArraysVer2();
        int[] num1 = {1, 2};
        int[] num2 = {3, 4};
        double result = median.findMedianSortedArrays(num1, num2);
        double expect = 2.5;
        assertEquals(expect, result, 0.001);
    }

    @Test
    public void testEvenSumArray4() {
        MedianOfTwoSortedArraysVer2 median = new MedianOfTwoSortedArraysVer2();
        int[] num1 = {0, 0};
        int[] num2 = {0, 0};
        double result = median.findMedianSortedArrays(num1, num2);
        double expect = 0.0;
        assertEquals(expect, result, 0.001);
    }

    @Test
    public void testEvenSumArray5() {
        MedianOfTwoSortedArraysVer2 median = new MedianOfTwoSortedArraysVer2();
        int[] num1 = {1, 3};
        int[] num2 = {2, 7};
        double result = median.findMedianSortedArrays(num1, num2);
        double expect = 2.5;
        assertEquals(expect, result, 0.001);
    }

    @Test
    public void testOddSumArray6() {
        MedianOfTwoSortedArraysVer2 median = new MedianOfTwoSortedArraysVer2();
        int[] num1 = {};
        int[] num2 = {1};
        double result = median.findMedianSortedArrays(num1, num2);
        double expect = 1;
        assertEquals(expect, result, 0.001);
    }
    @Test
    public void testOddSumArray7() {
        MedianOfTwoSortedArraysVer2 median = new MedianOfTwoSortedArraysVer2();
        int[] num1 = {1};
        int[] num2 = {2,3,4};
        double result = median.findMedianSortedArrays(num1, num2);
        double expect = 2.5;
        assertEquals(expect, result, 0.001);
    }

    @Test
    public void testOddSumArray8() {
        MedianOfTwoSortedArraysVer2 median = new MedianOfTwoSortedArraysVer2();
        int[] num1 = {3};
        int[] num2 = {1,2,4};
        double result = median.findMedianSortedArrays(num1, num2);
        double expect = 2.5;
        assertEquals(expect, result, 0.001);
    }
    @Test
    public void testOddSumArray9() {
        MedianOfTwoSortedArraysVer2 median = new MedianOfTwoSortedArraysVer2();
        int[] num1 = {};
        int[] num2 = {2,3};
        double result = median.findMedianSortedArrays(num1, num2);
        double expect = 2.5;
        assertEquals(expect, result, 0.001);
    }


}
