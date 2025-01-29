/*
 * @lc app=leetcode id=9 lang=java
 *
 * [9] Palindrome Number
 */

// @lc code=start
class Solution {
    public boolean isPalindrome(int x) {
        String num1= Integer.toString(x);
        for (int i=0;i<num1.length()/2;i++){
            if (num1.charAt(i)!=num1.charAt(num1.length()-1-i))
                return false;
        }
        return true;
    }
}
// @lc code=end

