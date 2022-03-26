package com.company.serialization;

import java.io.*;

/**
 * @author is Nabeel Tariq Bhatti
 * @created at 3/26/2022
 * @Time at 2:33 PM
 */
public class Example2 {
    public static void main(String[] args) {
        //deserialize object
        try(FileInputStream fileInputStream = new FileInputStream("cat1.txt"); ObjectInputStream objectInputStream = new ObjectInputStream(fileInputStream)){

            Cat cat2 = (Cat)objectInputStream.readObject();
            System.out.println(cat2);
        }catch (IOException  | ClassNotFoundException e){
            e.printStackTrace();
        }
    }
}
