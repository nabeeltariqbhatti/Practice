package com.company.ref.proxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

/**
 * @author is Nabeel Tariq Bhatti
 * @created at 4/2/2022
 * @Time at 1:25 PM
 */
public class AnimalInvocationHanler implements InvocationHandler {
    private final Animal animal;

    public AnimalInvocationHanler(Animal animal) {
        this.animal = animal;
    }

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        System.out.println("hello");
        animal.sound();
        System.out.println("bye");
        return null;
    }
}
