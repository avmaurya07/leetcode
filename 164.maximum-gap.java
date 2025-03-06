/*
 * @lc app=leetcode id=164 lang=java
 *
 * [164] Maximum Gap
 */

// @lc code=start

import java.util.Arrays;

class Solution {
    public int maximumGap(int[] nums) {
        int gap=0;
        Arrays.sort(nums);
        for (int i = 0; i < nums.length-1; i++) {
            gap=Math.max(gap, nums[i+1]-nums[i]);
        }

        return gap;
    }
}
// @lc code=end

