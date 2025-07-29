package Day14;

public class InsertGCD {
    public static void main(String[] args) {
        Solution sol = new Solution();
        sol.GCD(1, 10);
    }
}

class ListNode {
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

class Solution {
    public ListNode insertGreatestCommonDivisors(ListNode head) {
        if (head == null)
            return null;
        if (head.next == null)
            return head;
        ListNode temp = head;
        while (temp.next != null) {
            int gcd = GCD(temp.val, temp.next.val);
            ListNode node = new ListNode(gcd);
            node.next = temp.next;
            temp.next = node;
            temp = node.next;
        }
        return head;
    }

    int GCD(int a, int b) {
        if (b == 0)
            return a;
        return GCD(b, a % b);
    }
}
