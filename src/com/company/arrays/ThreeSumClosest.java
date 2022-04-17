package com.company.arrays;

import java.util.Arrays;

/**
 * @author is Nabeel Tariq Bhatti
 * @created at 4/17/2022
 * @Time at 4:37 PM
 */
public class ThreeSumClosest {
    public int threeSumClosest(int[] nums, int target) {

        Arrays.sort(nums);
        int minDiff=Integer.MAX_VALUE;
        int min=0;
        for(int i= 0; i<nums.length; i++){
            int left = i+1;
            int right = nums.length-1;
            while(left < right){
                int sum = nums[i] +  nums[left] +   nums[right];
                if(sum == target ) return sum;
                if(sum > target){
                    if(minDiff > (sum-target)){
                        minDiff = sum-target;
                        min = sum;
                    }
                    right--;
                }else{
                    if(minDiff > (target-sum)){

                        minDiff = target-sum;
                        min = sum;

                    }
                    left++;
                }



            }
        }
        return min;
    }

}
