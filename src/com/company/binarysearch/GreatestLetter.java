package com.company.binarysearch;

/**
 * @author is Nabeel Tariq Bhatti
 * @created at 3/20/2022
 * @Time at 8:29 PM
 */
public class GreatestLetter {

    public char nextGreatestLetter(char[] letters, char target) {
        int start = 0;
        int end = letters.length-1;
        while(start<=end){
            int mid = start + (end - start)/2;
            if(target < letters[mid]){
                end = mid-1;
            }else{
                start = mid+1;
            }

        }
        return letters[start%letters.length];

    }
}
