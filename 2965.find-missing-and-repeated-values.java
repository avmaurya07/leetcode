/*
 * @lc app=leetcode id=2965 lang=java
 *
 * [2965] Find Missing and Repeated Values
 */

// @lc code=start

import java.util.Arrays;

class Solution {
    public int[] findMissingAndRepeatedValues(int[][] grid) {
        int m=grid.length;
        int n=m;
        int[] arr=new int[m*n];
        int k=0;
        int d=0;
        int l=0;
        int y=0;
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                arr[k]=grid[i][j];
                k++;
            }
        }
        Arrays.sort(arr);
        for (int i = 0; i < arr.length; i++) {
            if (arr[i]-y==0) {
                d=arr[i];
            }
            if (arr[i]-y==2) {
                l=y+1;
            }
            if (i==arr.length-1 && l==0 && d!=0) {
                l=arr[i]+1;
            }
           y=arr[i];
        }
        return new int[]{d,l};
    }
}
// @lc code=end

