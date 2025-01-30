/*
 * @lc app=leetcode id=21 lang=java
 *
 * [21] Merge Two Sorted Lists
 */

// @lc code=start

// import statement removed

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
    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        ListNode temp = new ListNode;
        ListNode head = new ListNode;
        if (list1.val>=list2.val) {
               head=list2;
               while (list1.next!=null) {
            
               }
        }else{
            head=list1;
        }
        
    }
}
// @lc code=end
