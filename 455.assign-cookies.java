/*
 * @lc app=leetcode id=455 lang=java
 *
 * [455] Assign Cookies
 */

// @lc code=start

import java.util.Arrays;

class Solution {
    public int findContentChildren(int[] g, int[] s) {
        int count =0;
        int j=0;
        Arrays.sort(g);
        Arrays.sort(s);
        int k=s.length-1;
        if (g.length==0 || s.length==0) {
            return 0;
        }
        for (int i = 0; i < g.length; i++) {
            while (g[i]>s[j] && j<k) {
                j++;
            }
            if (g[i]<=s[j]) {
                count++;
            }
            if (j>=k) {
                return count;
            }
            j++;
        }
        return count;
    }
}
// @lc code=end

