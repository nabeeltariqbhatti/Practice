package com.company.arrays;

/**
 * @author is Nabeel Tariq Bhatti
 * @created at 3/6/2022
 * @Time at 12:44 AM
 */
public class RunningSumOfOneDArray {
    private static int[] runningSum(int[] nums) {

        int[] sums = new int[nums.length];
        for(int i=0; i<nums.length; i++){
            if(i==0){
                sums[i]=nums[i];
            }else{
                sums[i] = sums[i-1] + nums[i];
            }
        }

        return sums;

    }
    public static void main(String[] args) {

    }
}
