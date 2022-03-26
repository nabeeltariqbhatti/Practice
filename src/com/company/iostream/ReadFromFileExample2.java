package com.company.iostream;

import java.io.*;
import java.net.URL;
import java.net.http.HttpHeaders;
import java.net.http.HttpRequest;
import java.nio.file.Files;
import java.nio.file.Paths;

/**
 * @author is Nabeel Tariq Bhatti
 * @created at 3/24/2022
 * @Time at 9:02 PM
 */
public class ReadFromFileExample2 {

    public static void main(String[] args) {



       // try (BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(new FileInputStream("file2.txt")))) {

//            bufferedReader.lines().forEach(System.out::println);
            String line = null;
//            while(bufferedReader.readLine()!=null){
//
//            }
//        }catch (Exception e){
//             e.printStackTrace()
//        }
//
//        try(PrintStream printStream = new PrintStream("test3.txt")){
//
//            printStream.println("hello brpo");
//        }catch (Exception e){
//            e.printStackTrace();
//        }
//
//        try(PrintWriter printStream = new PrintWriter( new FileOutputStream("test5.txt", true))){
//
//            printStream.println("hello brpo");
//        }catch (Exception e){
//            e.printStackTrace();
//        }

            try (InputStream inputStream = new URL("https://www.w3.org/WAI/ER/tests/xhtml/testfiles/resources/pdf/dummy.pdf").openStream()) {
                Files.copy(inputStream, Paths.get("test.pdf"));
            } catch (Exception e) {
                e.printStackTrace();
            }


        }
    }

