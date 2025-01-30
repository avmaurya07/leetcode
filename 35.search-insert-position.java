/*
 * @lc app=leetcode id=35 lang=java
 *
 * [35] Search Insert Position
 */

// @lc code=start
class Solution {
    public int searchInsert(int[] nums, int target) {
        int high = nums.length - 1;
        int low = 0;

        while (low <= high) {

            int mid = (low + high) / 2;
            if (nums[mid] == target) {
                return mid;
            } else if (target < nums[mid]) {
                high = mid-1;
            } else if (nums[mid] < target) {
                low = mid+1;
            }
        }

        return low;
    }
}
// @lc code=end
