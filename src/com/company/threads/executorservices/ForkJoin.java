package com.company.threads.executorservices;

import java.util.List;
import java.util.Random;
import java.util.concurrent.ForkJoinPool;
import java.util.concurrent.RecursiveAction;
import java.util.stream.Stream;

/**
 * @author is Nabeel Tariq Bhatti
 * @created at 3/13/2022
 * @Time at 8:42 PM
 */
public class ForkJoin {
    /*
    ForkJoinPool -> thread pool
    Task -> T1->(T1.1,T1.2),T2->(T2.1,T2.2)
    RecursiveAction ----> Runnable
    RecursiveTask<T> -------> Callable<T>
    Scenario : having a list,
    print in the console the values from list doubled
     */
    public static void main(String[] args) {

        List<Integer> list = Stream.generate(()->new Random().nextInt(1000)).limit(900).toList();
        ForkJoinPool forkJoinPool = new ForkJoinPool();
        forkJoinPool.invoke(new DoubleRecursiveAction(list));

    }

}

