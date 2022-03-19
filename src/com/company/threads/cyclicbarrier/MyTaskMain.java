package com.company.threads.cyclicbarrier;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/**
 * @author is Nabeel Tariq Bhatti
 * @created at 3/19/2022
 * @Time at 2:46 PM
 */
public class MyTaskMain {

    public static void main(String[] args) throws InterruptedException {

        MyTask myTask = new MyTask();

        ExecutorService service = Executors.newFixedThreadPool(100);

        MyTask t = new MyTask();

        service.submit(t);
        Thread.sleep(1000);
        service.submit(t);
        Thread.sleep(1000);
        service.submit(t);

        service.shutdown();

    }
}
