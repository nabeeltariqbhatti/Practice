package com.company.arrays;

import java.util.ArrayList;
import java.util.List;

/**
 * @author is Nabeel Tariq Bhatti
 * @created at 3/12/2022
 * @Time at 11:46 PM
 */
public class SpiralOrderCopyPaste {
    public static void main(String[] args) {




    }
    public void check(int[][]matrix, int row, int col) {
        List<Integer> result = new ArrayList<>();
        int minRow = 0, minCol = 0, maxRow = 0, maxCol = 0;
        int limit = 0;
        int count = 0;
        result.add(matrix[row][col]);
        while(true) {
            while(col + 1 < maxCol){
                col++;
                count++;
                result.add(matrix[row][col]);
            }
            minRow++;
            if(result.size() >= limit) break;
            while(row + 1 < maxRow){
                row++;
                count++;
                result.add(matrix[row][col]);
            }
            maxCol--;
            if(result.size() >= limit) break;
            while(col - 1 >= minCol){
                col--;
                count++;
                result.add(matrix[row][col]);
            }
            maxRow--;
            if(result.size() >= limit) break;
            while(row - 1 >= minRow){
                row--;
                count++;
                result.add(matrix[row][col]);
            }
            minCol++;
            if(result.size() >= limit) break;
        }
    }

}
