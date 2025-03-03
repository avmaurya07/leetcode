/*
 * @lc app=leetcode id=237 lang=java
 *
 * [237] Delete Node in a Linked List
 */

// @lc code=start

// import java.lang.classfile.components.ClassPrinter.ListNode;

/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
class Solution {
    public void deleteNode(ListNode node) {
        ListNode prev = null;
        while (node.next!=null) {
            node.val=node.next.val;
            prev=node;
            node=node.next;
        }
        prev.next=null;
    }
}
// @lc code=end

