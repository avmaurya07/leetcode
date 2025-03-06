/*
 * @lc app=leetcode id=8 lang=java
 *
 * [8] String to Integer (atoi)
 */

// @lc code=start
class Solution {
    public int myAtoi(String s) {
        int num = 0;
        int sign = 1;
        boolean hasSign = false;
        boolean hasStartedParsing = false;
        char[] arr = s.toCharArray();

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == ' ') {  // Ignore leading spaces
                if (hasStartedParsing) break;
                continue;
            }

            if (arr[i] == '-' || arr[i] == '+') {  // Handle signs
                if (hasStartedParsing || hasSign) break;
                sign = (arr[i] == '-') ? -1 : 1;
                hasStartedParsing=true;
                hasSign = true;
                continue;
            }

            if (arr[i] < '0' || arr[i] > '9') break; // Stop at non-numeric characters

            hasStartedParsing = true;
            int digit = arr[i] - '0';

            // Check overflow before updating num
            if (num > Integer.MAX_VALUE / 10 || (num == Integer.MAX_VALUE / 10 && digit > 7)) {
                return (sign == 1) ? Integer.MAX_VALUE : Integer.MIN_VALUE;
            }

            num = num * 10 + digit;
        }

        return num * sign;
    }
}

// @lc code=end

