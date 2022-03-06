package com.company.binarysearch;

/**
 * @author is Nabeel Tariq Bhatti
 * @created at 3/6/2022
 * @Time at 10:01 PM
 */

//descending ascending
public class SearchNumberInAnArray {
    public static int binarySearch(int[] array, int l, int r,int target){
        int mid = l+(r-l)/2;
        if(array[mid] == target ){
            return mid;
        }else if(target < array[mid]){
            return binarySearch(array,mid+1,r,target);
        }else if(l>r){
            return -1;
        }else {
           return binarySearch(array,l,mid-1,target);
        }

    }

    public static void main(String[] args) {
        System.out.println(binarySearch(new int[]{12,11,10,8,7,6},0,6,10));
    }

}
