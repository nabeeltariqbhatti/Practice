package com.company.threads;

import java.util.concurrent.ForkJoinPool;

/**
 * @author is Nabeel Tariq Bhatti
 * @created at 3/16/2022
 * @Time at 10:13 PM
 */
public class FibbonMain {


    public static void main(String[] args) {
        ForkJoinPool forkJoinPool = new ForkJoinPool();
        Integer invoke = forkJoinPool.invoke(new FibonacciTask(8));
        System.out.println(invoke);
    }
}
