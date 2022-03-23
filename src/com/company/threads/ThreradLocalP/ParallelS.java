package com.company.threads.ThreradLocalP;

import java.util.stream.Stream;

/**
 * @author is Nabeel Tariq Bhatti
 * @created at 3/23/2022
 * @Time at 10:00 PM
 */
public class ParallelS {
    public static void main(String[] args) {
        Stream.of(1,2,3,4,5,6,7,8,10).parallel().forEach(n->{
            System.out.println(n + " " + Thread.currentThread().getName());
        });
    }

}
