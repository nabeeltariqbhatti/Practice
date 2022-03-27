package com.company.filenio;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

/**
 * @author is Nabeel Tariq Bhatti
 * @created at 3/27/2022
 * @Time at 3:28 PM
 */
public class Example9 {

    public static void main(String[] args) {
        Path path = Paths.get("alpha.txt");
        try {
            Files.createFile(path);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
