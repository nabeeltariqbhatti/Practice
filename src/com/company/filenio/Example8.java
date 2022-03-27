package com.company.filenio;

import java.nio.file.Path;
import java.nio.file.Paths;

/**
 * @author is Nabeel Tariq Bhatti
 * @created at 3/27/2022
 * @Time at 3:28 PM
 */
public class Example8 {

    public static void main(String[] args) {
        Path path = Paths.get("C:/a/b/c");
        Path path2 = Paths.get("C:/d/e/f");

        //used to go from one path to another

        //when absolute and relative paths dont work with relatavize ---> ilegalArgumentException is thrown.
        System.out.println(path.relativize(path2));
    }
}
