package com.company.threads.oncurrentc;

import java.util.Deque;
import java.util.Queue;
import java.util.concurrent.ConcurrentLinkedDeque;
import java.util.concurrent.ConcurrentLinkedQueue;

/**
 * @author is Nabeel Tariq Bhatti
 * @created at 3/24/2022
 * @Time at 1:47 PM
 */
public class ConQueueAndDeque {
    public static void main(String[] args) {
        Queue<Integer> q = new ConcurrentLinkedQueue<>(); //ordered not sorted
        Deque<Integer> d = new ConcurrentLinkedDeque<>(); //ordered not sorted
    }
}
