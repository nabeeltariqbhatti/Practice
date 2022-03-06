package com.company.arrays;

import java.util.List;

/**
 * @author is Nabeel Tariq Bhatti
 * @created at 3/6/2022
 * @Time at 11:28 PM
 */
public class CountMatches {
    public int countMatches(List<List<String>> items, String ruleKey, String ruleValue) {
        int counter = 0;
        for(List<String> item:items){
            if(ruleKey.equalsIgnoreCase("color")){
                if(item.get(1).equalsIgnoreCase(ruleValue)){
                    counter++;
                }
            }else  if(ruleKey.equalsIgnoreCase("type")){
                if(item.get(0).equalsIgnoreCase(ruleValue)){
                    counter++;
                }
            }else{
                if(item.get(2).equalsIgnoreCase(ruleValue)){
                    counter++;
                }
            }
        }
        return counter;
    }
}

