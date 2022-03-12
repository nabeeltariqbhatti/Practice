package com.company.threads.executorservices;

import java.util.ArrayList;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

/**
 * @author is Nabeel Tariq Bhatti
 * @created at 3/12/2022
 * @Time at 12:43 AM
 */
public class SubmitMethodWithService {
    public static void main(String[] args) {
        int n = Runtime.getRuntime().availableProcessors();
        System.out.println(n);
        ExecutorService executorService = Executors.newFixedThreadPool(n);//pool //4 threads
        try{
            Future<?> f = executorService.submit(()-> System.out.println("hello" + Thread.currentThread().getName()));


        }catch (Exception ex){
            System.out.println(ex.getMessage());
        }finally {
            assert executorService !=null;
            executorService.shutdown();
        }
    }
}
