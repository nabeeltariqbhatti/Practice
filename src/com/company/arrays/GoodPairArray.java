package com.company.arrays;

import java.util.Arrays;

/**
 * @author is Nabeel Tariq Bhatti
 * @created at 3/6/2022
 * @Time at 4:19 PM
 */
public class GoodPairArray {
    public static  int numIdenticalPairs(int[] nums) {
        int counter = 0;
        boolean visited[] = new boolean[nums.length];

        Arrays.fill(visited, false);

        // Traverse through array elements and
        // count frequencies
        for (int i = 0; i < nums.length; i++) {

            // Skip this element if already processed
            if (visited[i] == true)
                continue;

            // Count frequency
            int count = 1;
            for (int j = i + 1; j < nums.length; j++) {
                if (nums[i] == nums[j]) {
                    visited[j] = true;
                    count++;
                }
            }
            counter += count *(count-1)/2;


        }
        return counter;
    }

    public static void main(String[] args) {

    }
}
