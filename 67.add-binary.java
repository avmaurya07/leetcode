/*
 * @lc app=leetcode id=67 lang=java
 *
 * [67] Add Binary
 */

// @lc code=start
class Solution {
    public String addBinary(String a, String b) {
        int alen = a.length();
        int blen = b.length();
        int i = 0;
        int j = 0;
        if (alen < blen) {
            i = blen;
            j = alen;
            for (int k = 0; k < i - j; k++) {
                a="0"+a;
            }
        } else {
            i = alen;
            j = blen;
            for (int k = 0; k < i - j; k++) {
                b="0"+b;
            }
        }
        int carry=0;
        String output = new String();
        for (int k = a.length()-1; k >= 0; k--) {
            if (a.charAt(k)=='0') {
                if (b.charAt(k)=='0') {
                    if (carry==0) {
                        output="0"+output;
                        carry=0;
                    }else{output="1"+output;carry=0;}
                }else{
                    if (carry==0) {
                        output="1"+output;
                        carry=0;
                    }else{output="0"+output;carry=1;}
                }
            }else{
                if (b.charAt(k)=='0') {
                    if (carry==0) {
                        output="1"+output;
                        carry=0;
                    }else{
                        output="0"+output;
                        carry=1;
                    }
                }else{
                    if (carry==0) {
                        output="0"+output;
                        carry=1;
                    }else{
                        output="1"+output;
                        carry=1;
                    }
                }
            }
        }
        if (((a.charAt(0)=='1'||b.charAt(0)=='1') && output.charAt(0)=='0')||(a.charAt(0)=='1'||b.charAt(0)=='1')&& carry ==1) {
            output="1"+output;
        }
        return output;
    }
}
// @lc code=end
