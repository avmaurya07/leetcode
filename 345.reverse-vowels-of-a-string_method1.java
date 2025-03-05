/*
 * @lc app=leetcode id=345 lang=java
 *
 * [345] Reverse Vowels of a String
 */

// @lc code=start
class Solution {
    public String reverseVowels(String s) {
        char[] arr = s.toCharArray();
        String news="";
        for (int i = 0; i < arr.length; i++) {
            if (isVov(arr[i])) {
                news+=arr[i];
            }
        }
        char[] arr2=news.toCharArray();
        for (int i = 0; i < arr2.length/2; i++) {
            char temp=arr2[i];
            arr2[i]=arr2[arr2.length-1-i];
            arr2[arr2.length-1-i]=temp;
        }
        int j=0;
        for (int i = 0; i < arr.length; i++) {
            if (isVov(arr[i])) {
                arr[i]=arr2[j];
                j++;
            }
        }
        return new String(arr);
    }

    public boolean isVov(char c) {
        return (c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u' || c == 'A' || c == 'E' || c == 'I' || c == 'O'
                || c == 'U');
    }
}
// @lc code=end
