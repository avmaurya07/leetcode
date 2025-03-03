/*
 * @lc app=leetcode id=23 lang=java
 *
 * [23] Merge k Sorted Lists
 */

// @lc code=start

// import java.lang.classfile.components.ClassPrinter.ListNode;
import java.util.Arrays;

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
    public ListNode mergeKLists(ListNode[] lists) {
        int count = 0;
        if (lists.length == 0) {
            return null;
        }
        for (int i = 0; i < lists.length; i++) {
            ListNode temp = lists[i];
            while (temp != null) {
                count++;
                temp = temp.next;
            }
        }
        int[] arr = new int[count];
        int j = 0;
        for (int i = 0; i < lists.length; i++) {
            ListNode temp = lists[i];
            while (temp != null) {
                arr[j] = temp.val;
                j++;
                temp = temp.next;
            }
        }
        Arrays.sort(arr);
        ListNode head = new ListNode(0);
        ListNode temp = head;
        for (int i = 0; i < arr.length; i++) {
            temp.next = new ListNode(arr[i]);
            temp = temp.next;
        }

        return head.next;
    }
}
// @lc code=end
