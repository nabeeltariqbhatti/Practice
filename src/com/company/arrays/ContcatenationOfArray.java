package com.company.arrays;

/**
 * @author is Nabeel Tariq Bhatti
 * @created at 3/6/2022
 * @Time at 12:24 AM
 */
public class ContcatenationOfArray {
    public  static int[] getConcatenation(int[] nums) {
        int[] ans = new int[nums.length*2];

        for(int i=0; i<nums.length; i++){
            ans[i] = nums[i];
            ans[nums.length+i] = nums[i];
        }
        return ans;

    }

    public static void main(String[] args) {

    }
}
