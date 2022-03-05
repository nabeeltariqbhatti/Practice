package com.company.threads.example1;

/**
 * @author is Nabeel Tariq Bhatti
 * @created at 3/6/2022
 * @Time at 1:03 AM
 */
public class OddNumbersRunnable implements Runnable{
    @Override
    public void run() {
        for(int i=1; i<11; i+=2){
           synchronized (Boolean.valueOf("true")){System.out.println("i = " + i+ " " + Thread.currentThread().getName());}
        }
    }
}
