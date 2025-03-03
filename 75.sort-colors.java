/*
 * @lc app=leetcode id=75 lang=java
 *
 * [75] Sort Colors
 */

// @lc code=start
class Solution {
    public void sortColors(int[] nums) {
        int zero = 0;
        int one = 0;
        int two = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == 0) {
                zero++;
            } else if (nums[i] == 1) {
                one++;
            } else {
                two++;
            }
        }
        for (int i = 0; i < nums.length; i++) {
            if (i+1<=zero) {
                nums[i]=0;
            }else if (i+1<=(one+zero)) {
                nums[i]=1;
            }else{
                nums[i]=2;
            }
        }
    }
}
// @lc code=end
