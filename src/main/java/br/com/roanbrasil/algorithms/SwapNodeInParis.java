package br.com.roanbrasil.algorithms;

public class SwapNodeInParis {
    public class ListNode {
        int val;
        ListNode next;

        ListNode(int x) {
            val = x;
        }
    }

    public ListNode swapPairs(ListNode head) {

        // recursive
        if (head == null || head.next == null) {
            return head;
        }

        ListNode node = head.next;
        head.next = swapPairs(node.next);
        node.next = head;

        return node;
    }
    /** test cases:
     * null ==> null
     * 1 ==> 1
     * 1->2 ==> 2->1
     * 1->2->3 ==> 2->1->3
     * 1->2->3->4 ==> 2->1->4->3
     */
}
