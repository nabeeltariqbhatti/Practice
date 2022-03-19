package com.company.threads.executorservices;

import java.util.concurrent.*;

/**
 * @author is Nabeel Tariq Bhatti
 * @created at 3/13/2022
 * @Time at 2:26 PM
 */
public class RunnableCallable {
    public static void main(String[] args) {
        ExecutorService executorService = Executors.newFixedThreadPool(Runtime.getRuntime().availableProcessors());

        Future<?> future = executorService.submit(() -> System.out.println("(:"));
        try{
            Callable<Integer> summingCallable = new SummingCallable(1,2);
            Future<Integer> integerFuture = executorService.submit(summingCallable);

            System.out.println(integerFuture.get());
            future.get();
        }catch (InterruptedException e){
            System.out.println(e.getMessage());
        }catch (ExecutionException exception){
            System.out.println(exception);
        }
        
        Callable<String> c = ()->"Hello world!";
        Future<String> f = executorService.submit(c);

        try{
            System.out.println(f.get());
        }catch (InterruptedException e){
            System.out.println(e.getMessage());
        }catch (ExecutionException exception){
            System.out.println(exception);
        }finally {
            executorService.shutdown();

        }

    }
}
