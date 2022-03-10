package com.company.threads.synchronization;

/**
 * @author is Nabeel Tariq Bhatti
 * @created at 3/6/2022
 * @Time at 6:25 PM
 */
public class Consumer extends  Thread{

    public Consumer(String name) {
        super(name);
    }

    @Override
    public void run() {
        try{

            while (true){
                synchronized (Main.bucket){
                    if(!Main.bucket.isEmpty()){
                        int n = Main.bucket.get(0);
                        Main.bucket.remove(0);
                        Main.bucket.notifyAll();
                        System.out.println("thread " + Thread.currentThread().getName() + " took value from bucket");
                    }else {
                        Main.bucket.wait();
                    }
                }

            }
        }catch (Exception exception){

        }
    }
}
