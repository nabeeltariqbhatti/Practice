package com.company.filenio;

import java.nio.file.Path;
import java.nio.file.Paths;

/**
 * @author is Nabeel Tariq Bhatti
 * @created at 3/27/2022
 * @Time at 2:16 PM
 */
public class Example4 {
    public static void main(String[] args) {
        Path path = Paths.get("a/b/c");
        Path path2 = Paths.get("d/e/f");
        Path path1 = path.resolve(path2);

        System.out.println(path1);

        path1 = path2.resolve(path);
        System.out.println(path1);


    }
}
