package com.company.threads.synchronization;

/**
 * @author is Nabeel Tariq Bhatti
 * @created at 3/11/2022
 * @Time at 10:21 PM
 */
public class SynchronizeOnMethod {

    Object object = new Object();

    public synchronized void setObject(Object object) {
        this.object = object;
    }
}
