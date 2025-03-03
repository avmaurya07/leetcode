/*
 * @lc app=leetcode id=2161 lang=java
 *
 * [2161] Partition Array According to Given Pivot
 */

// @lc code=start
class Solution {
    public int[] pivotArray(int[] nums, int pivot) {
        int small = 0;
        int eql = 0;
        int gr=0;
        for(int i=0;i<nums.length;i++){
            if (nums[i]>pivot) {
                gr++;
            }else if (nums[i]<pivot) {
                small++;    
            }else{eql++;}
        }
        int[] arr1=new int[small];
        int[] arr2=new int[eql];
        int[] arr3=new int[gr];
        int[] arr4=new int[small+eql+gr];
        int j=0;
        int k=0;
        int l=0;

        for (int i = 0; i < nums.length; i++) {
            if (nums[i]<pivot) {
                arr1[j]=nums[i];
                j++;
            }else if (nums[i]>pivot) {
                arr3[l]=nums[i];
                l++;
            }else{
                arr2[k]=nums[i];
                k++;
            }
        }
       // Copy elements from all three arrays into mergedArray
       System.arraycopy(arr1, 0, arr4, 0, arr1.length);
       System.arraycopy(arr2, 0, arr4, arr1.length, arr2.length);
       System.arraycopy(arr3, 0, arr4, arr1.length + arr2.length, arr3.length);
       return arr4;
    }
}
// @lc code=end

