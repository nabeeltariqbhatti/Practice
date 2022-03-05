package com.company.arrays;

/**
 * @author is Nabeel Tariq Bhatti
 * @created at 3/6/2022
 * @Time at 12:10 AM
 */
public class BuildArrayFromPermutation {
    public static  int[] buildArray(int[] nums) {

        int[] ans = new int[nums.length];

        for(int i =0; i<nums.length; i++){
            ans[i] = nums[nums[i]];
        }
        return ans;

    }

    public static void main(String[] args) {


    }
}
