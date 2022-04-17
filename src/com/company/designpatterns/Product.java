package com.company.designpatterns;

import java.math.BigDecimal;

/**
 * @author is Nabeel Tariq Bhatti
 * @created at 4/17/2022
 * @Time at 4:38 PM
 */
public class Product {
    private String name;
    private String color;
    private BigDecimal price;


    @Override
    public String toString() {
        return "Product{" +
                "name='" + name + '\'' +
                ", color='" + color + '\'' +
                ", price=" + price +
                '}';
    }

   public static class Builder{
        static  Product product = new Product();
        public   Builder name(String name){
            product.name = name;
            return this;
        }
        public  Builder color(String color){
            product.color = color;
            return this;
        }
        public  Builder price(BigDecimal price){
            product.price = price;
            return this;
        }

        public  Product build(){
            return product;
        }
    }


}
