/*
 * @lc app=leetcode id=2579 lang=java
 *
 * [2579] Count Total Number of Colored Cells
 */

// @lc code=start
class Solution {
    public long coloredCells(long n) {

        if (n<2) {
            return n;
        }
        return ((((n-1))*(8+((n-2)*4)))/2+1);
    }
}
// @lc code=end

