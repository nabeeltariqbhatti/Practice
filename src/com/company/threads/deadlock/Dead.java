package com.company.threads.deadlock;

/**
 * @author is Nabeel Tariq Bhatti
 * @created at 3/11/2022
 * @Time at 11:15 PM
 */
public class Dead {

    public Object a = new Object();
    public Object b = new Object();

    public void m1(){
        synchronized (a){
            synchronized (b){

            }
        }
    }

    //no deadlock can occur when you keep things in order
    public void m2(){
        synchronized (a){
            synchronized (b){

            }
        }

    }
}
