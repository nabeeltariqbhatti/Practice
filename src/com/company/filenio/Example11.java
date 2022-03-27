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
public class Example11 {

    public static void main(String[] args) {
        Path path = Paths.get("alpha.txt");
        Path path1 =Paths.get("copied.txt");
        try {
//            Files.copy(path,path1);
            Files.move(path,path1);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
