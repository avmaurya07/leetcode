/*
 * @lc app=leetcode id=66 lang=java
 *
 * [66] Plus One
 */

// @lc code=start
class Solution {
    public int[] plusOne(int[] digits) {
        if (digits[digits.length-1]<9) {
            digits[digits.length-1]++;
            return digits;
        }else{
            int i =digits.length-1;
            while (digits[i]==9 && i>0) {

                i--;
            }
            if (i==0 && digits[0]==9) {
                int[] arr = new int[digits.length+1];
                arr[0]=1;
                for (int j = 1; j < arr.length; j++) {
                    arr[j]=0;
                }
                return arr;
            }else{
                digits[i]++;
                for (int j = i+1; j < digits.length; j++) {
                    digits[j]=0;
                }
            }
            
        }
        return digits;
    }
}
// @lc code=end

