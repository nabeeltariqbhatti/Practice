package com.company.ref.proxy;

import com.company.ref.annotations.Aspect;
import com.company.ref.annotations.Component;

/**
 * @author is Nabeel Tariq Bhatti
 * @created at 4/2/2022
 * @Time at 2:20 PM
 */
@Component
public class CalculatorAspect {

    @Aspect
    public Object m(){
        return 100;
    }
}
