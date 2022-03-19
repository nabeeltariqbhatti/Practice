package com.company.threads;

import java.util.concurrent.RecursiveTask;

/**
 * @author is Nabeel Tariq Bhatti
 * @created at 3/16/2022
 * @Time at 10:06 PM
 */
public class FibonacciTask extends RecursiveTask<Integer> {


    private final int n;

    public FibonacciTask(int n) {
        this.n = n;
    }

    @Override
    protected Integer compute() {
        if(n<=1){
            return 1;
        }
        var f1 = new FibonacciTask(n-1);
        var f2 = new FibonacciTask(n-2);
        f1.fork();
        return f1.compute()+f2.join();


    }
}
