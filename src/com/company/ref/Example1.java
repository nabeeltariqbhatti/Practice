package com.company.ref;

import com.company.ref.service.ProductService;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/**
 * @author is Nabeel Tariq Bhatti
 * @created at 3/30/2022
 * @Time at 2:22 PM
 */
public class Example1 {

    public static void main(String[] args) {
        String k = "com.company.ref.service.ProductService";

        // Class
        try {
            Class productServiceClass = Class.forName(k);

            Constructor c = productServiceClass.getDeclaredConstructor();
            c.setAccessible(true);

            Object o = c.newInstance();
            ProductService product = (ProductService) o;
            product.editingProduct();

            Method m = productServiceClass.getDeclaredMethod("addProduct");
            m.invoke(o);

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
