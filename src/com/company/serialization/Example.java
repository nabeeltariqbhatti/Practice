package com.company.serialization;

import java.io.*;

/**
 * @author is Nabeel Tariq Bhatti
 * @created at 3/26/2022
 * @Time at 2:33 PM
 */
public class Example {
    public static void main(String[] args) {

        Dog dog =  new Dog("hito", 12);

          Cat cat = new Cat("hellow");
        //serialization
        //try with resources starts with java 7
        try(FileOutputStream fileOutputStream = new FileOutputStream("cat.txt");
            ObjectOutputStream objectOutputStream = new ObjectOutputStream(fileOutputStream)) {

            objectOutputStream.writeObject(cat);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}
