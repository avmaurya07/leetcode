/*
 * @lc app=leetcode id=1780 lang=java
 *
 * [1780] Check if Number is a Sum of Powers of Three
 */

// @lc code=start
class Solution {
    public boolean checkPowersOfThree(int n) {
        return !Integer.toString(n,3).contains("2");
        }
}
// @lc code=end
