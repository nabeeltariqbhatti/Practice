package com.company.threads.synchronization;

import java.util.ArrayList;
import java.util.List;

/**
 * @author is Nabeel Tariq Bhatti
 * @created at 3/6/2022
 * @Time at 6:19 PM
 */
public class Main {
    public static List<Integer> bucket = new ArrayList<>();

    public static void main(String[] args) {

        Producer p1 = new Producer("p1");
        Producer p2 = new Producer("p2");
        Consumer c2 = new Consumer("c1");
        Consumer c3 = new Consumer("c2");

        p1.start();
        p2.start();
        c2.start();
        c3.start();
        A a = new A();
        new Thread(new Runnable() {
            @Override
            public void run() {
                a.m1();
            }
        }).start();

        new Thread(new Runnable() {
            @Override
            public void run() {
                a.m2();
            }
        }).start();
    }
}
