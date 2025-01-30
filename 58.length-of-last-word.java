/*
 * @lc app=leetcode id=58 lang=java
 *
 * [58] Length of Last Word
 */

// @lc code=start
class Solution {
    public int lengthOfLastWord(String s) {
        s=" "+s+" ";
        int count = 0;
        for (int i = s.length()-1; i >=0; i--) {
            if (s.charAt(i)!=' ') {
                count++;
            }
            if (count!=0 && s.charAt(i)==' ') {
                return count;
            }
        }
        return -1;
    }
}
class Solution1 {
    public int lengthOfLastWord(String s) {
        String[] arr= new String[0];
        arr = s.split(" ");
        for (int i = arr.length-1; i >=0; i--) {
            if (arr[i]!=" ") {
                return arr[i].length();
            }
        }
        return 1;
    }
}
// @lc code=end

