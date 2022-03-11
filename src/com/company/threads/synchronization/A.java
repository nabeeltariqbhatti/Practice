package com.company.threads.synchronization;

/**
 * @author is Nabeel Tariq Bhatti
 * @created at 3/11/2022
 * @Time at 10:22 PM
 */
public class A {
    public void m1(){
        synchronized (this){
            System.out.println("A");
        }
    }

    public synchronized void m2(){

            System.out.println("B");

    }

    public static void classy(){
        synchronized (A.class){

        }
    }
}
