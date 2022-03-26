package com.company.serialization;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;

/**
 * @author is Nabeel Tariq Bhatti
 * @created at 3/26/2022
 * @Time at 3:04 PM
 */
public class Example3 {

    //transient keyword
    public static void main(String[] args) {
        //deserialize object
        try(FileInputStream fileInputStream = new FileInputStream("dog.txt"); ObjectInputStream objectInputStream = new ObjectInputStream(fileInputStream)){

            Dog dog = (Dog)objectInputStream.readObject();
            System.out.println(dog);
        }catch (IOException | ClassNotFoundException e){
            e.printStackTrace();
        }
    }
}
