/*
 * @lc app=leetcode id=2579 lang=java
 *
 * [2579] Count Total Number of Colored Cells
 */

// @lc code=start
class Solution {
    public long coloredCells(int n) {

        return 1+(long)(n-1)*2*n;
    }
}
// @lc code=end

