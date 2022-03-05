package com.company.arrays;

/**
 * @author is Nabeel Tariq Bhatti
 * @created at 3/6/2022
 * @Time at 12:52 AM
 */
public class FindWealthiestAccount {

    public static int maximumWealth(int[][] accounts) {
        int max = 0;
        int sum = 0;

        for(int i=0; i<accounts.length; i++){
            sum = 0;
            for(int j=0; j<accounts[i].length; j++){
                sum += accounts[i][j];
            }
            max = Math.max(sum,max);
        }
        return max;

    }
    public static void main(String[] args) {

    }
}
