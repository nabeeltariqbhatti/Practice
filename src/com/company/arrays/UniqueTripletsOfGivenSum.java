package com.company.arrays;

import java.util.*;

/**
 * @author is Nabeel Tariq Bhatti
 * @created at 4/14/2022
 * @Time at 10:31 PM
 */
public class UniqueTripletsOfGivenSum {
    public List<List<Integer>> threeSum(int[] nums) {
        Arrays.sort(nums);
        Set<List<Integer>> res = new HashSet<>();
        List<String> records = new ArrayList<>();

        for(int i = 0; i < nums.length-2; i++){
            if(i != 0 && nums[i] == nums[i-1]){
                continue;
            }
            int lowP = i + 1;
            int highP = nums.length - 1;
            while(lowP < highP){
                int sum = nums[i] + nums[lowP] + nums[highP];
                if(sum == 0){
                    res.add(Arrays.asList(nums[i], nums[lowP], nums[highP]));
                    lowP++;
                }else if(sum > 0){
                    highP--;
                }else{
                    lowP++;
                }
            }
        }
        List<List<Integer>> ans = new ArrayList<>(res);
        return  ans;
    }
}
