package com.company.iostream;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * @author is Nabeel Tariq Bhatti
 * @created at 3/24/2022
 * @Time at 4:26 PM
 */
public class Example2 {

    public static void main(String[] args) {
        //Scanner ->Utility class its not a part of the stream

        //InputStreamReader
        //FileReader



        try ( BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in))) {
            String readLine = bufferedReader.readLine();
            System.out.println(readLine);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
