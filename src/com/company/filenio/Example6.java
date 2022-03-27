package com.company.filenio;

import java.nio.file.Path;
import java.nio.file.Paths;

/**
 * @author is Nabeel Tariq Bhatti
 * @created at 3/27/2022
 * @Time at 3:21 PM
 */
public class Example6 {

    public static void main(String[] args) {
        Path p1 = Paths.get("C:/a/b/c/d");
        for(int i =0; i<p1.getNameCount(); i++){
            System.out.println(p1.getName(i));
        }
    }
}
