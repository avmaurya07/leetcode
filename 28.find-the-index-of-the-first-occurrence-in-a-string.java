/*
 * @lc app=leetcode id=28 lang=java
 *
 * [28] Find the Index of the First Occurrence in a String
 */

// @lc code=start
class Solution {
    public int strStr(String haystack, String needle) {
        int n_size = needle.length();
        int h_size = haystack.length();

        if (h_size < n_size) {
            return -1;
        }

        for (int i = 0; i < h_size; i++) {

            if (i<=h_size-n_size) {
                if (haystack.substring(i, i + n_size).equals(needle)) {
                    return i;
                }
            }else{
                return -1;
            }
        }
        return -1;
    }
}
// @lc code=end
