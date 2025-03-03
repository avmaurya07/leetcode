/*
 * @lc app=leetcode id=7 lang=java
 *
 * [7] Reverse Integer
 */

// @lc code=start
class Solution {
    public int reverse(int x) {
        int num=0;
        int f=1;
        if (x<0) {
            x*=-1;
            f=-1;
        }
        while (x!=0) {
            if (num>Integer.MAX_VALUE/10 || num <Integer.MIN_VALUE/10) {
                return 0;
            }
            num=(num*10)+x%10;
            x/=10;
        }

        return num*f;
    }
}
// @lc code=end

