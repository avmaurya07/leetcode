/*
 * @lc app=leetcode id=82 lang=java
 *
 * [82] Remove Duplicates from Sorted List II
 */

// @lc code=start
/**
 * Definition for singly-linked list.
 * public class ListNode {
 * int val;
 * ListNode next;
 * ListNode() {}
 * ListNode(int val) { this.val = val; }
 * ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    public ListNode deleteDuplicates(ListNode head) {
        if (head != null && head.next != null && head.val == head.next.val) {
            ListNode new1 = new ListNode(head.val, head);

            ListNode temp = new1;
        }

        ListNode temp = head;
        ListNode prev = head;

        while (temp!=null && temp.next!=null) {
            if (temp.val!=temp.next.val) {
                prev=temp;
            }else{
                prev.next=temp;
            }
        }
        return head;
    }
}
// @lc code=end
