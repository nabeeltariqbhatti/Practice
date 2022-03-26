package com.company.serialization;

import java.io.*;

/**
 * @author is Nabeel Tariq Bhatti
 * @created at 3/26/2022
 * @Time at 2:33 PM
 */
public class Example {
    public static void main(String[] args) {

        Cat cat = new Cat("cato");


        //serialization
        //try with resources starts with java 7
        try(FileOutputStream fileOutputStream = new FileOutputStream("cat1.txt");
            ObjectOutputStream objectOutputStream = new ObjectOutputStream(fileOutputStream)) {

            objectOutputStream.writeObject(cat);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }

        //deserialize object
        try(FileInputStream fileInputStream = new FileInputStream("cat1.txt"); ObjectInputStream objectInputStream = new ObjectInputStream(fileInputStream)){

            Cat cat2 = (Cat)objectInputStream.readObject();
            System.out.println(cat2.getName());
        }catch (Exception e){
            e.printStackTrace();
        }
    }
}
