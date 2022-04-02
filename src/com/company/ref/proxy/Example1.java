package com.company.ref.proxy;

import java.lang.reflect.Proxy;
import java.util.LinkedList;

/**
 * @author is Nabeel Tariq Bhatti
 * @created at 4/2/2022
 * @Time at 1:20 PM
 */
public class Example1 {

    public static void main(String[] args) {
        Animal animal = new Cat();

        Animal animal1 =(Animal) Proxy.newProxyInstance(
                Example1.class.getClassLoader(),
                new Class[]{Animal.class},

                new AnimalInvocationHanler(animal)

                );


        animal.sound();
        animal1.sound();
    }
}
