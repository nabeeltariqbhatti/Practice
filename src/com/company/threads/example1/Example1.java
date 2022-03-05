package com.company.threads.example1;

/**
 * @author is Nabeel Tariq Bhatti
 * @created at 3/6/2022
 * @Time at 1:03 AM
 */
public class Example1 {
    public static void main(String[] args) throws InterruptedException {
        var oddNumber = new OddNumbersRunnable();

        var t1 = new Thread(oddNumber,"Odd Number thread T1");
        var t2 = new Thread(oddNumber,"Odd Number thread T2");
        t1.start();

        t2.start();
    }
}
