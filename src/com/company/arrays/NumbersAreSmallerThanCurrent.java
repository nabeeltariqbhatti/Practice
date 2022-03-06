package com.company.arrays;

/**
 * @author is Nabeel Tariq Bhatti
 * @created at 3/6/2022
 * @Time at 4:54 PM
 */
public class NumbersAreSmallerThanCurrent {
    public static int[] smallerNumbersThanCurrent(int[] nums) {

        int[] ans = new int[nums.length];

        for(int i =0; i<nums.length; i++){
            int counter= 0;
            for(int j =0; j<nums.length; j++){
                if(i==j){
                    continue;
                }else if(nums[j]<nums[i]){
                    counter++;
                }
            }
            ans[i] = counter;
        }
        return ans;
    }

    public static void main(String[] args) {

    }
}
