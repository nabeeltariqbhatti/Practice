package com.company.threads.example2;

/**
 * @author is Nabeel Tariq Bhatti
 * @created at 3/6/2022
 * @Time at 1:28 AM
 */
public class DB2Runnable implements Runnable{
    @Override
    public void run() {
        try{
            Thread.sleep(2000);
            System.out.println("DB 2 querying ended");
        }catch (InterruptedException exception){
            System.out.println(exception.getMessage());
        }

    }
}
