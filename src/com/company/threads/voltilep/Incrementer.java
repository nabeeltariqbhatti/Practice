package com.company.threads.voltilep;

/**
 * @author is Nabeel Tariq Bhatti
 * @created at 3/10/2022
 * @Time at 10:00 PM
 */
public class Incrementer implements Runnable{
    @Override
    public void run() {
        while(true){
            try{
                Main.c++;
                Thread.sleep(1000);
            }catch (InterruptedException exception){
                System.out.println(exception.getMessage());
            }
        }

    }
}
