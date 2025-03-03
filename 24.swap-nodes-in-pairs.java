/*
 * @lc app=leetcode id=24 lang=java
 *
 * [24] Swap Nodes in Pairs
 */

// @lc code=start
/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    public ListNode swapPairs(ListNode head) {
        ListNode temp=head;
        while (temp!=null) {
            if (temp.next==null) {
                return head;
            }
            int t = temp.val;
            temp.val=temp.next.val;
            temp.next.val=t;
            temp=temp.next.next;
        }

        return head;
    }
}
// @lc code=end

