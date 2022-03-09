package com.company.arrays;

/**
 * @author is Nabeel Tariq Bhatti
 * @created at 3/9/2022
 * @Time at 10:52 PM
 */
public class NumberWithIntegerDigits {

    public int findNumbers(int[] nums) {

        int counter = 0;
        for(int num : nums){
            String n = String.valueOf(num);
            if(n.length()%2==0){
                counter ++;
            }

        }
        return counter;

    }
}
