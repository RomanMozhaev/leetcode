package leetcode;

import org.junit.Assert;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

public class ThreeSumTest {

    @Test
    public void allNulls() {
        ThreeSum threeSum = new ThreeSum();
        int[] zeros = {0, 0, 0};
        List<List<Integer>> result = threeSum.threeSum(zeros);
        List<List<Integer>> expect = new ArrayList<>();
        expect.add(List.of(0, 0, 0));
        Assert.assertEquals(expect, result);
    }

    @Test
    public void allNegative() {
        ThreeSum threeSum = new ThreeSum();
        int[] zeros = {-1, -2, -3};
        List<List<Integer>> result = threeSum.threeSum(zeros);
        List<List<Integer>> expect = new ArrayList<>();
        Assert.assertEquals(expect, result);
    }

}
