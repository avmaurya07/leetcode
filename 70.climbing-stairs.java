/*
 * @lc app=leetcode id=70 lang=java
 *
 * [70] Climbing Stairs
 */

// @lc code=start
class Solution {
    public int climbStairs(int n) {
        if (n==1) {
            return 1;
        }else if (n==2) {
            return 2;  
        }else if (n==3) {
            return 3;
        }
        return 2*climbStairs(n-1)-climbStairs(n-3);
    }
}
// @lc code=end

