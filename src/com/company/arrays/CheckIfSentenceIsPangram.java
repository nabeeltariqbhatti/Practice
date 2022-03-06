package com.company.arrays;

/**
 * @author is Nabeel Tariq Bhatti
 * @created at 3/6/2022
 * @Time at 6:04 PM
 */
public class CheckIfSentenceIsPangram {

    public static boolean checkIfPangram(String sentence) {

        for(char alphabet='a'; alphabet<='z';alphabet++){
            if(!sentence.contains(String.valueOf(alphabet))){
                return false;
            }
        }
        return true;

    }
}
