package com.company.threads.ThreradLocalP;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;

/**
 * @author is Nabeel Tariq Bhatti
 * @created at 3/23/2022
 * @Time at 9:22 PM
 */
public class ThreadLocalExample1 {

    static final ThreadLocal<Integer> local
            = ThreadLocal.withInitial(() -> 0);

    public static void main(String[] args) {
        Runnable r1 = () -> {
            while (true) {
                try {
                    local.set(10);  // 10
                    Thread.sleep(2000);
                    System.out.println(Thread.currentThread().getName() + " " + local.get()); // 10
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        };

        Runnable r2 = () -> {
            while (true) {
                try {
                    local.set(20);  // 20
                    Thread.sleep(2000);
                    System.out.println(Thread.currentThread().getName() + " " + local.get()); // 20
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        };

        new Thread(r1).start();
        new Thread(r2).start();
    }
}
