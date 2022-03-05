package com.company.threads.example2;

/**
 * @author is Nabeel Tariq Bhatti
 * @created at 3/6/2022
 * @Time at 1:27 AM
 */
public class Example2 {
    public static void main(String[] args) throws InterruptedException {

        var db1= new DB1Runnable();
        var db2 = new DB2Runnable();
        var t1 = new Thread(db1);
        var t2 = new Thread(db2);

        t1.start();
        t2.start();
        t1.join();t2.join();
        System.out.println("Processing.........");
    }
}
