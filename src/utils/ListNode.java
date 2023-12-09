package utils;

public class ListNode {
    int val;
    ListNode next;
    ListNode(int x) {
        val = x;
        next = null;
    }

    ListNode() {
        val = -1;
    }

    @Override
    public String toString() {
        if (this.next == null) return "null";

        StringBuilder sb = new StringBuilder();
        ListNode tmp = this;
        while (tmp.next != null) {
            tmp = tmp.next;
            sb.append(tmp.val);
            sb.append(' ');
        }

        return sb.toString();
    }

    public static ListNode build(int[] array) {
        ListNode head = new ListNode();
        ListNode tmp = head;
        for (int num : array) {
            tmp.next = new ListNode(num);
            tmp = tmp.next;
        }

        return head;
    }
}