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
public class Example12 {

    public static void main(String[] args) {
        Path path = Paths.get("alpha.txt");
        Path path1 =Paths.get("copied.txt");
        try {
            Files.createFile(path);

            Files.createFile(path1);
            boolean sameFile = Files.isSameFile(path, path1);
            System.out.println(sameFile);
//            Files.copy(path,path1);
//            Files.move(path,path1);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
