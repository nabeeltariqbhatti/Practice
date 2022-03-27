package com.company.filenio;

import java.nio.file.Path;
import java.nio.file.Paths;

/**
 * @author is Nabeel Tariq Bhatti
 * @created at 3/27/2022
 * @Time at 2:16 PM
 */
//relative and absolute paths resolving
public class Example5 {
    public static void main(String[] args) {
        Path path = Paths.get("/a/b/c");
        Path path1 = Paths.get("d/e/f");
        Path path2 = path.resolve(path1);

        System.out.println(path2);

        System.out.println(path1.resolve(path));// /a/b/c


        //when both paths are absolute

        System.out.println(path.resolve(Paths.get("/d/e"))); //only second path will remain


    }
}
