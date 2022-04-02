package com.company.ref.proxy;

import com.company.ref.annotations.Component;

/**
 * @author is Nabeel Tariq Bhatti
 * @created at 4/2/2022
 * @Time at 2:09 PM
 */


@Component
public class Calculator implements CalcultorService {


    @Override
    public int sum(int a, int b) {
        return a+b;
    }
}
