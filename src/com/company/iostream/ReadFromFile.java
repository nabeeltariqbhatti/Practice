package com.company.iostream;

import java.io.*;

/**
 * @author is Nabeel Tariq Bhatti
 * @created at 3/24/2022
 * @Time at 9:02 PM
 */
public class ReadFromFile {

    /*
      file outputstream and file input stream

       BufferedWriter
       BufferReader
       printStream -------> System.out/System.err
       PrintWriter
     */

    public static void main(String[] args) throws IOException, FileNotFoundException {

        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter("file2.txt"));
        bufferedWriter.write("hello how are you 2");

        BufferedReader bufferedReader = new BufferedReader(new FileReader("file.txt"));

        bufferedReader.lines().forEach(System.out::println);

        bufferedWriter.flush();
        for(String line : bufferedReader.lines().toList()){
            System.out.println(line);
        }
        bufferedReader.close();
        bufferedWriter.close();

    }
}
