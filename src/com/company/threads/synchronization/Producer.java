package com.company.threads.synchronization;

import java.util.Random;

/**
 * @author is Nabeel Tariq Bhatti
 * @created at 3/6/2022
 * @Time at 6:21 PM
 */
public class Producer extends Thread{

   public Producer(String name ){
       super(name);
    }
    @Override
    public void run() {
        Random random = new Random();
        while(true){
            synchronized (Main.bucket){//decide which is our monitor
                if(Main.bucket.size()<100){
                    int n =random.nextInt(1000);
                    Main.bucket.add(n);
                    System.out.println("thread " +  Thread.currentThread().getName() + " value added is " + n );
                }
            }

        }
    }
}
