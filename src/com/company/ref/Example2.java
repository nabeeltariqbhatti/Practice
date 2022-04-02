package com.company.ref;

import com.company.ref.annotations.Autowired;
import com.company.ref.annotations.Call;
import com.company.ref.service.ProductService;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Arrays;
import java.util.Objects;

/**
 * @author is Nabeel Tariq Bhatti
 * @created at 3/30/2022
 * @Time at 2:22 PM
 */
public class Example2 {
    @Autowired
    public static ProductService productService;


    public static void main(String[] args) {
        String k = "com.company.ref.service.ProductService";

        // Class
        try {
            Class productServiceClass = Class.forName(k);

            Constructor c = productServiceClass.getDeclaredConstructor();
            c.setAccessible(true);

            Object o = c.newInstance();
            Method[] methods = productServiceClass.getDeclaredMethods();
//            for(Method method: methods){
//                if(method.isAnnotationPresent(Call.class)){
//
//                    method.invoke(o);
//                }
//            }

            Class thisClass =  Class.forName("com.company.ref.Example2");

            Field[] fields = thisClass.getDeclaredFields();

            for(Field field:fields){
                if(field.isAnnotationPresent(Autowired.class)){
                    Class<?> type = field.getType();
                    Constructor<?> constructor = type.getDeclaredConstructor();
                    constructor.setAccessible(true);
                    Object o1 = constructor.newInstance();

                    System.out.println(field.get(o1));
                    field.set(new Example2(),(ProductService)o1 );
                    System.out.println(field.get(o1));


                    Arrays.stream(type.getDeclaredMethods()).filter(m->m.isAnnotationPresent(Call.class)).forEach(method -> {
                        try {
                            method.invoke(o1);
                        } catch (IllegalAccessException e) {
                            e.printStackTrace();
                        } catch (InvocationTargetException e) {
                            e.printStackTrace();
                        }
                    });
                }
            }


//            ProductService product = (ProductService) o;
//            product.editingProduct();

//            Method m = productServiceClass.getDeclaredMethod("addProduct");
//            m.invoke(o);

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
