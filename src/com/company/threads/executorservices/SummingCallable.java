package com.company.threads.executorservices;

import java.util.concurrent.Callable;

/**
 * @author is Nabeel Tariq Bhatti
 * @created at 3/13/2022
 * @Time at 3:12 PM
 */
public class SummingCallable implements Callable<Integer> {


    private Integer x,y;

    public SummingCallable(Integer x, Integer y) {
        this.x = x;
        this.y = y;
    }

    @Override
    public Integer call() throws Exception {
        return x+y;
    }
}
