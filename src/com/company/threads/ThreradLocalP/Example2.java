package com.company.threads.ThreradLocalP;

/**
 * @author is Nabeel Tariq Bhatti
 * @created at 3/23/2022
 * @Time at 9:39 PM
 */
public class Example2 {

    private final static  ThreadLocal<Transaction> threadLocal = new ThreadLocal<>();
    public static void main(String[] args) {

    }
    void m1(){
        Transaction transaction = new Transaction();

        threadLocal.set(transaction);
        m2();
    }

    void m2(){

        threadLocal.get();
        //t
    }
}

class Transaction{

}
