package com.company.arrays;

import com.company.ref.annotations.Component;

import java.util.Arrays;

/**
 * @author is Nabeel Tariq Bhatti
 * @created at 4/12/2022
 * @Time at 10:28 PM
 */
public class MedianOfSortedArray {

    public static void main(String[] args) {
        System.out.println(-1-1);
    }
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {

        int[] mergedArray = new int[nums1.length + nums2.length];

        if(nums1.length >0){
            System.arraycopy(nums1, 0 , mergedArray,0,nums1.length);
        }
        if(nums2.length >0){
            System.arraycopy(nums2, 0 , mergedArray,nums1.length,nums2.length);
        }
        Arrays.sort(mergedArray);
        System.out.println(Arrays.toString(mergedArray));
        int mid = 0 + (mergedArray.length - 0 )/2;
        if(mergedArray.length==1) return mergedArray[0];
        System.out.println(mid);
        if(mergedArray.length%2==0){
            double result = (mergedArray[mid-1]+mergedArray[mid])/2f;
            return result;
        }
        return mergedArray[mid];

    }
}
