package leetcode;

import org.junit.Assert;
import org.junit.Test;

public class AddTwoNumbersVer2Test {


    @Test
    public void testAddTwoNumbers() {
        AddTwoNumbers addTwoNumbers = new AddTwoNumbers();
        AddTwoNumbers.ListNode listNode13 = addTwoNumbers.new ListNode(3);
        AddTwoNumbers.ListNode listNode12 = addTwoNumbers.new ListNode(4, listNode13);
        AddTwoNumbers.ListNode listNode11 = addTwoNumbers.new ListNode(2, listNode12);
        AddTwoNumbers.ListNode listNode23 = addTwoNumbers.new ListNode(4);
        AddTwoNumbers.ListNode listNode22 = addTwoNumbers.new ListNode(6, listNode23);
        AddTwoNumbers.ListNode listNode21 = addTwoNumbers.new ListNode(5, listNode22);
        AddTwoNumbers.ListNode result = addTwoNumbers.addTwoNumbers(listNode11, listNode21);
        Assert.assertEquals(result.val, 7);
        Assert.assertEquals(result.next.val, 0);
        Assert.assertEquals(result.next.next.val, 8);
    }
    @Test
    public void testAddTwoNumbersPlus() {
        AddTwoNumbers addTwoNumbers = new AddTwoNumbers();
        AddTwoNumbers.ListNode listNode13 = addTwoNumbers.new ListNode(5);
        AddTwoNumbers.ListNode listNode12 = addTwoNumbers.new ListNode(4, listNode13);
        AddTwoNumbers.ListNode listNode11 = addTwoNumbers.new ListNode(2, listNode12);
        AddTwoNumbers.ListNode listNode23 = addTwoNumbers.new ListNode(4);
        AddTwoNumbers.ListNode listNode22 = addTwoNumbers.new ListNode(6, listNode23);
        AddTwoNumbers.ListNode listNode21 = addTwoNumbers.new ListNode(5, listNode22);
        AddTwoNumbers.ListNode result = addTwoNumbers.addTwoNumbers(listNode11, listNode21);
        Assert.assertEquals(result.val, 7);
        Assert.assertEquals(result.next.val, 0);
        Assert.assertEquals(result.next.next.val, 0);
        Assert.assertEquals(result.next.next.next.val, 1);
    }
    @Test
    public void testAddTwoNumbersNines() {
        AddTwoNumbers addTwoNumbers = new AddTwoNumbers();
        AddTwoNumbers.ListNode listNode11 = addTwoNumbers.new ListNode(9);
        AddTwoNumbers.ListNode listNode30 = addTwoNumbers.new ListNode(9);
        AddTwoNumbers.ListNode listNode29 = addTwoNumbers.new ListNode(9, listNode30);
        AddTwoNumbers.ListNode listNode28 = addTwoNumbers.new ListNode(9, listNode29);
        AddTwoNumbers.ListNode listNode27 = addTwoNumbers.new ListNode(9, listNode28);
        AddTwoNumbers.ListNode listNode26 = addTwoNumbers.new ListNode(9, listNode27);
        AddTwoNumbers.ListNode listNode25 = addTwoNumbers.new ListNode(9, listNode26);
        AddTwoNumbers.ListNode listNode24 = addTwoNumbers.new ListNode(9, listNode25);
        AddTwoNumbers.ListNode listNode23 = addTwoNumbers.new ListNode(9, listNode24);
        AddTwoNumbers.ListNode listNode22 = addTwoNumbers.new ListNode(9, listNode23);
        AddTwoNumbers.ListNode listNode21 = addTwoNumbers.new ListNode(1, listNode22);
        AddTwoNumbers.ListNode result = addTwoNumbers.addTwoNumbers(listNode11, listNode21);
        Assert.assertEquals(result.val, 0);
        Assert.assertEquals(result.next.val, 0);
        Assert.assertEquals(result.next.next.val, 0);
        Assert.assertEquals(result.next.next.next.val, 0);
        Assert.assertEquals(result.next.next.next.next.val, 0);
        Assert.assertEquals(result.next.next.next.next.next.val, 0);
        Assert.assertEquals(result.next.next.next.next.next.next.val, 0);
        Assert.assertEquals(result.next.next.next.next.next.next.next.val, 0);
        Assert.assertEquals(result.next.next.next.next.next.next.next.next.val, 0);
        Assert.assertEquals(result.next.next.next.next.next.next.next.next.next.val, 0);
        Assert.assertEquals(result.next.next.next.next.next.next.next.next.next.next.val, 1);
    }

}
