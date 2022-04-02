package com.company.ref.proxy;

import com.company.ref.annotations.Aspect;
import com.company.ref.annotations.Component;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Proxy;

/**
 * @author is Nabeel Tariq Bhatti
 * @created at 4/2/2022
 * @Time at 2:38 PM
 */
public class SpringMain {
    public static void main(String[] args) throws ClassNotFoundException, NoSuchMethodException, InvocationTargetException, InstantiationException, IllegalAccessException {
        Class<?> c = Class.forName("com.company.ref.proxy.Calculator");
        Object calculatorAspect = null;
        Object calculator = null;

        Class<?> c1 = Class.forName("com.company.ref.proxy.CalculatorAspect");
        if(c.isAnnotationPresent(Component.class)){
            Constructor<?> declaredConstructor = c.getDeclaredConstructor();
            calculator = declaredConstructor.newInstance();


        }

        if(c1.isAnnotationPresent(Component.class)){
            Constructor<?> declaredConstructor = c.getDeclaredConstructor();
            calculatorAspect  = declaredConstructor.newInstance();

        }
        SpringInvocationHnadler invocationHnadler;
        if(c.isAnnotationPresent(Aspect.class)){
           calculator =  Proxy.newProxyInstance(SpringMain.class.getClassLoader(), new Class[]{c1},new SpringInvocationHnadler(calculator,calculatorAspect) );
        }
        CalcultorService calculator1 = (Calculator) calculator;
        System.out.println(calculator1.sum(1, 3));
    }

}
