package com.company.threads.executorservices;

import java.util.Objects;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/**
 * @author is Nabeel Tariq Bhatti
 * @created at 3/11/2022
 * @Time at 11:45 PM
 */
public class Service {

    public static void main(String[] args) {
        int n = Runtime.getRuntime().availableProcessors();
        System.out.println(n);
        ExecutorService executorService = Executors.newFixedThreadPool(n);//pool //4 threads
        try{
            executorService.execute(()-> System.out.println("hello" + Thread.currentThread().getName()));

        }catch (Exception ex){
            System.out.println(ex.getMessage());
        }finally {
            assert executorService !=null;
            executorService.shutdown();
        }

    }
}
