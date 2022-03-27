package com.company.filenio;

import java.nio.file.Path;
import java.nio.file.Paths;

/**
 * @author is Nabeel Tariq Bhatti
 * @created at 3/26/2022
 * @Time at 10:40 PM
 */
public class Example2 {
    public static void main(String[] args) {
         Path p1 = Paths.get("a/b");
         Path p2 = Paths.get("/c/d");
         Path p3 = Paths.get("C:/a/b/c");

        System.out.println(p1.getFileName());
        System.out.println(p1.getRoot());
        System.out.printf("%s", p1.getParent());


        System.out.println(p2.getFileName());
        System.out.println(p2.getRoot());
        System.out.printf("%s", p2.getParent());


    }
}
