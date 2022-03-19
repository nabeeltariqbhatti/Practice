package com.company.threads.cyclicbarrier;

import java.util.concurrent.CyclicBarrier;

/**
 * @author is Nabeel Tariq Bhatti
 * @created at 3/19/2022
 * @Time at 2:44 PM
 */


public class MyTask  implements Runnable{

    private CyclicBarrier barrier;

    public MyTask() {
        barrier = new CyclicBarrier(3);
    }

    @Override
    public void run() {
        try {
            barrier.await(); // barrier blocks your threads
            System.out.println(":)");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
