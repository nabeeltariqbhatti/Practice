package com.company.arrays;

/**
 * @author is Nabeel Tariq Bhatti
 * @created at 3/7/2022
 * @Time at 10:08 PM
 */
public class FindHighestAltitude {
    public int largestAltitude(int[] gain) {

        int[] altitudes = new int[gain.length+1];
        altitudes[0] = 0;
        int max = 0;

        for(int i =0; i<gain.length; i++){
            altitudes[i+1] = altitudes[i] + gain[i];
            max = Math.max(altitudes[0],Math.max(max,altitudes[i+1]));
        }
        return max;

    }
}
