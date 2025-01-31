/*
 * @lc app=leetcode id=69 lang=java
 *
 * [69] Sqrt(x)
 */

// @lc code=start
class Solution {
    public int mySqrt(int x) {
    if (x == 0) return 0;
    int left = 1, right = x, ans = 0;
    while (left <= right) {
        int mid = left + (right - left) / 2;
        if (mid <= x / mid) {
            ans = mid;
            left = mid + 1;
        } else {
            right = mid - 1;
        }
    }
    return ans;
    }
}
class Solution1 {
    public int mySqrt(int x) {
        if (x==1) {
            return 1;
        }else if (x==0) {
            return 0;
        }
        int i=0;
        if (x/2<=46340) {
            i=x/2;
        }else{i=46340;}
        for (; i <= x; i--) {
                if ((i*i<=x) ) {
                    return i;
                }
        }
        return 0;
    }
}
// @lc code=end

