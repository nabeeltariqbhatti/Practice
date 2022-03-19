package com.company.threads.executorservices;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

/**
 * @author is Nabeel Tariq Bhatti
 * @created at 3/13/2022
 * @Time at 7:36 PM
 */
public class ExecutorServiceTypes {

    public static void main(String[] args) throws InterruptedException {
        ExecutorService executorService1 = Executors.newFixedThreadPool(Runtime.getRuntime().availableProcessors());
        ExecutorService executorService2 = Executors.newSingleThreadExecutor();
        ExecutorService executorService3 = Executors.newCachedThreadPool();
        ExecutorService executorService4 = Executors.newWorkStealingPool();


        ScheduledExecutorService executorService6 = Executors.newSingleThreadScheduledExecutor();
//        ScheduledExecutorService executorService5 = Executors.newScheduledThreadPool(Runtime.getRuntime().availableProcessors());

        Runnable runnable = new Runnable() {
            @Override
            public void run() {
                System.out.println("hello world");
            }
        };

        executorService6.scheduleAtFixedRate(runnable,1,1000, TimeUnit.MILLISECONDS);
        executorService6.scheduleWithFixedDelay(runnable,1,1000,TimeUnit.MILLISECONDS);
        Thread.sleep(2000*10);

        executorService6.shutdown();





    }
}
