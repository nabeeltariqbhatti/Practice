package com.company.threads.cyclicbarrier;

import java.util.concurrent.BrokenBarrierException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/**
 * @author is Nabeel Tariq Bhatti
 * @created at 3/19/2022
 * @Time at 3:52 PM
 */
public class CyclicBarrier {
    public static void main(String[] args) {

        java.util.concurrent.CyclicBarrier cyclicBarrier = new java.util.concurrent.CyclicBarrier(3);
        Runnable runnable = ()->{
            try {
                cyclicBarrier.await();
                System.out.println("hello");
            } catch (InterruptedException e) {
                e.printStackTrace();
            } catch (BrokenBarrierException e) {
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
