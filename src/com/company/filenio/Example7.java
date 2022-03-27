package com.company.filenio;

import java.nio.file.Path;
import java.nio.file.Paths;

/**
 * @author is Nabeel Tariq Bhatti
 * @created at 3/27/2022
 * @Time at 3:25 PM
 */
public class Example7 {

    public static void main(String[] args) {
        Path p1 = Paths.get("C:/a/b/c/d");
        Path subpath = p1.subpath(0, 3);
        System.out.println(subpath);

    }
}
