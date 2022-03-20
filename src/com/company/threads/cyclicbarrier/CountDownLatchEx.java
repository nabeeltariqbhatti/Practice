package com.company.threads.cyclicbarrier;

import java.util.concurrent.BrokenBarrierException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import  java.util.concurrent.CountDownLatch;
/**
 * @author is Nabeel Tariq Bhatti
 * @created at 3/19/2022
 * @Time at 3:52 PM
 */
public class CountDownLatchEx {
    public static void main(String[] args) {

       CountDownLatch countDownLatch = new CountDownLatch(3);
        Runnable runnable = ()->{
            try {
                countDownLatch.countDown();
                countDownLatch.await();
                System.out.println("hello");
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        };
        ExecutorService executorService = Executors.newFixedThreadPool(4);

        executorService.submit(runnable);
        executorService.submit(runnable);
        executorService.submit(runnable);
        executorService.shutdown();


    }
}
