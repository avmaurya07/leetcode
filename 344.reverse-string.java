/*
 * @lc app=leetcode id=344 lang=java
 *
 * [344] Reverse String
 */

// @lc code=start
class Solution {
    public void reverseString(char[] s) {
        int d=s.length;
        for (int i = 0; i < s.length/2; i++) {
            char temp=s[i];
            s[i]=s[d-1-i];
            s[d-1-i]=temp;
        }
    }
}
// @lc code=end

