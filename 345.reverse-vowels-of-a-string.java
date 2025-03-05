/*
 * @lc app=leetcode id=345 lang=java
 *
 * [345] Reverse Vowels of a String
 */

// @lc code=start
class Solution {
    public String reverseVowels(String s) {
        char[] arr = s.toCharArray();
        int j=0;
        int k=arr.length-1;
        while (j<k) {
            while (!isVov(arr[j])&&j<k) {
                j++;
            }
            while (!isVov(arr[k])&&j<k) {
                k--;
            }
            char temp=arr[j];
            arr[j]=arr[k];
            arr[k]=temp;
            j++;k--;
        }
        return new String(arr);
    }

    public boolean isVov(char c) {
        return (c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u' || c == 'A' || c == 'E' || c == 'I' || c == 'O'
                || c == 'U');
    }
}
// @lc code=end

