package com.company.binarysearch;

/**
 * @author is Nabeel Tariq Bhatti
 * @created at 3/20/2022
 * @Time at 10:08 PM
 */
public class SearchRange {
    public static int searchRange(int[] nums, int target, boolean findStart){
        int ans = -1;
        int start = 0;
        int end = nums.length-1;
        while(start<=end){
            int mid = start + (end - start)/2;
            if(target < nums[mid]){
                end = mid-1;
            }else if(target > nums[mid]){
                start = mid+1;
            }else{
                ans=mid;
                if(findStart){
                    end = mid-1;
                }else{
                    start = mid+1;
                }
            }

        }
        return ans;
    }
}
