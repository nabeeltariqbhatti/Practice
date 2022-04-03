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


    public SpringInvocationHnadler(Object aspect) {
        this.aspect = aspect;
    }

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        Class<?> c1 = aspect.getClass();
        Method[] declaredMethods = c1.getDeclaredMethods();
        for (Method declaredMethod : declaredMethods) {
            System.out.println(declaredMethod.getName());
            if(declaredMethod.isAnnotationPresent(Aspect.class)){
                System.out.println(declaredMethod.getName());
                System.out.println(declaredMethod.invoke(c1.getDeclaredConstructor().newInstance(), CalcultorService.class));
            }

        }
        return null;
    }
}
