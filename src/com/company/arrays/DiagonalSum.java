package com.company.arrays;

/**
 * @author is Nabeel Tariq Bhatti
 * @created at 3/8/2022
 * @Time at 12:35 AM
 */
public class DiagonalSum {
    public int diagonalSum(int[][] mat) {
        if(mat.length == 1 && mat[0].length == 1){
            return mat[0][0];
        }else if(mat.length == 1 && mat[0].length == 0){
            return 0;
        }else if(mat.length != mat[0].length){
            return 0;
        }

        int sum = 0;
        for(int i=0; i<mat.length; i++) sum += mat[i][i] + mat[i][mat[i].length-i-1];

        if(mat.length%2!=0){
            int mid = mat.length/2;
            sum = sum - mat[mid][mat[mid].length/2];
        }
        return sum;

    }
}
