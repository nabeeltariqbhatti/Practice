package com.company.arrays;

import java.util.ArrayList;
import java.util.List;

/**
 * @author is Nabeel Tariq Bhatti
 * @created at 3/6/2022
 * @Time at 5:52 PM
 */
public class CreateTargetArray {
    public  static int[] createTargetArray(int[] nums, int[] index) {
        int[] target = new int[nums.length];
        List<Integer> alist = new ArrayList<>();
        for(int i=0; i<nums.length; i++){
            alist.add(index[i], nums[i]);
        }


        int i=0;
        for(Integer j : alist){
            target[i] = j;
            i++;
        }
        return target;
    }
}
