/*
 * @lc app=leetcode id=20 lang=java
 *
 * [20] Valid Parentheses
 */

// @lc code=start

import java.util.Arrays;

class Solution {
    public boolean isValid(String s) {
        char[] stack = new char[s.length()];
        int index = 0;
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == '(') {
                stack[index] = '(';
                index++;
            } else if (s.charAt(i) == '{') {
                stack[index] = '{';
                index++;
            } else if (s.charAt(i) == '[') {
                stack[index] = '[';
                index++;
            } else if (s.charAt(i) == ')') {
                if (index <= 0) {
                    return false;
                }
                if (stack[index - 1] == '(') {
                    stack[index - 1] = ' ';
                    index--;
                }else{return false;}
            } else if (s.charAt(i) == '}') {
                if (index <= 0) {
                    return false;
                }
                if (stack[index - 1] == '{') {
                    stack[index - 1] = ' ';
                    index--;
                }else{return false;}
            } else if (s.charAt(i) == ']') {
                if (index <= 0) {
                    return false;
                }
                if (stack[index - 1] == '[') {
                    stack[index - 1] = ' ';
                    index--;
                }else{return false;}
            }
        }
        if (index==0) {
            return true;
        }
        return false;
    }
}
// @lc code=end
