package com.company.binarysearch;

/**
 * @author is Nabeel Tariq Bhatti
 * @created at 3/20/2022
 * @Time at 5:52 PM
 */
public class FindCeilingNumber  {
    public static void main(String[] args) {

        int[] arr = {2,3,5,9,14,16,18};
        int target = 19;
        int ans = ceiling(arr,target);
        System.out.println(ans);

    }

    public static int ceiling(int[] array,int target){

        int start = 0;
        int end = array.length-1;

        if(target > end){
            return -1;
        }
        while(start<=end){
            int mid = start + (end - start)/2;
            if(target < array[mid]){
                end = mid-1;
            }else if(target > array[mid]){
                start = mid+1;
            }else{
                return mid;
            }

        }
        return start;
    }

}
