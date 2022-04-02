package com.company.ref.proxy;

import com.company.ref.annotations.Aspect;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

/**
 * @author is Nabeel Tariq Bhatti
 * @created at 4/2/2022
 * @Time at 3:01 PM
 */
public class SpringInvocationHnadler implements InvocationHandler {

    private final  Object aspect;
    private final Object bean;

    public SpringInvocationHnadler(Object aspect, Object bean) {
        this.aspect = aspect;
        this.bean = bean;
    }

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        Class<?> c1 = Class.forName("com.company.ref.proxy.CalculatorAspect");
        Method[] declaredMethods = c1.getDeclaredMethods();
        for (Method declaredMethod : declaredMethods) {
            if(declaredMethod.isAnnotationPresent(Aspect.class)){
                System.out.println(declaredMethod.getName());
                System.out.println(declaredMethod.invoke(c1.getDeclaredConstructor().newInstance(), CalcultorService.class));
            }

        }
        return null;
    }
}
