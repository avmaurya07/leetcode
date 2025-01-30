/*
 * @lc app=leetcode id=14 lang=java
 *
 * [14] Longest Common Prefix
 */

// @lc code=start
class Solution {
    public String longestCommonPrefix(String[] strs) {
        String prefix = strs[0];
        for (int i = 1; i < strs.length; i++) {
            for (int j = 0; j < prefix.length(); j++) {
                if (strs[i].length()-1 >= j) {
                    if (prefix.charAt(j) != strs[i].charAt(j)) {
                        prefix = prefix.substring(0, j);
                        break;
                    }
                }else{
                    prefix =strs[i];
                }

            }
        }
        return prefix;
    }
}
// @lc code=end