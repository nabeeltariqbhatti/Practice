package com.company.arrays;

import java.util.*;

/**
 * @author is Nabeel Tariq Bhatti
 * @created at 4/17/2022
 * @Time at 11:51 PM
 */
public class FourSum {
    public List<List<Integer>> fourSum(int[] nums, int target) {


        Arrays.sort(nums);

        Set<List<Integer>> res = new HashSet<>();

        for(int i=0; i<nums.length-2; i++){
            if(i != 0 && nums[i] == nums[i-1]) continue;
            for(int j = i+1 ; j<nums.length-2; j++){
                int left = j+1;
                int right = nums.length -1 ;
                while(left < right){
                    int leftPlusPlus = left + 1;
                    int sum =  nums[i] + nums[j] + nums[left] + nums[right];

                    if(target == sum){
                        res.add(List.of(nums[i] , nums[j] ,nums[left], nums[right]));
                        left++;
                    }else if(sum > target){
                        right--;
                    }else{
                        left++;
                    }
                }

            }

        }
        List<List<Integer>> ans = new ArrayList<>(res);
        return  ans;
    }
}
