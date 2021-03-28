package leetcode;

import java.math.BigDecimal;

public class AddTwoNumbers {

    public class ListNode {
        int val;
        ListNode next;

        ListNode() {
        }

        ListNode(int val) {
            this.val = val;
        }

        ListNode(int val, ListNode next) {
            this.val = val;
            this.next = next;
        }
    }

    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        String resultDigit = sumTwoNumbers(getDigit(l1), getDigit(l2));
        return getResultNode(resultDigit);
    }

    private String sumTwoNumbers(String one, String two) {
        BigDecimal first = new BigDecimal(one);
        BigDecimal second = new BigDecimal(two);
        return first.add(second).toString();
    }

    private String getDigit(ListNode listNode) {
        String num = Integer.toString(listNode.val);
        ListNode nextListNode = listNode.next;
        while (nextListNode != null) {
            num = nextListNode.val + num;
            nextListNode = nextListNode.next;
        }
        return num;
    }

    private ListNode getResultNode(String resultDigit) {
        char[] nums = resultDigit.toCharArray();
        int last = nums.length - 1;
        ListNode resultNode = new ListNode(Integer.parseInt(Character.toString(nums[last])));
        ListNode currentNode = resultNode;
        for (int i = last - 1; i >= 0; i--) {
            ListNode nextNode = new ListNode(Integer.parseInt(Character.toString(nums[i])));
            currentNode.next = nextNode;
            currentNode = nextNode;
        }
        return resultNode;
    }
}

