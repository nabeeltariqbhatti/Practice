package com.company.iostream;

import java.io.*;

/**
 * @author is Nabeel Tariq Bhatti
 * @created at 3/24/2022
 * @Time at 9:02 PM
 */
public class ReadFromFileExample2 {

    public static void main(String[] args) {

        try(BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(new FileInputStream("file2.txt")))){

//            bufferedReader.lines().forEach(System.out::println);
            String line = null;
            while( (line = bufferedReader.readLine())!=null){
                System.out.println(line);
            }
        }catch (Exception e){
             e.printStackTrace();
        }
    }
}
