package com.company.filenio;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.InputStreamReader;

/**
 * @author is Nabeel Tariq Bhatti
 * @created at 3/27/2022
 * @Time at 4:26 PM
 */
public class Example13 {

    public static void main(String[] args) {
        try( BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(new FileInputStream("test3.txt")))){

            String line = null;
            while((line = bufferedReader.readLine() )
            != null){
                System.out.println(line);
            }
        }catch(Exception e){
            e.printStackTrace();
        }

    }
}
