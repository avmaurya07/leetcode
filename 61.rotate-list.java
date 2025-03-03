/*
 * @lc app=leetcode id=61 lang=java
 *
 * [61] Rotate List
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
    public ListNode rotateRight(ListNode head, int k) {
        ListNode temp=head;
        int n=0;
        if (head==null || head.next==null || k==0) {
            return head;
        }
        while (temp!=null) {
            n++;
            temp=temp.next;
        }
        k=k%n;
        if (k==0) {
            return head;
        }
        for (int i = 0; i < k; i++) {
            temp=head;
            for (int j = 1; j < n-1; j++) {
                temp=temp.next;
            }
            temp.next.next=head;
            head=temp.next;
            temp.next=null;
        }
        return head;
    }
}
// @lc code=end

