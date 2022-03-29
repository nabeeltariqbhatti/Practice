package com.company.filenio;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.InputStreamReader;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.function.Function;
import java.util.stream.Stream;

/**
 * @author is Nabeel Tariq Bhatti
 * @created at 3/27/2022
 * @Time at 4:26 PM
 */
public class Example14 {

    public static void main(String[] args) {
        try(Stream<String> in = Files.lines(Paths.get("test3.txt"))){


            in.map(new Function<String, String>() {
                @Override
                public String apply(String s) {
                    return s.contains("v") ? s : null;
                }
            }).forEach(System.out::println);
        }catch(Exception e){
            e.printStackTrace();
        }

    }
}
