package com.company.filenio;

import java.nio.file.Path;
import java.nio.file.Paths;

/**
 * @author is Nabeel Tariq Bhatti
 * @created at 3/27/2022
 * @Time at 1:39 PM
 */
public class Example3 {

    public static void main(String[] args) {
        Path path = Paths.get("a/b/c/./././d/../../c");
        System.out.println(path.normalize());

        Path path2 = Paths.get("/a/b/c/./././d/../../c");
        System.out.println(path2.normalize());

    }
}
