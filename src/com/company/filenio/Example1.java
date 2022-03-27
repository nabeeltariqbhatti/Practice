package com.company.filenio;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

/**
 * @author is Nabeel Tariq Bhatti
 * @created at 3/26/2022
 * @Time at 10:24 PM
 */
public class Example1 {

    public static void main(String[] args) throws IOException {
        Path path = Paths.get("cat.txt");
        Path p2 = Paths.get("a", "b","c");
        System.out.println(path);
        Files.copy(path, Path.of("oka.txt"));
    }
}
