/*
 * @lc app=leetcode id=2579 lang=java
 *
 * [2579] Count Total Number of Colored Cells
 */

// @lc code=start
class Solution {
    public long coloredCells(int n) {
       if (n==1) {
        return 1; 
       }
       return ((n-1)*4)+coloredCells(n-1);
    }
}
// @lc code=end

