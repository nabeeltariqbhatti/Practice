package com.company.arrays;

import java.util.ArrayList;
import java.util.List;

/**
 * @author is Nabeel Tariq Bhatti
 * @created at 3/6/2022
 * @Time at 3:14 PM
 */
public class GreatestCandies {
    public static List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {

        int max = 0;
        List<Boolean> list = new ArrayList<>();
        for(int i =0; i<candies.length; i++){
            max=Math.max(candies[i],max);

        }
        for(int candy:candies){
            if(candy+extraCandies >=max){
                list.add(true);
            }else{
                list.add(false);
            }
        }
        return list;

    }

    public static void main(String[] args) {

    }
}
