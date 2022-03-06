package com.company.binarysearch;

import java.util.Arrays;

/**
 * @author is Nabeel Tariq Bhatti
 * @created at 3/6/2022
 * @Time at 10:40 PM
 */
public class OrderAgnosticBinarySearch {
    public static int binarySearch(int[] array, int l, int r,int target){
        //can also be done using this flag but then code will increase but easy to understand
//        boolean ascFlag = array[l] < array[r];

        int mid = l+(r-l)/2;
        if(array[mid] == target ){
            return mid;
        }else if(target < array[mid] && array[mid] >= array[mid+1]){
            return binarySearch(array,mid+1,r,target);
        }else if(target < array[mid] && array[mid] <= array[mid+1]){
            return binarySearch(array,l,mid-1,target);
        }else if(target > array[mid] && array[mid] <= array[mid+1]){
            return binarySearch(array,mid+1,r,target);
        }else if(target > array[mid] && array[mid] >= array[mid+1]){
            return binarySearch(array,l,mid-1,target);
        }
       return -1;
    }

    public static void main(String[] args) {
        System.out.println(binarySearch(new int[]{1,2,3,4,5,10},0,6,10));
    }
}
