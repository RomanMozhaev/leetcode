package leetcode;

import static java.util.Objects.nonNull;

public class AddTwoNumbersVer2 {

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
        int val = l1.val + l2.val;
        int nextOrder = 0;
        if (val > 9) {
            nextOrder = 1;
            val = val - 10;
        }
        ListNode resultNode = new ListNode(val);
        ListNode currentNode = resultNode;
        while (nonNull(l1) && nonNull(l1.next) || nonNull(l2) && nonNull(l2.next) || nextOrder > 0) {
            int l1Val = nonNull(l1) && nonNull(l1.next) ? l1.next.val : 0;
            int l2Val = nonNull(l2) && nonNull(l2.next) ? l2.next.val : 0;
            val = l1Val + l2Val + nextOrder;
            nextOrder = 0;
            if (val > 9) {
                nextOrder = 1;
                val = val - 10;
            }
            ListNode nextNode = new ListNode(val);
            currentNode.next = nextNode;
            currentNode = nextNode;
            l1 = nonNull(l1) ? l1.next : null;
            l2 = nonNull(l2) ? l2.next : null;
        }
        return resultNode;
    }
}

