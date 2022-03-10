package com.company.threads.voltilep;

/**
 * @author is Nabeel Tariq Bhatti
 * @created at 3/10/2022
 * @Time at 10:00 PM
 */
public class Decrementer implements Runnable{
    @Override
    public void run() {

        try{
            while (true){

                System.out.println(Main.c);
                Thread.sleep(1000);
            }
        }catch (Exception exception){
            System.out.println(exception.getMessage());
        }

    }
}
