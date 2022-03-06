package com.company.arrays;

/**
 * @author is Nabeel Tariq Bhatti
 * @created at 3/6/2022
 * @Time at 2:19 PM
 */
public class ShuffleTheArray {

    public static  int[] shuffle(int[] nums, int n) {
        int[] ans = new int[nums.length];
        int counter = 0;
        for(int i=0; i<nums.length;i+=2){
            ans[i] = nums[i-(i/2)];
            ans[i+1] = nums[nums.length/2+counter];
            counter++;
        }
        return ans;

    }
    public static void main(String[] args) {

    }
}
