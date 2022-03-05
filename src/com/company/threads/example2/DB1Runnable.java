package com.company.threads.example2;

/**
 * @author is Nabeel Tariq Bhatti
 * @created at 3/6/2022
 * @Time at 1:28 AM
 */
public class DB1Runnable  implements Runnable{
    @Override
    public void run() {
        try{
            Thread.sleep(3000);
            System.out.println("DB 1 querying ended");
        }catch (InterruptedException exception){
            System.out.println(exception.getMessage());
        }

    }
}
